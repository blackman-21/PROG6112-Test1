import java.util.Scanner;

public class AccidentReport {
    public static void main(String[] args) {
        // Define city names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // 2D array to store accidents for cars and motorbikes
        int[][] accidents = new int[3][2]; // 3 cities, 2 types of vehicles (cars and motorbikes)
        // Single-dimensional array to store the total number of accidents in each city
        int[] totalAccidentsPerCity = new int[3];

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input accidents for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter the number of car accidents in " + cities[i] + ": ");
            accidents[i][0] = scanner.nextInt(); // Input for cars

            System.out.println("Enter the number of motorbike accidents in " + cities[i] + ": ");
            accidents[i][1] = scanner.nextInt(); // Input for motorbikes

            // Calculate total accidents per city (cars + motorbikes)
            totalAccidentsPerCity[i] = accidents[i][0] + accidents[i][1];
        }

        // Display the report
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\nROAD ACCIDENT REPORT:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("City              Car Accidents     Motorbike Accidents   Total Accidents");


        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s %-17d %-19d %-10d\n", cities[i], accidents[i][0], accidents[i][1], totalAccidentsPerCity[i]);
        }

        // Calculate and display totals for all cities
        int totalCarAccidents = 0, totalMotorbikeAccidents = 0, overallTotalAccidents = 0;
        int cityWithMaxAccidentsIndex = 0;

        for (int i = 0; i < cities.length; i++) {
            totalCarAccidents += accidents[i][0];
            totalMotorbikeAccidents += accidents[i][1];
            overallTotalAccidents += totalAccidentsPerCity[i];

            // Determine the city with the highest number of total accidents
            if (totalAccidentsPerCity[i] > totalAccidentsPerCity[cityWithMaxAccidentsIndex]) {
                cityWithMaxAccidentsIndex = i;
            }
        }

        // Display total accidents and the city with the highest number of accidents
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\nTotal Car Accidents: " + totalCarAccidents);
        System.out.println("Total Motorbike Accidents: " + totalMotorbikeAccidents);
        System.out.println("Overall Total Accidents: " + overallTotalAccidents);
        System.out.println("City with the highest number of accidents: " + cities[cityWithMaxAccidentsIndex]);
        System.out.println("--------------------------------------------------------------------------");
        scanner.close();
    }
}
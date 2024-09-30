// Define the RunApplication class to test the program
public class RunApplication {
    public static void main(String[] args) {
        // Prompt user for input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total number of accidents for " + vehicleType + " in " + city + ": ");
        int accidentTotal = scanner.nextInt();

        // Create an instance of RoadAccidentReport and print the report
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();
    }
}

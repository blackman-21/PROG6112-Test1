// Define the IRoadAccidents interface
public interface IRoadAccidents {
    String getAccidentVehicleType();
    String getCity();
    int getAccidentTotal();
}

// Define the abstract class RoadAccidents which implements IRoadAccidents
abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    // Constructor to accept vehicle type, city, and number of accidents
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Getter methods to get the vehicle type, city, and accident total
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }

    // Abstract method to print accident report
    public abstract void printAccidentReport();
}

// Define the RoadAccidentReport class that extends RoadAccidents
class RoadAccidentReport extends RoadAccidents {

    // Constructor to accept vehicle type, city, and number of accidents
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Displaying report by implement the printAccidentReport method
    @Override
    public void printAccidentReport() {
        System.out.println("\nVEHICLE ACCIDENT REPORT");
        System.out.println("*************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL ACCIDENTS: " + getAccidentTotal());
        System.out.println("*************************");
    }
}


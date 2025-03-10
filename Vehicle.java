public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0; // Default registration fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0); // Updating registration fee
        
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * dailyRate;
    }
}

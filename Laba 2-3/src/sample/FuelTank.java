package sample;

/**
 * Class "Топливный бак".
 */
public class FuelTank extends Detail {
    private double capacity;
    private double fuelQuantity;

    public FuelTank(double mass, double capacity, double fuelQuantity) {
        super(mass);
        this.capacity = capacity;
        this.fuelQuantity = fuelQuantity;
    }

    /**
     * Method "Залить топливо".
     * @return false if not enough fuel
     */
    @Override
    public boolean relineFuel() {
        System.out.println("5 литров запрошено");
        if (fuelQuantity >= 5) {
            fuelQuantity -= 5;
            System.out.println("5 литров отдано. Осталось " + fuelQuantity + " литров.");
            return true;
        } else {
            return false;
        }
    }
}

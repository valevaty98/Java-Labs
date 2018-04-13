package sample;

import javafx.scene.control.Label;

/**
 * Class "Топливный бак".
 */
public class FuelTank extends Detail {
    private double capacity;
    private double fuelQuantity;

    public FuelTank(final double mass, final double capacity, final double fuelQuantity) {
        super(mass);
        this.capacity = capacity;
        this.fuelQuantity = fuelQuantity;
    }

    /**
     * Method "Залить топливо".
     * @return false if not enough fuel
     */
    @Override
    public boolean relineFuel(Label processLabel) {
        if (fuelQuantity >= 5) {
            fuelQuantity -= 5;
            processLabel.setText(processLabel.getText() + "5 литров отдано. Осталось " + fuelQuantity + " литров.\n");
            return true;
        } else {
            return false;
        }
    }
}

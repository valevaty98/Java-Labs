package sample;

import javafx.scene.control.Label;

/**
 * Conatainer for Auto details.
 */
public class Auto {
    String name;
    Detail wheel;
    Detail engine;
    Detail fuelTank;
    Detail body;

    Auto(final String name) {
        this.name = name;
        wheel = new Wheel(2.3);
        engine = new Engine(4.5);
        fuelTank = new FuelTank(4.5, 50, 20);
        body = new Body(4.5, 4);
    }

    /**
     * @param isTheCarReady - true, if the car is ready to ride
     * @param processLabel - Label for setting a text
     * @return true, if car can ride
     */
    public boolean ride(final boolean isTheCarReady, final Label processLabel) {
        if (isTheCarReady) {
            return engine.run(wheel, fuelTank, processLabel);
        } else {
            return false;
        }
    }

    /**
     * stop moving
     * @param processLabel- Label for setting a text
     */
    public void stop(final Label processLabel) {
        engine.stopRunning(wheel, processLabel);
    }
}

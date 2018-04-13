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

    public boolean ride(final boolean isTheCarReady, final Label processLabel) {
        if (isTheCarReady) {
            return engine.run(wheel, fuelTank, processLabel);
        } else {
            return false;
        }
    }

    public void stop(final Label processLabel) {
        engine.stopRunning(wheel, processLabel);
    }
}

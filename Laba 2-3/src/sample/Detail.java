package sample;

import javafx.scene.control.Label;

/**
 * Abstract class for all details
 * of Auto.
 */
public abstract class Detail {
    private double mass;

    public Detail(final double mass) {
        this.mass = mass;
    }

    ;

    public void test() {
    }

    ;

    public void rotate(Label processLabel) {
    }

    ;

    public boolean run(final Detail wheel, final Detail fuelTank, Label processLabel) {
        return true;
    }

    public boolean relineFuel(Label processLabel) {
        return true;
    }

    public void stopRotate(Label processLabel) {
    }

    ;

    public void stopRunning(Detail wheel, Label processLabel) {
    }

    ;
}

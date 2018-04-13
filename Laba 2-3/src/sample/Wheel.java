package sample;

import javafx.scene.control.Label;

/**
 * A detail of Auto
 */
public class Wheel extends Detail {
    boolean isInflate;
    public Wheel(final double mass) {
        super(mass);
        isInflate = false;
    }

    /**
     * @param processLabel - Label for writing info
     */
    @Override
    public void rotate(Label processLabel) {
        processLabel.setText(processLabel.getText() + "Колеса крутятся\n");
    }

    /**
     * @param processLabel - Label for writing info
     */
    @Override
    public void stopRotate(final Label processLabel) {
        processLabel.setText(processLabel.getText() + "Колеса перестали крутится");
    }
}

package sample;

import javafx.scene.control.Label;

public class Wheel extends Detail {
    boolean isInflate;
    public Wheel(final double mass) {
        super(mass);
        isInflate = false;
    }

    @Override
    public void rotate(Label processLabel) {
        processLabel.setText(processLabel.getText() + "Колеса крутятся\n");
    }

    @Override
    public void stopRotate(final Label processLabel) {
        processLabel.setText(processLabel.getText() + "Колеса перестали крутится");
    }
}

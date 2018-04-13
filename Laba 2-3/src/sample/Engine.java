package sample;

import javafx.scene.control.Label;

/**
 * Class Engine is a detail of Auto.
 */
public class Engine extends Detail {
    private boolean isEngineStart;

    Engine(double mass) {
        super(mass);
        isEngineStart = false;
    }

    /**
     * The engine runs.
     * @param wheel - wheel of the Auto
     * @param fuelTank - tank of the Auto
     * @return boolean
     */
    @Override
    public boolean run(Detail wheel, Detail fuelTank, Label processLabel) {
        if (!isEngineStart) {
            startRunning(processLabel);
        }
        processLabel.setText(processLabel.getText() + "Двигатель работает\n");
        if (fuelTank.relineFuel(processLabel)) {
            wheel.rotate(processLabel);
            return true;
        } else {
            processLabel.setText(processLabel.getText() + "Недостаточно топлива");
            return false;
        }
    }

    /**
     * Starts the engine.
     * @param processLabel - label of the process
     */
    public void startRunning(Label processLabel) {
        processLabel.setText(processLabel.getText() + "Двигатель заведен\n");
        isEngineStart = true;
    }

    /**
     * Stops the engine.
     */
    @Override
    public void stopRunning(final Detail wheel,final Label processLabel) {
        processLabel.setText(processLabel.getText() + "Двигатель остановлен\n");
        isEngineStart = false;
        wheel.stopRotate(processLabel);
    }
}

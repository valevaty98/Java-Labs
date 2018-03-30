package sample;

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
    public boolean run(Detail wheel, Detail fuelTank) {
        if (!isEngineStart) {
            startRunning();
        }
        System.out.println("Двигатель работает");
        if (fuelTank.relineFuel()) {
            wheel.rotate();
            return true;
        } else {
            System.out.println("Недостаточно топлива");
            return false;
        }
    }

    /**
     * Starts the engine.
     */
    public void startRunning() {
        System.out.println("\nДвигатель заведен");
        isEngineStart = true;
    }

    /**
     * Stops the engine.
     */
    @Override
    public void stopRunning(Detail wheel) {
        System.out.println("\nДвигатель остановлен");
        isEngineStart = false;
        wheel.stopRotate();
    }
}

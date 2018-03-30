package sample;

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

    public boolean ride(boolean isTheCarReady) {
        //if (isTheCarReady) {
            return engine.run(wheel, fuelTank);
        //} else {

        //    return false;
       // }
    }

    public void stop() {
        engine.stopRunning(wheel);
    }
}

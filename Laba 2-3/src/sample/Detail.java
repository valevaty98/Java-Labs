package sample;

/**
 * Abstract class for all details
 * of Auto.
 */
public abstract class Detail {
    private double mass;

    public Detail(double mass) {
    }

    ;

    public void test() {
    }

    ;

    public void rotate() {
    }

    ;

    public boolean run(final Detail wheel, final Detail fuelTank) {
        return true;
    }

    public boolean relineFuel() {
        return true;
    }

    public void stopRotate() {
    }

    ;

    public void stopRunning(Detail wheel) {
    }

    ;
}

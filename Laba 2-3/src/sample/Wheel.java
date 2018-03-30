package sample;

public class Wheel extends Detail {
    boolean isInflate;
    public Wheel(double mass) {
        super(mass);
        isInflate = false;
    }

    @Override
    public void rotate() {
        System.out.println("Колеса крутятся");
    }

    @Override
    public void stopRotate() {
        System.out.println("Колеса перестали крутится");
    }
}

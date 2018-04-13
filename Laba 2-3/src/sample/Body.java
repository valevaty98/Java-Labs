package sample;

public class Body extends Detail {
    int numberOfDoors;
    boolean isTheDoorOpen;

    Body(final double mass, final int numberOfDoors) {
        super(mass);
        this.numberOfDoors = numberOfDoors;
        isTheDoorOpen = true;
    }

    public void openTheDoor() {
        isTheDoorOpen = true;
        System.out.println("The door is opened");
    }

    public void closeTheDoor() {
        isTheDoorOpen = false;
        System.out.println("The door is closed");
    }

}

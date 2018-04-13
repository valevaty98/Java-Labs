package sample;

/**
 * Class body contains doors
 */
public class Body extends Detail {
    int numberOfDoors;
    boolean isTheDoorOpen;

    /**
     * Constructor for Body Class
     * @param mass - of detail
     * @param numberOfDoors - usually 2 or 4
     */
    Body(final double mass, final int numberOfDoors) {
        super(mass);
        this.numberOfDoors = numberOfDoors;
        isTheDoorOpen = true;
    }

    /**
     * Open the door
     */
    public void openTheDoor() {
        isTheDoorOpen = true;
        System.out.println("The door is opened");
    }

    /**
     * Close the door
     */
    public void closeTheDoor() {
        isTheDoorOpen = false;
        System.out.println("The door is closed");
    }

}

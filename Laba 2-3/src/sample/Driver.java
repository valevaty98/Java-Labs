package sample;

public class Driver {
    Auto myAuto;
    Body bodyOfAuto;
    Wheel wheelOfAuto;
    boolean isTheCarReady;

    public Driver(Auto auto) {
        myAuto = auto;
        bodyOfAuto = (Body) myAuto.body;
        wheelOfAuto = (Wheel) myAuto.wheel;
        //isTheCarReady = false;
    }

    public boolean driveAuto(boolean isRide) {
        if (isRide) {
            if (this.bodyOfAuto.isTheDoorOpen) {
                System.out.println("You mast close the door");
            }
            if (!this.wheelOfAuto.isInflate) {
                System.out.println("You mast inflate the wheel");
            }
            return myAuto.ride(isTheCarReady);
        } else {
            myAuto.stop();
            return false;
        }
    }

    public void openTheDoor() {
        if (!this.bodyOfAuto.isTheDoorOpen) {
            this.bodyOfAuto.isTheDoorOpen = true;
            System.out.println("The door is opened");
            //if (this.wheelOfAuto.isInflate) {
            //    isTheCarReady = true;
            //}
        } else {
            System.out.println("The door has already opened.");
        }
    }

    public void closeTheDoor() {
        if (this.bodyOfAuto.isTheDoorOpen) {
            this.bodyOfAuto.isTheDoorOpen = false;
            System.out.println("The door is closed");
           // isTheCarReady = false;
        } else {
            System.out.println("The door has already closed.");
        }
    }

    public void inflateWheel() {
        if (!this.wheelOfAuto.isInflate) {
            this.wheelOfAuto.isInflate = true;
            System.out.println("The wheel is inflated.");
           // if (this.bodyOfAuto.isTheDoorOpen) {
           //    isTheCarReady = true;
           // }
        } else {
            System.out.println("The wheel has already inflated.");
        }
    }

}

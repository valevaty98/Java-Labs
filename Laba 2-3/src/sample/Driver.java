package sample;


import javafx.scene.control.Label;

public class Driver {
    Auto myAuto;
    Body bodyOfAuto;
    Wheel wheelOfAuto;
    boolean isTheCarReady;

    public Driver(final Auto auto) {
        myAuto = auto;
        bodyOfAuto = (Body) myAuto.body;
        wheelOfAuto = (Wheel) myAuto.wheel;
        isTheCarReady = false;
    }

    public boolean driveAuto(final boolean isRide, final Label processLabel) {
        if (isRide) {
            if (this.bodyOfAuto.isTheDoorOpen) {
                processLabel.setText(processLabel.getText() + "You must close the door\n");
            }
            if (!this.wheelOfAuto.isInflate) {
                processLabel.setText(processLabel.getText() + "You must inflate the wheel\n");
            }
            return myAuto.ride(isTheCarReady, processLabel);
        } else {
            myAuto.stop(processLabel);
            return false;
        }
    }

    public void openTheDoor(Label doorCondition) {
        if (!this.bodyOfAuto.isTheDoorOpen) {
            this.bodyOfAuto.isTheDoorOpen = true;
            doorCondition.setText("The door is opened");
        } else {
            doorCondition.setText("The door has already opened");
        }
        isTheCarReady = false;
    }

    public void closeTheDoor(Label doorCondition) {
        if (this.bodyOfAuto.isTheDoorOpen) {
            this.bodyOfAuto.isTheDoorOpen = false;
            doorCondition.setText("The door is closed");
        } else {
            doorCondition.setText("The door has already closed");
        }
        if (this.wheelOfAuto.isInflate) {
            isTheCarReady = true;
        }
    }

    public void inflateWheel(Label wheelCondition) {
        if (!this.wheelOfAuto.isInflate) {
            this.wheelOfAuto.isInflate = true;
            wheelCondition.setText("The wheel is inflated");
        } else {
            wheelCondition.setText("The wheel has already inflated");
        }
        if (!this.bodyOfAuto.isTheDoorOpen) {
            isTheCarReady = true;
        }
    }

}

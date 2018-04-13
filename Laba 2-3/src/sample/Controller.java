package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * Event-handling class.
 */
public class Controller {

    private Main parent;
    private boolean flag;
    private Driver iAm;
    private Tractor auto;
    private Button clickedButton;
    Alert alert;
    Label processLabel;
    String txt;

    /**
     * Constructor of the class.
     *
     * @param parent - Main GUI object
     */
    Controller(final Main parent) {
        this.parent = parent;
        flag = false;
        auto = new Tractor("BELAZ", "TheBestSnowCleaner");
        iAm = new Driver(auto);
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("ALERT");
        alert.setHeaderText(null);
        processLabel = parent.processLabel;
    }

    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {

        /**
         * Event-handling method.
         * @param e - contains info about event
         */
        @Override
        public void handle(MouseEvent e) {

            clickedButton = (Button) e.getSource();

            if (clickedButton == parent.buttonRide) {
                processLabel.setText("");
                if (!flag) {
                    if (iAm.driveAuto(true, processLabel)) {
                        parent.carCondition.setText("The car is riding");
                        flag = true;
                    } else {
                        parent.carCondition.setText("The moving is impossible");
                        flag = false;
                    }
                } else {
                    parent.carCondition.setText("The Auto has already gone");
                }
            } else if (clickedButton == parent.buttonStop) {
                processLabel.setText("");
                if (flag) {
                    parent.carCondition.setText("The car is stopped");
                    iAm.driveAuto(false, processLabel);
                    flag = false;
                } else {
                    parent.carCondition.setText("The Auto has already stopped");
                }
            } else if (clickedButton == parent.buttonOpenTheDoor) {
                iAm.openTheDoor(parent.doorCondition);
                //parent.doorCondition.setText("The door is opened");
            } else if (clickedButton == parent.buttonCloseTheDoor) {
                iAm.closeTheDoor(parent.doorCondition);
                //parent.doorCondition.setText("The door is closed");
            } else if (clickedButton == parent.buttonInflateWheel) {
                iAm.inflateWheel(parent.wheelCondition);
               //parent.wheelCondition.setText("The wheel is inflated");
            }else if (clickedButton == parent.buttonCleanSnow) {
                auto.cleanSnow(parent.processLabel);
            }
        }
    };
}

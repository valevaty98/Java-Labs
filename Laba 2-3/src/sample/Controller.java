package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * Event-handling class.
 */
public class Controller {

    private Main parent;
    private boolean flag;
    private Driver iAm;
    private Tractor auto;
    private Button clickedButton;
    private int row0;
    private int row1;
    private int col;
    private int counter0;
    private int counter1;

    /**
     * Constructor of the class.
     *
     * @param parent - Main GUI object
     */
    Controller(Main parent) {
        this.parent = parent;
        flag = false;
        auto = new Tractor("BELAZ", "TheBestSnowCleaner");
        iAm = new Driver(auto);
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
                if (!flag) {
                    if (iAm.driveAuto(true)) {
                        parent.carCondition.setText("The car is riding");
                        flag = true;
                    } else {
                        parent.carCondition.setText("Not enough fuel");
                        flag = false;
                    }
                } else {
                    parent.carCondition.setText("The Auto has already gone");
                }
            } else if (clickedButton == parent.buttonStop) {
                if (flag) {
                    parent.carCondition.setText("The car is stopped");
                    iAm.driveAuto(false);
                    flag = false;
                } else {
                    parent.carCondition.setText("The Auto has already stopped");
                }
            } else if (clickedButton == parent.buttonOpenTheDoor) {
                iAm.openTheDoor();
                parent.doorCondition.setText("The door is opened");
            } else if (clickedButton == parent.buttonCloseTheDoor) {
                iAm.closeTheDoor();
                parent.doorCondition.setText("The door is closed");
            } else if (clickedButton == parent.buttonInflateWheel) {
                iAm.inflateWheel();
                parent.wheelCondition.setText("The wheel is inflated");
            }
        }
    };
}

package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Main GUI class.
 */
public class Main extends Application {
    Button buttonInflateWheel;
    Button buttonOpenTheDoor;
    Button buttonCloseTheDoor;
    Button buttonRide;
    Button buttonStop;
    Button buttonCleanSnow;
    Label wheelCondition;
    Label doorCondition;
    Label carCondition;
    GridPane gridPane;
    Label processLabel;


    /**
     * implement Application's abstract method start().
     *
     * @param primaryStage - Stage object
     */
    @Override
    public void start(final Stage primaryStage) {

        buttonInflateWheel = new Button("Inflate the wheel");
        buttonOpenTheDoor = new Button("Open the door");
        buttonCloseTheDoor = new Button("Close the door");
        buttonRide = new Button("Ride");
        buttonStop = new Button("Stop");
        buttonCleanSnow = new Button("Clean snow");

        wheelCondition = new Label("The wheel is deflated");
        carCondition = new Label("The car is stoped");
        doorCondition = new Label("The door is opened");
        processLabel = new Label();

        buttonRide.setMinSize(190, 25);
        buttonStop.setMinSize(190, 25);
        buttonInflateWheel.setMinSize(190, 25);
        buttonOpenTheDoor.setMinSize(190, 25);
        buttonCloseTheDoor.setMinSize(190, 25);
        buttonCleanSnow.setMinSize(385, 25);
        //buttonCleanSnow.setAlignment(Pos.TOP_CENTER);

        //Creating a Grid Pane
        gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 300);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.TOP_CENTER);

        gridPane.add(buttonRide, 0, 0);
        gridPane.add(buttonStop, 1, 0);
        gridPane.add(carCondition, 0, 1);
        gridPane.add(processLabel, 0, 7, 2, 1);
        gridPane.add(buttonInflateWheel, 0, 2);
        gridPane.add(buttonOpenTheDoor, 1, 2);
        gridPane.add(buttonCloseTheDoor, 1, 3);
        gridPane.add(buttonCleanSnow, 0, 6, 2,1);
        gridPane.add(doorCondition, 1, 4);
        gridPane.add(wheelCondition, 0, 4);

        Controller controller = new Controller(this);

        buttonRide.addEventFilter(MouseEvent.MOUSE_CLICKED, controller.eventHandler);
        buttonStop.addEventFilter(MouseEvent.MOUSE_CLICKED, controller.eventHandler);
        buttonInflateWheel.addEventFilter(MouseEvent.MOUSE_CLICKED, controller.eventHandler);
        buttonOpenTheDoor.addEventFilter(MouseEvent.MOUSE_CLICKED, controller.eventHandler);
        buttonCloseTheDoor.addEventFilter(MouseEvent.MOUSE_CLICKED, controller.eventHandler);

        primaryStage.setTitle("Auto");
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * Entry point.
     *
     * @param args - from command prompt
     */
    public static void main(String[] args) {
        launch(args);
    }
}

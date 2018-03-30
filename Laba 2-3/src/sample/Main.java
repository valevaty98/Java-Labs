package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
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
    Label wheelCondition;
    Label doorCondition;
    Label carCondition;
    GridPane gridPane;

    /**
     *implement Application's abstract method start().
     * @param primaryStage - Stage object
     */
    @Override
    public void start(Stage primaryStage) {

        buttonInflateWheel = new Button("Inflate the wheel");
        buttonOpenTheDoor = new Button("Open the door");
        buttonCloseTheDoor = new Button("Close the door");
        buttonRide = new Button("Ride");
        buttonStop = new Button("Stop");

        wheelCondition = new Label("The wheel is deflated");
        carCondition = new Label("The car is stoped");
        doorCondition = new Label("The door is opened");

        buttonRide.setMinSize(190, 25);
        buttonStop.setMinSize(190, 25);
        buttonInflateWheel.setMinSize(190, 25);
        buttonOpenTheDoor.setMinSize(190, 25);
        buttonCloseTheDoor.setMinSize(190, 25);
        carCondition.setAlignment(Pos.CENTER_RIGHT);
        //Creating a Grid Pane
        gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 500);

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
        gridPane.add(buttonInflateWheel, 1, 2);
        gridPane.add(buttonOpenTheDoor, 1, 3);
        gridPane.add(buttonCloseTheDoor, 1, 4);
        gridPane.add(doorCondition, 0, 3);
        gridPane.add(wheelCondition, 0, 2);

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
     * @param args - from command prompt
     */
    public static void main(String[] args) {
        launch(args);
    }
}

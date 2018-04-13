package sample;

import javafx.scene.control.Label;

/**
 * Class Tractor, which can clean snow
 */
public class Tractor extends Auto {
    private String snowCleaner;

    public Tractor(final String name, final String snowCleaner) {
        super(name);
        this.snowCleaner = snowCleaner;
    }

    /**
     * Method, which write clean message
     * @param processCondition - Label for writing text
     */
    public void cleanSnow(Label processCondition) {
        processCondition.setText("I'm cleaning snow with " + snowCleaner);
    }
}

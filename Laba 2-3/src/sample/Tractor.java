package sample;

import javafx.scene.control.Label;

public class Tractor extends Auto {
    String snowCleaner;

    public Tractor(final String name, final String snowCleaner) {
        super(name);
        this.snowCleaner = snowCleaner;
    }

    public void cleanSnow(Label prossesCondition) {
        prossesCondition.setText("I'm cleaning snow");
    }
}

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Every animal is new thread.
 */
public class Animal extends Thread {
    private Feeder feeder;
    private String name;
    private Label condition;
    private Label freePlaces;
    private boolean isAnimalEating;

    /**
     * @param feeder - one feeder for all animals.
     * @param number - name of the animal
     */
    Animal(Feeder feeder, int number) {
        this.feeder = feeder;
        name = "Animal № " + number;
        isAnimalEating = false;
    }

    /**
     * compare feeding animals with free places in feeder.
     *
     * @return true, if the animal is eating
     */
    public synchronized boolean eat() {
        if (feeder.feedingAnimals < feeder.places) {
            if (!isAnimalEating) {
                feeder.feedingAnimals++;
                isAnimalEating = true;
            }
        }
        System.out.println((feeder.places - feeder.feedingAnimals) + " places are free.");
        return isAnimalEating;
    }

    /**
     * the animal frees the place.
     */
    public synchronized void stopEating() {
        if (isAnimalEating) {
            if (feeder.feedingAnimals != 0) {
                feeder.feedingAnimals--;
            }
            isAnimalEating = false;
        }
        System.out.println((feeder.places - feeder.feedingAnimals) + " places are free.");
        // feeder.freePlaces.setText("There are " + (feeder.places-feeder.feedingAnimals) + " free places");
        // feeder.freePlaces.getParent().layout();
    }

    /**
     * starts, when thread is created and starts.
     */
    @Override
    public void run() {

        Display display = new Display();
        Shell shell1 = new Shell(display, SWT.SHELL_TRIM | SWT.TITLE | SWT.CLOSE);
        shell1.setText(name);
        shell1.setSize(300, 130);

        GridLayout gl = new GridLayout(1, false);
        shell1.setLayout(gl);

        GridData gd = new GridData();
        gd.horizontalAlignment = GridData.FILL;
        gd.grabExcessHorizontalSpace = true;

        Button eatButton = new Button(shell1, SWT.PUSH | SWT.CENTER);
        eatButton.setText("Eat");
        eatButton.setLayoutData(gd);
        Button dontEatButton = new Button(shell1, SWT.PUSH | SWT.CENTER);
        dontEatButton.setText("Stop eating");
        dontEatButton.setLayoutData(gd);

        condition = new Label(shell1, SWT.CENTER);
        condition.setLayoutData(gd);
        condition.setText(name + " isn't eating");

        eatButton.addSelectionListener(new SelectionAdapter() {
            @Override
            /**
             * get executing, when button EAT is pressed.
             * @param e - info about event.
             */
            public void widgetSelected(SelectionEvent e) {
                if (eat()) {
                    condition.setText(name + " is eating");
                    condition.getParent().layout();
                } else {
                    condition.setText("There are no places");
                    condition.getParent().layout();
                }
            }
        });
        dontEatButton.addSelectionListener(new SelectionAdapter() {
            @Override
            /**
             * get executing, when button DONT EAT is pressed
             * @param e - info about event.
             */
            public void widgetSelected(SelectionEvent e) {
                stopEating();
                condition.setText(name + " isn't eating");
            }
        });

        shell1.open();
        while (!shell1.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }

        display.dispose();
    }
}

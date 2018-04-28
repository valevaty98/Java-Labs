import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

/**
 * Main thread of the process.
 */
public class Main {
    private Label condition;
    private Animal animals[];
    Feeder feeder;
    private int i = 0;

    /**
     * Costructor of Main class.
     * Creates and displays main GUI.
     */
    Main() {
        animals = new Animal[10];
        feeder = new Feeder();

        Display display = Display.getDefault();
        Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.TITLE | SWT.CLOSE);
        shell.setText("Main Thread");
        shell.setSize(300, 100);

        GridLayout gl = new GridLayout(1, false);
        shell.setLayout(gl);

        GridData gd = new GridData();
        gd.horizontalAlignment = GridData.FILL;
        gd.grabExcessHorizontalSpace = true;

        Button addButton = new Button(shell, SWT.PUSH | SWT.CENTER);
        addButton.setText("Add Animal");
        addButton.setLayoutData(gd);

        condition = new Label(shell, SWT.CENTER);
        condition.setLayoutData(gd);
        addButton.addSelectionListener(new SelectionAdapter() {
            /**
             * get executing, when button ADD is pressed
             * @param e - info about event.
             */
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (i < 6) {
                    animals[i] = new Animal(feeder, i + 1);
                    animals[i].start();
                    i++;
                    condition.setText("Thread № " + i + " created.");
                    condition.getParent().layout();

                } else {
                    condition.setText("Reached the maximum of animals");
                    condition.getParent().layout();
                }
            }
        });
//        Text helloWorldTest = new Text(shell, SWT.NONE);
//        helloWorldTest.setText("Hello World SWT");
//        helloWorldTest.pack();
        //addButton.pack();
        //shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }

    /**
     * Entry point.
     * @param args - command line
     */
    public static void main(String[] args) {
        Main mainThreat = new Main();
    }
}

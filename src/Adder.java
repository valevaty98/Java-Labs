import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Dimension;

/**
 * Класс служит для хранения объектов и
 * инициализации
 * фрэйма приложения.
 *
 * @author Vladislav Valevaty.
 */
public class Adder {
    JPanel windowContent;
    JLabel label1;
    JLabel label2;
    JTextField field1;
    JTextField field2;
    JButton buttonAdd;
    JButton buttonMult;
    JLabel labelResultAdd;
    JLabel labelResultMult;
    JLabel emptyLine;

    /**
     * Конструктор класса, который инициализирует все
     * компоненты фрейма и задает их начальное расположение
     */
    Adder() {
        windowContent = new JPanel();

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 5, 5);
        windowContent.setLayout(fl);

        label1 = new JLabel("Number 1:");
        label1.setPreferredSize(new Dimension(160, 20));
        label2 = new JLabel("Number 2:");
        label2.setPreferredSize(new Dimension(160, 20));

        field1 = new JTextField();
        field1.setPreferredSize(new Dimension(160, 20));
        field2 = new JTextField();
        field2.setPreferredSize(new Dimension(160, 20));

        emptyLine = new JLabel(" ");
        emptyLine.setPreferredSize(new Dimension(340, 10));

        buttonAdd = new JButton("Add");
        buttonAdd.setPreferredSize(new Dimension(90, 25));
        buttonMult = new JButton("Multiply");
        buttonMult.setPreferredSize(new Dimension(90, 25));

        labelResultAdd = new JLabel(" ");
        labelResultAdd.setPreferredSize(new Dimension(65, 25));
        labelResultMult = new JLabel(" ");
        labelResultMult.setPreferredSize(new Dimension(65, 25));

        windowContent.add(label1);
        windowContent.add(label2);
        windowContent.add(field1);
        windowContent.add(field2);
        windowContent.add(emptyLine);
        windowContent.add(buttonAdd);
        windowContent.add(labelResultAdd);
        windowContent.add(buttonMult);
        windowContent.add(labelResultMult);


        JFrame frame = new JFrame();
        frame.setContentPane(windowContent);
        frame.setResizable(false);
        frame.setBounds(550, 250, 350, 150);

        frame.setVisible(true);

        AdderEngine addEngine = new AdderEngine(this);

        buttonAdd.addActionListener(addEngine);
        buttonMult.addActionListener(addEngine);
    }

    public static void main(final String[] args) {
        Adder myAdder = new Adder();
    }

}

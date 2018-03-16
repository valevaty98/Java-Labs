import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * Класс, который хранит объект,
 * обрабатывающий нажатие кнопок и
 * производящий вычисления.
 */
public class AdderEngine implements ActionListener {

    /**
     * Свойство - родитель.
     */
    private Adder parent;

    /**
     * Конструктор задает родителя объекту.
     *
     * @param parent - родитель
     */
    AdderEngine(final Adder parent) {
        this.parent = parent;
    }

    /**
     * Функция, выполняющая сложение или умножение
     * полей при нажатии соответствующих кнопок.
     *
     * @param e - информация о событии
     */
    public void actionPerformed(final ActionEvent e) {
        // Получить источник текущего действия
        JButton clickedButton = (JButton) e.getSource();

        // Получить текущий текст из поля вывода (“дисплея”)
        // калькулятора
        String dispField1 = parent.field1.getText();
        String dispField2 = parent.field2.getText();
        try {
            Double.parseDouble(dispField1);
            Double.parseDouble(dispField2);
        } catch (Exception ex) {
            if (clickedButton == parent.buttonAdd) {
                parent.labelResultAdd.setText("Incorrect..");

            } else if (clickedButton == parent.buttonMult) {
                parent.labelResultMult.setText("Incorrect..");
            }
            return;
        }

        if (clickedButton == parent.buttonAdd) {
            parent.labelResultAdd.setText(Double.parseDouble(dispField1) + Double.parseDouble(dispField2) + "");

        } else if (clickedButton == parent.buttonMult) {
            parent.labelResultMult.setText(
                    Double.toString(Double.parseDouble(dispField1) * Double.parseDouble(dispField2))
            );
        }
    }
}

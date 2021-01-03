package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcatenationButtonListener implements ActionListener {
    private final JTextField textField;

    public ConcatenationButtonListener(JTextField textField) {
        this.textField = textField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        StringBuilder stringBuilder = new StringBuilder(textField.getText());       //
        stringBuilder.append(button.getText());                                    // преобразование нажатых цифр в строку

        textField.setText(stringBuilder.toString());
    }
}

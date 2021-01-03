package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationListener implements ActionListener {

    private final JTextField textField;

    public CalculationListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = textField.getText();
        String[] operators;
        if (value.contains("+")) {
            operators = value.split("\\+");
            textField.setText(
                    String.valueOf(
                            Double.parseDouble(operators[0]) + Double.parseDouble(operators[1])
                    )
            );
        } else if (value.contains("-")) {
            operators = value.split("-");
            textField.setText(
                    String.valueOf(
                            Double.parseDouble(operators[0]) - Double.parseDouble(operators[1])
                    )
            );
        } else if (value.contains("*")) {
            operators = value.split("\\*");
            textField.setText(
                    String.valueOf(
                            Double.parseDouble(operators[0]) * Double.parseDouble(operators[1])
                    )
            );
        }   else if (value.contains("/")) {
            operators = value.split("/");
            textField.setText(
                    String.valueOf(
                            Double.parseDouble(operators[0]) / Double.parseDouble(operators[1])
                    )
            );
        }   else if (value.contains("^")) {
            operators = value.split("\\^");
            textField.setText(
                    String.valueOf(
                            Math.pow(Double.parseDouble(operators[0]), Double.parseDouble(operators[1]))
                    )
            );
        }   else if (value.contains("\u221A")) {
            operators = value.split("\u221A");
            textField.setText(
                    String.valueOf(
                            Math.pow(Double.parseDouble(operators[0]), 1.0 / Double.parseDouble(operators[1]))
                    )
            );
        }
    }
}
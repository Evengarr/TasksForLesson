package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;

    public Calculator() {
        initMandatoryComponents();

        setTitle("Калькулятор");        //Титульное название графического окна
        setBounds(100, 100, 400, 600); //начальное положение и размер графического окна на экране
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //закрытие графического окна при нажатии "Х"

        setLayout(new BorderLayout());

        add(initTop(), BorderLayout.NORTH);
        add(initButton(), BorderLayout.CENTER);
        add(initButtonClear(), BorderLayout.SOUTH);
        add(initButtonCalculated(), BorderLayout.EAST);


        setVisible(true);          //видимость графического окна
        //setResizable(false);    //запрет растягивания окна
    }

    private void initMandatoryComponents() {
        textField = new JTextField();
    }

    private JPanel initButton() {
        JPanel button = new JPanel();                                                               //
        button.setLayout(new GridLayout(4, 3));    // табличное расположение элементов   //

        ActionListener concatenationButtonListener = new ConcatenationButtonListener(textField);

        for (int i = 1; i <= 9; i++) {                                                            // заполение элементами таблицы
            JButton btn = new JButton(String.valueOf(i));                                        //
            btn.addActionListener(concatenationButtonListener);                                 //
            button.add(btn);                                                                   //
        }

        JButton submit = new JButton("=");
        submit.addActionListener(new CalculationListener(textField));
        button.add(submit);
        JButton zero = new JButton("0");
        zero.addActionListener(concatenationButtonListener);
        button.add(zero);
        JButton comma = new JButton("\u002E");
        comma.addActionListener(concatenationButtonListener);
        button.add(comma);



        return button;
    }

    private JPanel initTop() {
        JPanel top = new JPanel();                                                      //
        top.setLayout(new BorderLayout());          //полярное расположение элементов  //
        textField = new JTextField();              // текстовое поле                  //    размещение элементов
        textField.setEditable(false);             //запрет ввода текста в поле       //
        top.add(textField, BorderLayout.CENTER);                                    //

        return top;
    }

    private JButton initButtonClear(){
        JButton clear = new JButton("C");
        clear.addActionListener(e -> textField.setText(""));

        return clear;
    }

    private JPanel initButtonCalculated(){
        JPanel button = new JPanel();                                                               //
        button.setLayout(new GridLayout(6, 1));    // табличное расположение элементов   //

        ActionListener concatenationButtonListener = new ConcatenationButtonListener(textField);

        JButton minus = new JButton("-");
        minus.addActionListener(concatenationButtonListener);
        button.add(minus);
        JButton plus = new JButton("+");
        plus.addActionListener(concatenationButtonListener);
        button.add(plus);
        JButton multiple = new JButton("*");
        multiple.addActionListener(concatenationButtonListener);
        button.add(multiple);
        JButton separation = new JButton("/");
        separation.addActionListener(concatenationButtonListener);
        button.add(separation);
        JButton exponentiation = new JButton("^");      //для возведения в степень, необходимо указать число которое возводится в степень, нажать "^" и указать степень
        exponentiation.addActionListener(concatenationButtonListener);
        button.add(exponentiation);
        JButton extracting = new JButton("\u221A");   //для извлечения корня необходимо указать число, корень которого извлекаем, нажать символ корня, и указать степень
        extracting.addActionListener(concatenationButtonListener);
        button.add(extracting);

        return button;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame;
    JButton buttonNumber1;
    JButton buttonNumber2;
    JButton buttonNumber3;
    JButton buttonAdd;
    JButton buttonNumber4;
    JButton buttonNumber5;
    JButton buttonNumber6;
    JButton buttonMulti;
    JButton buttonNumber7;
    JButton buttonNumber8;
    JButton buttonNumber9;
    JButton buttonDivision;
    JButton buttonDecimal;
    JButton buttonZero;
    JButton buttonEqual;
    JButton buttonMines;
    JButton buttonClear;
    JButton buttonDelete;
    TextField textField;
    String Operation = "";
    double firstInput = 0.0;
    double SecondInput = 0.0;
    int decimalClicked = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonNumber1) {
            textField.setText(textField.getText().concat(buttonNumber1.getText()));
        }
        if (e.getSource() == buttonNumber2) {
            textField.setText(textField.getText().concat(buttonNumber2.getText()));
        }
        if (e.getSource() == buttonNumber3) {
            textField.setText(textField.getText().concat(buttonNumber3.getText()));
        }
        if (e.getSource() == buttonNumber4) {
            textField.setText(textField.getText().concat(buttonNumber4.getText()));
        }
        if (e.getSource() == buttonNumber5) {
            textField.setText(textField.getText().concat(buttonNumber5.getText()));
        }
        if (e.getSource() == buttonNumber6) {
            textField.setText(textField.getText().concat(buttonNumber6.getText()));
        }
        if (e.getSource() == buttonNumber7) {
            textField.setText(textField.getText().concat(buttonNumber7.getText()));
        }
        if (e.getSource() == buttonNumber8) {
            textField.setText(textField.getText().concat(buttonNumber8.getText()));
        }
        if (e.getSource() == buttonNumber9) {
            textField.setText(textField.getText().concat(buttonNumber9.getText()));
        }
        if (e.getSource() == buttonZero) {
            textField.setText(textField.getText().concat(buttonZero.getText()));
        }
        if (e.getSource() == buttonAdd) {
            firstInput = Double.parseDouble(textField.getText());
            Operation = "+";
            textField.setText("");
        }
        if (e.getSource() == buttonMines) {
            firstInput = Double.parseDouble(textField.getText());
            Operation = "-";
            textField.setText("");
        }
        if (e.getSource() == buttonMulti) {
            firstInput = Double.parseDouble(textField.getText());
            Operation = "*";
            textField.setText("");
        }

        if (e.getSource() == buttonDivision) {
            firstInput = Double.parseDouble(textField.getText());
            Operation = "/";
            textField.setText("");
        }
        if (e.getSource() == buttonClear) {
            textField.setText("");
            Operation = "";
            decimalClicked = 0;
        }
        if (e.getSource() == buttonDecimal) {
            if (decimalClicked != 1) {
                textField.setText(textField.getText().concat(buttonDecimal.getText()));
            }
            decimalClicked = 1;
        }
        if (e.getSource() == buttonDelete) {
            String content = textField.getText();
            textField.setText("");
            for (int i = 0; i < content.length() - 1; i++) {
                textField.setText(textField.getText() + content.charAt(i));
                if (textField.getText().equals(".")) {
                    decimalClicked = 1;
                } else {
                    decimalClicked = 0;
                }

            }
        }
        if (e.getSource() == buttonEqual) {
            double result;
            SecondInput = Double.parseDouble(textField.getText());
            switch (Operation) {
                case "+":
                    result = firstInput + SecondInput;
                    textField.setText(result + "");
                    break;
                case "-":
                    result = firstInput - SecondInput;
                    textField.setText(result + "");
                    break;
                case "*":
                    result = firstInput * SecondInput;
                    textField.setText(result + "");
                    break;
                case "/":
                    try {
                        result = firstInput / SecondInput;
                        textField.setText(result + "");
                    } catch (Exception exception) {
                        textField.setText(exception.getMessage());
                    }
                    break;

            }
        }

    }

    public void setupAndShowMainFrame() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
    }

    public void createAndShowButtons() {

        textField = new TextField();
        textField.setBounds(30, 40, 280, 30);
        frame.add(textField);
        buttonNumber1 = new JButton("1");
        buttonNumber2 = new JButton("2");
        buttonNumber3 = new JButton("3");
        buttonAdd = new JButton("+");
        buttonNumber1.addActionListener(this);
        buttonNumber2.addActionListener(this);
        buttonNumber3.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonNumber1.setBounds(40, 100, 50, 40);
        buttonNumber2.setBounds(110, 100, 50, 40);
        buttonNumber3.setBounds(180, 100, 50, 40);
        buttonAdd.setBounds(250, 100, 50, 40);
        frame.add(buttonNumber1);
        frame.add(buttonNumber2);
        frame.add(buttonNumber3);
        frame.add(buttonAdd);

        buttonNumber4 = new JButton("4");
        buttonNumber5 = new JButton("5");
        buttonNumber6 = new JButton("6");
        buttonMulti = new JButton("*");
        buttonNumber4.addActionListener(this);
        buttonNumber5.addActionListener(this);
        buttonNumber6.addActionListener(this);
        buttonMulti.addActionListener(this);

        buttonNumber4.setBounds(40, 170, 50, 40);
        buttonNumber5.setBounds(110, 170, 50, 40);
        buttonNumber6.setBounds(180, 170, 50, 40);
        buttonMulti.setBounds(250, 170, 50, 40);
        frame.add(buttonNumber4);
        frame.add(buttonNumber5);
        frame.add(buttonNumber6);
        frame.add(buttonMulti);

        buttonNumber7 = new JButton("7");
        buttonNumber8 = new JButton("8");
        buttonNumber9 = new JButton("9");
        buttonDivision = new JButton("/");
        buttonNumber7.addActionListener(this);
        buttonNumber8.addActionListener(this);
        buttonNumber9.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonNumber7.setBounds(40, 240, 50, 40);
        buttonNumber8.setBounds(110, 240, 50, 40);
        buttonNumber9.setBounds(180, 240, 50, 40);
        buttonDivision.setBounds(250, 240, 50, 40);
        frame.add(buttonNumber7);
        frame.add(buttonNumber8);
        frame.add(buttonNumber9);
        frame.add(buttonDivision);

        buttonDecimal = new JButton(".");
        buttonZero = new JButton("0");
        buttonEqual = new JButton("=");
        buttonMines = new JButton("-");
        buttonDecimal.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonMines.addActionListener(this);
        buttonDecimal.setBounds(40, 310, 50, 40);
        buttonZero.setBounds(110, 310, 50, 40);
        buttonEqual.setBounds(180, 310, 50, 40);
        buttonMines.setBounds(250, 310, 50, 40);
        frame.add(buttonDecimal);
        frame.add(buttonZero);
        frame.add(buttonEqual);
        frame.add(buttonMines);

        buttonClear = new JButton("clear");
        buttonDelete = new JButton("Delete");
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDelete.setBounds(60, 380, 100, 40);
        buttonClear.setBounds(180, 380, 100, 40);
        frame.add(buttonDelete);
        frame.add(buttonClear);
    }
}
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button add, sub, mul, div, eq, clr;

    double num1, num2, result;
    char operator;

    SimpleCalculator() {
        setLayout(new GridLayout(5, 4, 5, 5));

        tf = new TextField();
        add(tf);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        add = new Button("+");

        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        sub = new Button("-");

        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        mul = new Button("*");

        clr = new Button("C");
        b0 = new Button("0");
        eq = new Button("=");
        div = new Button("/");

        Button[] buttons = {b1,b2,b3,add,b4,b5,b6,sub,b7,b8,b9,mul,clr,b0,eq,div};

        for (Button b : buttons) {
            add(b);
            b.addActionListener(this);
        }

        setTitle("Simple Calculator");
        setSize(300, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
            tf.setText(tf.getText() + cmd);
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            num1 = Double.parseDouble(tf.getText());
            operator = cmd.charAt(0);
            tf.setText("");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num2 != 0 ? num1 / num2 : 0; break;
            }

            tf.setText(String.valueOf(result));
        } else if (cmd.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
package Rishav;

/**
 * @author Rishav Chaudhary
 */
import javax.swing.*;


public class CalculatorDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");

        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JTextField result = new JTextField(20);
        result.setEditable(false);
        JButton calcBtn = new JButton("Calculate");

        calcBtn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                String res = "Add: " + (a + b) +
                        " Sub: " + (a - b) +
                        " Mul: " + (a * b) +
                        " Div: " + (b != 0 ? a / b : "Err");
                result.setText(res);
            } catch (NumberFormatException ex) {
                result.setText("Invalid input.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Num1:"));
        panel.add(num1);
        panel.add(new JLabel("Num2:"));
        panel.add(num2);
        panel.add(calcBtn);
        panel.add(result);

        frame.add(panel);
        frame.setSize(400, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

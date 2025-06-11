

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Unish Rajak
 */

public class CalculatorGUI {
    public static void main(String[] args) {

        JLabel label1 = new JLabel("   Number 1:");
        label1.setBounds(10, 30, 100, 30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(120, 30, 150, 30);

        JLabel label2 = new JLabel("   Number 2:");
        label2.setBounds(10, 80, 100, 30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120, 80, 150, 30);

        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(100, 130, 100, 30);
        calcButton.setFocusable(false);
        calcButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(30, 180, 240, 70);

        JFrame frame = new JFrame("Calculator");
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());

                    StringBuilder sb = new StringBuilder();
                    sb.append("Addition: ").append(num1 + num2).append("\n");
                    sb.append("Subtraction: ").append(num1 - num2).append("\n");
                    sb.append("Multiplication: ").append(num1 * num2).append("\n");
                    if (num2 != 0) {
                        sb.append("Division: ").append((double) num1 / num2).append("\n");
                    } else {
                        sb.append("Division: Error (Divide by Zero)\n");
                    }

                    resultArea.setText(sb.toString());
                } catch (NumberFormatException ex) {
                    resultArea.setText("Error: Please enter valid numbers");
                }
            }
        });

        frame.add(label1);
        frame.add(tf1);
        frame.add(label2);
        frame.add(tf2);
        frame.add(calcButton);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}

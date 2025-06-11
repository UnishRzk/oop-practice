package Rishav;

/**
 * @author Unish Rajak
 */
import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        JFrame frame = new JFrame("Stack Demo");
        JTextArea display = new JTextArea(10, 20);
        JTextField input = new JTextField(10);
        JButton pushBtn = new JButton("Push");
        JButton popBtn = new JButton("Pop");

        pushBtn.addActionListener(e -> {
            String text = input.getText();
            if (!text.isEmpty()) {
                stack.push(text);
                display.setText("Stack: " + stack.toString());
            }
        });

        popBtn.addActionListener(e -> {
            if (!stack.isEmpty()) {
                stack.pop();
                display.setText("Stack: " + stack.toString());
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Text:"));
        panel.add(input);
        panel.add(pushBtn);
        panel.add(popBtn);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(display), BorderLayout.CENTER);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

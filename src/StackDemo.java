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
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel inputLabel = new JLabel("   Enter Text:");
        inputLabel.setBounds(10, 30, 100, 30);
        JTextField input = new JTextField();
        input.setBounds(120, 30, 150, 30);

        JButton pushBtn = new JButton("Push");
        pushBtn.setBounds(40, 80, 100, 30);
        pushBtn.setFocusable(false);
        pushBtn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        JButton popBtn = new JButton("Pop");
        popBtn.setBounds(160, 80, 100, 30);
        popBtn.setFocusable(false);
        popBtn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        JTextArea display = new JTextArea();
        display.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setBounds(30, 130, 240, 100);

        pushBtn.addActionListener(e -> {
            String text = input.getText();
            if (!text.isEmpty()) {
                stack.push(text);
                display.setText("Stack: " + stack.toString());
                input.setText("");
            }
        });

        popBtn.addActionListener(e -> {
            if (!stack.isEmpty()) {
                stack.pop();
                display.setText("Stack: " + stack.toString());
            }
        });

        frame.add(inputLabel);
        frame.add(input);
        frame.add(pushBtn);
        frame.add(popBtn);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}

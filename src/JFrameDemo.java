import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDemo {
    public static void main(String[] args) {

        JLabel label1 = new JLabel("   Number 1:");
        label1.setBounds(10, 30, 100, 30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(120, 30, 150, 30);

        JLabel label2 = new JLabel("   Number 2:");
        label2.setBounds(10, 80, 100, 30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120, 80, 150, 30);

        JButton addbutton = new JButton("Add");
        addbutton.setBounds(115, 130, 70, 30);
        addbutton.setFocusable(false);
        addbutton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(110, 170, 260, 30);

        JFrame frame = new JFrame("JFrame Demo");
        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int result = num1 + num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Invalid number");
                }
            }
        });

        frame.add(label1);
        frame.add(tf1);
        frame.add(label2);
        frame.add(tf2);
        frame.add(addbutton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}

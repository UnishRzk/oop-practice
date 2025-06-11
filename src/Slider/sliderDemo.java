package Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class sliderDemo implements ChangeListener {

    JFrame frame;
    JSlider slider;
    JLabel label;
    JPanel panel;

    sliderDemo(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);


        panel.add(slider);
        panel.add(label);

        slider.setOrientation(JSlider.VERTICAL);
        slider.setPaintLabels(true);

        label.setText("Temp: "+slider.getValue());
        slider.addChangeListener(this);
        label.setFont(new Font("Monospaced",Font.PLAIN,20));

        frame.add(panel);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Temp: "+slider.getValue());
    }
}

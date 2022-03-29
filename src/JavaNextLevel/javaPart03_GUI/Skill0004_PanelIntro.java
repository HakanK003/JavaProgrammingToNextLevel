package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;

public class Skill0004_PanelIntro {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("TonsOfCode.png");


        JLabel label = new JLabel();
        label.setText("Hello There!");
        label.setIcon(image);

        label.setBounds(10, 10, 250, 250);

//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.CENTER);



        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 450, 450);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(450, 0, 450, 450);


//        bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 450, 900, 450);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1400,750);
        frame.setVisible(true);


        bluePanel.add(label);


        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }

}

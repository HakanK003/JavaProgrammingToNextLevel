package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Skill0003_LabelIntro {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("TonsOfCode.png");

        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);

        JLabel label = new JLabel();    //create a label  //also we can so like new JLabel("Hello There!");
        label.setText("Hello There!");   //set text to label
        label.setIcon(image);    //add image
        label.setHorizontalTextPosition(JLabel.CENTER);     //set text LEFT, RIGHT, CENTER of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);      //set text TOP, BOTTOM, CENTER of imageIcon
        label.setForeground( new Color(0x0000FF) );     //set font color
        label.setFont( new Font("MV Boli", Font.ITALIC, 20) );     //set font of text
        label.setIconTextGap(0);     //set gap between image and text
        label.setBackground( Color.CYAN );    //set background color
        label.setOpaque(true);   //display background color

        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);


        label.setBounds(10,10,550,550);
        frame.setLayout(null);


        frame.setVisible(true);
        frame.add(label);

//        frame.pack();   //if you use pack don't use size, setBounds, setLayout

    }

}

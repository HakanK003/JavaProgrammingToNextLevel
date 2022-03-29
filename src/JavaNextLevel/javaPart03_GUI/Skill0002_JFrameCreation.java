package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;

public class Skill0002_JFrameCreation {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame();   //creates a frame

        frame.setTitle("First JFrame Title");  //sets frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application (for default it is hide)
        frame.setResizable(true);    //prevent from being resized
        frame.setSize(333,333);   //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true);     //make frame visible (by default it is false)

        ImageIcon image = new ImageIcon("TonsOfCode.png");   //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame
        frame.getContentPane().setBackground( new Color( 66,66,255 ) );


        //Second way

        Skill0002_MyFrame myFrame = new Skill0002_MyFrame();


    }

}

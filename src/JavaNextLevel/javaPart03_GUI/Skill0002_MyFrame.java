package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;

public class Skill0002_MyFrame extends JFrame {

    Skill0002_MyFrame(){

        this.setTitle("First JFrame Title");  //sets frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application (for default it is hide)
        this.setResizable(true);    //prevent from being resized
        this.setSize(333,333);   //sets the x-dimension, and y-dimension of frame
        this.setVisible(true);     //make frame visible (by default it is false)

        ImageIcon image = new ImageIcon("TonsOfCode.png");   //create an ImageIcon
        this.setIconImage(image.getImage());   //change icon of frame
        this.getContentPane().setBackground( new Color( 66,66,255 ) );


    }

}

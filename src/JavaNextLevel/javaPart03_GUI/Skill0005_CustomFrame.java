package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Skill0005_CustomFrame extends JFrame {
// implements ActionListener

    JButton button;
    JLabel label;


    Skill0005_CustomFrame(){


        label = new JLabel();
        label.setText("Hello There!");   //example was with image
        label.setBounds(150, 150, 150, 150);
        label.setVisible(false);



//      ImageIcon image = new ImageIcon("TonsOfCode.png");


        button = new JButton();
        button.setBounds(200, 100, 200, 50);
//        button.addActionListener(this);

//      button.setIcon(image);

        button.setText("Obi-Wan Kenobi");
        button.setFocusable(false);


        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.ITALIC, 25));
//      button.setIconTextGap(10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

//      button.setEnabled(false);    //after adding some logic we can use this as well




        button.addActionListener(e -> {
            System.out.println("Hello There!");
            label.setVisible(true);
        } );



        this.setTitle("First JFrame Title");  //sets frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application (for default it is hide)
        this.setResizable(true);    //prevent from being resized
        this.setSize(333,333);   //sets the x-dimension, and y-dimension of frame
        this.setVisible(true);     //make frame visible (by default it is false)

        ImageIcon image = new ImageIcon("TonsOfCode.png");   //create an ImageIcon
        this.setIconImage(image.getImage());   //change icon of frame
        this.getContentPane().setBackground( new Color( 66,66,255 ) );


        this.add(button);


        this.add(label);


        button.setHorizontalAlignment(15);
        button.setVerticalAlignment(15);


    }

//    @Override
//    public void actionPerformed(ActionEvent e){
//
//        if (e.getSource()==button){
//            System.out.println("Hello There!");
//        }
//
//    }

}

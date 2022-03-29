package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Skill0010_LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    Skill0010_LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    //easier when you use lambda
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myButton) {
            frame.dispose();   // close previous frame
            Skill0010_NewWindow myWindow = new Skill0010_NewWindow();
        }
    }

}

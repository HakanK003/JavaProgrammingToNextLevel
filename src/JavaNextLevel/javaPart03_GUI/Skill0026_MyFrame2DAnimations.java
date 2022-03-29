package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;

public class Skill0026_MyFrame2DAnimations extends JFrame{

    Skill0026_MyPanel2DAnimations panel;

    Skill0026_MyFrame2DAnimations(){

        panel = new Skill0026_MyPanel2DAnimations();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;

public class Skill0025_MyFrame2DGraphics extends JFrame{


    Skill0025_MyPanel2DGraphics panel;

    Skill0025_MyFrame2DGraphics(){

        panel = new Skill0025_MyPanel2DGraphics();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

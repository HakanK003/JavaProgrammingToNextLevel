package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class Skill0023_MyFrameDragAndDrop extends JFrame{


    Skill0023_DragPanelDragAndDrop dragPanel = new Skill0023_DragPanelDragAndDrop();

    Skill0023_MyFrameDragAndDrop(){

        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}


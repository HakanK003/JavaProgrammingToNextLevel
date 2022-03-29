package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Skill0026_MyPanel2DAnimations extends JPanel implements ActionListener {


    final int PANEL_WIDTH = 1500;
    final int PANEL_HEIGHT = 750;
    Image enemy;
    //Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    Skill0026_MyPanel2DAnimations(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
//        enemy = new ImageIcon("enemy.png").getImage();
        enemy = new ImageIcon("TonsOfCode.png").getImage();
        //backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        //g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }

}

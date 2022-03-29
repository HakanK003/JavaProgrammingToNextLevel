package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;

public class Skill0017_ProgressBarDemo {


    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);

    Skill0017_ProgressBarDemo(){

        bar.setValue(0);   //100 if reverse
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.blue);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter =0;

        while(counter<=100) {

            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            counter +=1;
        }
        bar.setString("Done! :)");
    }

}

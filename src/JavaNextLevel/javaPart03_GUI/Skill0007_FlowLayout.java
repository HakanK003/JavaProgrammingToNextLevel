package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;

public class Skill0007_FlowLayout {

    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout = places components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small,
        //              the FlowLayout class uses the next available row

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);


//        frame.setLayout( new FlowLayout(FlowLayout.LEADING) );  //to left
//        frame.setLayout( new FlowLayout(FlowLayout.TRAILING) );  //to right
//        frame.setLayout( new FlowLayout() );  //to center by default
        frame.setLayout( new FlowLayout(FlowLayout.CENTER,0,0) ); //buttons will be touch each others
        frame.setLayout( new FlowLayout(FlowLayout.CENTER,10,10) );


        JPanel panel = new JPanel();
        panel.setPreferredSize( new Dimension(250,250) );
        panel.setBackground(Color.CYAN);

        panel.setLayout( new FlowLayout() );  //actually panels using flow layout by default


        panel.add( new JButton("1") );
        panel.add( new JButton("2") );
        panel.add( new JButton("3") );
        panel.add( new JButton("4") );
        panel.add( new JButton("5") );
        panel.add( new JButton("6") );
        panel.add( new JButton("7") );
        panel.add( new JButton("8") );
        panel.add( new JButton("9") );



//        frame.add( new JButton("1") );
//        frame.add( new JButton("2") );
//        frame.add( new JButton("3") );
//        frame.add( new JButton("4") );
//        frame.add( new JButton("5") );
//        frame.add( new JButton("6") );
//        frame.add( new JButton("7") );
//        frame.add( new JButton("8") );
//        frame.add( new JButton("9") );



        frame.add(panel);


        frame.setVisible(true);     //out this at the end to prevent buttons visibility problems(sometimes we can have some visibility problems)

    }

}

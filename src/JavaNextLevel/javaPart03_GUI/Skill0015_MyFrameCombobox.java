package JavaNextLevel.javaPart03_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Skill0015_MyFrameCombobox extends JFrame implements ActionListener {

        JComboBox comboBox;

        Skill0015_MyFrameCombobox(){
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new FlowLayout());

                String[] animals = {"dog","cat","bird"};

                comboBox = new JComboBox(animals);
                comboBox.addActionListener(this);

                //comboBox.setEditable(true);

                //System.out.println(comboBox.getItemCount());
                //comboBox.addItem("horse");
                //comboBox.insertItemAt("cow", 0);
                //comboBox.setSelectedIndex(0);
                //comboBox.removeItem("cat");
                //comboBox.removeItemAt(0);
                //comboBox.removeAllItems();

                this.add(comboBox);
                this.pack();
                this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getSource()==comboBox) {
                        System.out.println(comboBox.getSelectedItem());
                        //System.out.println(comboBox.getSelectedIndex());
                }
        }

}

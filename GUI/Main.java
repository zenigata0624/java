package GUI;

import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
    public static void main(String[]args){
        JFrame Fraem = new JFrame("初めてのGUI");
        JLabel label = new JLabel("Hello world");
        JButton button = new JButton("押してね");
        Fraem.getContentPane().setLayout(new FlowLayout());
        Fraem.getContentPane().add(label);
        Fraem.getContentPane().add(button);
        Fraem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fraem.setSize(300,100);
        Fraem.setVisible(true);
    }
}

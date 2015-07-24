
package com.Serialization.org;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class FirstGUI {
    public static void main(String argssss[]){
        JFrame j=new JFrame();
        JButton b=new JButton("Clike here to display whatehr you wann dispaly on window");
        
        
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.getContentPane().add(b);
        j.setSize(300,300);
        j.setVisible(true);
    }
    
}

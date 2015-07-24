
package com.Serialization.org;
//import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Gui {    
    public static void main(String[] args) {
         JFrame frame=new JFrame();
         JButton button=new JButton("Click here");
         frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
         frame.getContentPane().add(button);
         frame.setSize(300,300);
         frame.setVisible(true);
         
        
       
    }
    
}

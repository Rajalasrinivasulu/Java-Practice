package com.Serialization.org;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Eventhandling implements ActionListener {
    JButton b;
    public static void main(String args[]){
        Eventhandling ev=new Eventhandling();
        ev.go();
        
        
    } 
    
    public void go() {
       JFrame j=new JFrame();
        b=new JButton("Clik herer");
        
        j.getContentPane().add(b);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        j.setSize(300, 300);
        j.setVisible(true);
        b.addActionListener(this);
            
        
    }
    
    public void actionPerformed(ActionEvent e){
       
       
        
        b.repaint();
        
        
    }

    
    
}

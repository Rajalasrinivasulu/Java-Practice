/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Serialization.org;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class x implements Serializable {
    int x=10;
   transient int y=20;
}
public class serializationDemo {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        x x=new x();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(x);
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ooi=new ObjectInputStream(fis);
      x d=(x) ooi.readObject();
      
      System.out.println(d.x+" \n"+ d.y);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class parent implements Serializable {
    int x=10;
    int y=20;
}

public class JavaApplication1 {

   
    public static void main(String[] args) throws Exception  {
       parent p=new parent();
       FileOutputStream fout=new FileOutputStream("abc.ser");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(p);
       
        FileInputStream fin=new FileInputStream("abc.ser");
        ObjectInputStream oin=new ObjectInputStream(fin);
        parent p1=(parent) oin.readObject();
        System.out.println(p1.x+" "+p1.y);
        
    }
    
}

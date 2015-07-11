/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Serialization.org;

import java.io.*;

class dog2 implements Serializable {
    int x=10;
    int y=20;
}
class cat implements Serializable  {
    int x=30;
    int y=40;
}
class rat implements Serializable  {
    int x=20;
    int y=50;
}
public class MultiSeriaization  {
    public static void main(String args[]) throws Exception {
        dog2 d=new dog2();
        cat c=new cat();
        rat r=new rat();
        FileOutputStream fos=new FileOutputStream("Abcdf.ser");
        ObjectOutputStream OOS=new ObjectOutputStream(fos);
        OOS.writeObject(d);
        OOS.writeObject(c);
        OOS.writeObject(r);
        FileInputStream fin=new FileInputStream("Abcdf.ser");
        ObjectInputStream oos=new ObjectInputStream(fin);
        Object o=oos.readObject();
        if( o instanceof dog2){
            dog d1=(dog)o;
            System.out.println(d1.x+  "  "+d1.y);
        } else if(o instanceof cat){
            cat c1=(cat)o;
            System.out.println(c1.x+" "+c1.y);
            
        } else  if(o instanceof rat){
             rat r1=(rat)o;
             System.out.println(r1.x+ " " +r1.y);
         }
    }
    
}

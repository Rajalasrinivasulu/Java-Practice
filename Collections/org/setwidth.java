/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class setwidth1 implements Serializable {
    private int height ;
     private int width;
     doc d=new doc();
   public int  seeteidth(int w){// i use get mathods to get an instace variable values.
       return  width=w;
    }
    public int  seethight(int h){
       return  height=h;
    }
}
class doc implements Serializable {
    
}
public class setwidth {
    public static void main(String args[])throws Exception{
        setwidth1 s=new setwidth1();
        s.seeteidth(50);
        s.seethight(60);
        try{
            FileOutputStream fout=new FileOutputStream("abcd.ser");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s);
            
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            FileInputStream fin=new FileInputStream("abcd.ser");
            ObjectInputStream oin=new ObjectInputStream(fin);
            setwidth1 s1=(setwidth1) oin.readObject();
            System.out.println(s1.seeteidth(50));
            System.out.println(s1.seethight(500));
            
            
        }catch(Exception e){
            System.out.println(e);
        }
//        System.out.println(s)
    }
    
}

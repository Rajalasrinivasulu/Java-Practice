
package com.Serialization.org;
import java.io.*;
class parent implements Serializable {
    int x=20;
    int y=50;
    public void disp(){
    System.out.println("Srininvas ");
}
}
class child extends parent{
    int x1=100;
    int y2=200; 
} 


public class ParentImplemetnsSerializable {
    public static void main(String args[]) throws Exception{
        child c=new child();
        c.x=1000;
        c.y=2000;
        FileOutputStream fout=new FileOutputStream("abac.ser");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(c);
        
        
        FileInputStream fin=new FileInputStream("abc.ser");
        ObjectInputStream oin=new ObjectInputStream(fin);
       child c1=(child) oin.readObject();
       System.out.println(c1.x);
                
        
        
        
    }
    
}

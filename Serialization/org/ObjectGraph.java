
package com.Serialization.org;
import java.io.*;
class  dog1 implements Serializable {
    cat1 c=new cat1();
    
}
class cat1 implements Serializable {
    rat1 r=new rat1();
    
    
}
class rat1 implements Serializable {
    
     int i=20;
     }


public class ObjectGraph {
    public static void main(String argsss[]) throws Exception{
        dog1 d2=new dog1();
        FileOutputStream f=new FileOutputStream("abc.ser");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(d2);
        System.out.println(f);
        System.out.println(o);
        FileInputStream f1=new FileInputStream("abc.ser");
        ObjectInputStream o1=new ObjectInputStream(f1);
        dog1 d4=(dog1) o1.readObject();
        System.out.println(d4.c.r.i);
        
        
    }
     
}

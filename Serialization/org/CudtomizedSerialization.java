
package com.Serialization.org;
import java.io.*;
 class Accountds implements Serializable {
     String uname="srinivnas";
     transient String pwd="marist";
     
     private void writeobject(ObjectOutputStream os) throws Exception {
//         os.deWriteObject();
         os.defaultWriteObject();
         String epwd="123"+pwd;
         os.writeObject(epwd);
         
     }
     private void readObejct(ObjectInputStream is) throws Exception {
         is.defaultReadObject();
         String epwd=(String)is.readObject();
         pwd=epwd.substring(3);
     }
            
     
 }

public class CudtomizedSerialization {
    public static void main(String args[]) throws Exception {
        Account a=new Account();
//        System.out.println(a.uname);
//        System.out.println(a.pwd);
        FileOutputStream f=new FileOutputStream("userdetauils.ser");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(a);// it will go to writeObejct method in the AccountDes Class 
        
        FileInputStream f1=new FileInputStream("userdetauils.ser");
        ObjectInputStream o1=new ObjectInputStream(f1);
        Account a1=(Account)o1.readObject();
        System.out.println(a1.pwd); 
        
        
    }
    
} 




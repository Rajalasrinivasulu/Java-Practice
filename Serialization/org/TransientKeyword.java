
package com.Serialization.org;
import java.io.*;
 class Account implements Serializable {
     String uname="srinivnas";
     transient String pwd="marist";//it wont serialize  and its value will be set to default vlue 
 }

public class TransientKeyword {
    public static void main(String args[]) throws Exception {
        Account a=new Account();
        System.out.println(a.uname);
        System.out.println(a.pwd);
        FileOutputStream f=new FileOutputStream("userdetauils.ser");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(a);
        FileInputStream f1=new FileInputStream("userdetauils.ser");
        ObjectInputStream o1=new ObjectInputStream(f1);
        Account a1=(Account)o1.readObject();
        System.out.println(a1.pwd);       
    }
    
}

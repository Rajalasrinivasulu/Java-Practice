
package com.Serialization.org;
import java.io.*;
class Animal {
    int x=10;
 static {
     System.out.println("It prints when class loads");
}
 public Animal(){
System.out.println("djdkjdd");     
 }

}
class dog extends Animal implements Serializable {
    int y=20;
    
}


public class InheritanceSeriazilablewithChildExtendsParent {
   
    public static void main(String[] args) throws Exception  {
        dog g =new dog();
        FileOutputStream fou=new FileOutputStream("ABC.ser");
        ObjectOutputStream aa=new ObjectOutputStream(fou);
        aa.writeObject(g);
        FileInputStream fou1=new FileInputStream("ABC.ser");
        ObjectInputStream aa1=new ObjectInputStream(fou1);
          dog d3=(dog)aa1.readObject();
          System.out.println(d3.x+" "+d3.y);
                  
        
        
       
    }
    
}

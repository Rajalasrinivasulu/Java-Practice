/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;

/**
 *
 * @author Marist User
 */
public class IteratorDemo {
    public static void main(String args[]){
        Vector v1=new Vector();     
             for(int i=0;i<100;i++)
          {
          v1.addElement(i);
          }
      System.out.println(v1);
     
        Iterator it=v1.iterator();
                 while(it.hasNext()){ 
                    Integer in=(Integer) it.next();
                    
                                     
                    if(in%2==0){
                      System.out.println(in);
                                 }
                         else {
                         it.remove();
                        }
           
                                  }  
      System.out.println(v1);
    }
    
    
}

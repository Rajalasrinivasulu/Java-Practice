/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;


public class EnumertionDemoImpl {
    public static void main(String args[]){
        Vector v=new Vector();
        Enumeration e=v.elements();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        System.out.println(v);// without Enumeration i.e here we are getting all Objects at a time 
        while(e.hasMoreElements()){
           
          Integer i=(Integer)  e.nextElement();
          if(i%2==0){
              System.out.println(i);// here, we are prinitng All objects  One by One.
          }else { }
        }
          System.out.println(v);
          
        } 
        
    
    
}

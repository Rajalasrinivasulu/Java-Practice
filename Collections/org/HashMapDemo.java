/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.Set;
import java.util.*;
/**
 *
 * @author Marist User
 */
public class HashMapDemo {
   public static void main(String args[]){
   LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
   hm.put(100,"Rajala");
   hm.put(101, "Srininvas Reddy");
   hm.put(103, null);
   hm.put(104, null);
   hm.put(0, "kjsdkj");
   hm.put(0,";lk;kd;");// doest.print and no order 
     for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
           
   }
    
}

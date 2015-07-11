/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;


public class ListIteratordemo {
    public static void main(String args[]){
        
    LinkedList ll=new LinkedList();
    ll.add("Rajala");
    ll.add("Srininvas");
    ll.add("Reddy");
    System.out.println(ll);
    System.out.println(ll.indexOf("Rajala"));
    
    ListIterator ltr=ll.listIterator();
   while(ltr.hasNext()){
      String str=(String) ltr.next();
      if(str=="Rajala"){
          ltr.remove();
      }else if(str=="Reddy"){
        
          ltr.set("Reddy222");// this method is used to replace with Reddys222. this is one more advantages of Listiterator .
      }
   }
   System.out.println(ll);
   
   
    
               
    }
}

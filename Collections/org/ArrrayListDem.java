/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;


public class ArrrayListDem {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        int i;
        for(i=0;i<10;i++){
            al.add(i);
            
                         }
        System.out.println(al);
       al.add("A");
        System.out.println(al);
       System.out.println(al.indexOf("A"));
       al.remove(10);
       System.out.println(al.indexOf("A"));
       
       Iterator itr=al.iterator();
       while(itr.hasNext()){
         Integer in=(Integer) itr.next();
         if(in%2==0){
             System.out.println(in);
         }
         else {
             itr.remove();
         }
       }
       System.out.println(al);

    }
    
}

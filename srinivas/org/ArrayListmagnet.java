
package com.srinivas.org;
import java.util.ArrayList;
public class ArrayListmagnet {
    public static void main(String args[]){
        ArrayList <String> a=new ArrayList<String>();
        realclass r1=new realclass();
        a.add(0, "Zero");
        a.add(1, "One");
        a.add(2,"Two");
        a.add(3, "three");
       r1.printAL(a);
       if(a.contains("three")){
           a.add("four");
       }
      a.remove(2);
     r1.printAL(a);
     if(a.indexOf("four")!=4){
         a.add(4,"4.2");
     }
       r1.printAL(a);
       if(a.contains("two")){
           a.add("2.2");
       }
        r1.printAL(a);
    }
}
class realclass {
void  printAL(ArrayList<String> a){
    for(String str :a){
        System.out.print(str+" ");
        
    }
    System.out.println("");

}
}
        
        

package com.srinivas.org;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList n=new ArrayList();
        n.add("A");
        n.add("B");
        n.add("C");
        n.add("D");
        n.add("E");
        n.add("F");
        n.add("G");
       int size=n.size();
       System.out.println(size);
//       n.clear();
//       System.out.println(size);
       for(int i=0;i<size;i++){
        System.out.print(n.get(i)+"  ");
       }
        
        
    }
    
}

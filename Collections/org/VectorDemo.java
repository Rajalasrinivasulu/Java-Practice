
package collections;
import java.util.*;


public class VectorDemo extends Object {
    public static void main(String args[]) {
//       ArrayList al=new ArrayList();
     Vector  v=new Vector(10,1);
       System.out.println(v.capacity());
     for (int i=0;i<10;i++)
     {         
         v.add(i);          
     }
     System.out.println(v.capacity());
     v.addElement("B");
     System.out.println(v.capacity());
     System.out.println(v);


     
    
    }    
}

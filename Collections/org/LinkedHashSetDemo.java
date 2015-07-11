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
public class LinkedHashSetDemo {
    public static void main(String args[]){
        LinkedHashSet hs=new LinkedHashSet();
        
        System.out.println(hs.size());
        hs.add("M");
        hs.add("N");
        hs.add("null");
        hs.add(10);
        System.out.println(hs);
       hs.contains("O");//false 
        System.out.println(hs.add("M")); // returns False because its duplicated one and Set doesnt allowe Duplicates Objects 
        
        // o/p is Object Preserved i.e it stores in the order we give o/p...M,n,null, 10 but in the previous case o/p is null,10, m.n or anything 
    }   // So in set we cant say what would the first and last elements .....to overcome we go for SortedSet 
    
}

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
public class HashSetDemo {
    public static void main(String args[]){
        HashSet hs=new HashSet();
        
        System.out.println(hs.size());
        hs.add("M");
        hs.add("N");
        hs.add("null");
        hs.add(10);
        System.out.println(hs);
       hs.contains("O");//false 
        System.out.println(hs.add("M")); // returns False because its duplicated one and Set doesnt allowe Duplicates Objects 
        
        
    }
    
}

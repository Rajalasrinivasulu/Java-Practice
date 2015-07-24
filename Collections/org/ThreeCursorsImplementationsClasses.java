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
public class ThreeCursorsImplementationsClasses {
    public static void main(String args[]){
             Vector v=new Vector();
             Enumeration e=v.elements();// these three interface classes and those  Implementation classes are anynomus class i.e Vector$1..etc.
             Iterator itr=v.iterator();
             ListIterator ltr=v.listIterator();
             System.out.println(e.getClass().getName());
             System.out.println(itr.getClass().getName());
             System.out.println(ltr.getClass().getName());
                                  
                                  
                                  }
    
}

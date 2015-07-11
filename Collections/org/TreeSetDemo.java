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
public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet ts=new TreeSet();
        ts.add("A");// its Ascii value is lesser than small a .So it  prints first .
        ts.add("B");
        ts.add("M");
        ts.add("L");
        ts.add("a");
//        ts.add(10);// because treeset and Treemap doesn't support for Heterogenous 
//        ts.add("null");
        ts.add(null);// null pointer exception because we are not sure whther we have to add in the end or begiining ...So we get NPE
        System.out.println(ts);
        System.out.println(ts.add("A"));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.Set;

/**
 *
 * @author Marist User
 */
public class ComparetoDemo {
    public static void main(String args[]){
        System.out.println("A".compareTo("B"));//-
        System.out.println("B".compareTo("A"));//+ve
        System.out.println("A".compareTo("A"));//0
        System.out.println("A".compareTo(null));//NPE
    }
    
}

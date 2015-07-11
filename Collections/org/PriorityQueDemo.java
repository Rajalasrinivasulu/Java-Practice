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
public class PriorityQueDemo {
    public static void main(String args[]){
        PriorityQueue pq=new PriorityQueue();
        pq.add("Srininvas");
        pq.add("Reddy");
        pq.offer("Rajala");// places on top of the queue in which we enter.
        pq.offer("marist");
        pq.offer("College");
        pq.offer("Poughkeepsie");
        pq.offer("Poughkeepsie1");
//        pq.add(10);
       
       pq.peek();
       pq.remove();// remove the top que element 
         
        System.out.println(pq);
        System.out.println(pq.peek());// top queue string 
        System.out.println(pq.poll());// retire and remove top ques
        System.out.println(pq);
        pq.clear();
//        System.out.println("%s",pq.isEmpty());
        System.out.println(pq.isEmpty());
        
    }
    
}

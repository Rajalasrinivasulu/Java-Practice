/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Marist User
 */
class Threasbusiness implements Runnable {
    public void run(){
        System.out.println("First Thread Method");
        go();
        
    }
     public void go(){
        System.out.println("Secong  Thread Method");
        domore();

         
     }
     public void domore(){
      System.out.println("Third  Thread Method");

     }
    
}
public class ThreadDemo {
    public static void main(String args[]){
       
        
        MyThread th=new MyThread();
//        new Thread(new MyRunnable)))).start();
        th.start();
        System.out.println("back to main method");
//        new Thread(new HelloRunnable())).start();
    }
    
}

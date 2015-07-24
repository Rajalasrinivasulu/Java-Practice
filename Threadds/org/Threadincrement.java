/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class test1 implements Runnable{
    private int balance;
    @Override
    public  void run(){
        for(int i=0;i<50;i++){
            increment();
            System.out.println("balance is "+balance);
        }
        
    }
    public synchronized  void increment(){
        int i=balance;
       balance=i+1;
    }
}
public class Threadincrement {
    public static void main(String args[]){
        test1 tn=new test1();
        Thread th1=new Thread(tn);
        Thread th2=new Thread(tn);
        th1.setName("Thread One");
        th2.setName("Thread Two");
        
        th1.start();
        th2.start();
    }
    
}

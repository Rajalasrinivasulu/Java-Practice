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
class BankAccount{
    private int balance=100;    
        public int getBalance(){
            return balance;
                               }
        public void withdraw(int amount){
            balance=balance-amount;
        }
}
public class MultithreadingExample implements Runnable {
    private BankAccount b=new BankAccount();
    public static void main(String args[]){
        MultithreadingExample b=new MultithreadingExample();
        Thread one=new Thread(b);
        Thread two=new Thread(b);
        one.setName("Srinivnas");
        two.setName("reddy");
        one.start();
        two.start();
        
        
        
    }
        public void run(){
            
            for(int x=0;x<25;x++){
             makeWithdraw(10);
             if(b.getBalance()<0 ){
                 System.out.println("overdrawn");
                                 }
                                         
            }           
        
        }
       private synchronized  void  makeWithdraw(int amount){
            if(b.getBalance()>=amount){
                System.out.println(Thread.currentThread().getName()+" is about to withdraw");
                try{
                    System.out.println(Thread.currentThread().getName()+"is going to sleep");
                    Thread.sleep(500);
                
                    } catch(InterruptedException ex){ 
                           ex.printStackTrace();
                    }
               System.out.println(Thread.currentThread().getName()+" woke up");
               b.withdraw(amount);
               System.out.println(Thread.currentThread().getName()+" Completes the withdraw");
            }
            else {
                System.out.println("Sorry ,not enough for"+Thread.currentThread().getName());
            }
        }
    
        }


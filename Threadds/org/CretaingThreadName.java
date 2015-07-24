/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
class test implements Runnable{
    @Override
    public void run(){
        try{
           Thread.sleep(5000);
        for(int i=0;i<50;i++){
            System.out.println(i);
        }
    }catch(Exception ex){
         ex.printStackTrace();
    }
}
}
public class CretaingThreadName {
    public static void main(String args[]){
        System.out.println("this is Main Method");
    test t=new test();
    Thread m1=new Thread(t);
    Thread m2=new Thread(t);
    m1.setName("Thread One ");
    m2.setName("Thread Two");
    m1.start();
    m2.start();
    
    
    }
}

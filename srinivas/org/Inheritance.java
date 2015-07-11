/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
  // class is a blue oprint.
//business application 
class parent {
    int x=10; 
    int y=20;//instance varaible 
    void add(){
        int sum=x+y;// local variable 
        System.out.println(sum);
    }
}
class child extends parent {
    int x=10;
    int y=30;
    void sub(){
        int sub=x-y;
        System.out.println(sub);
        
    }
   
}
class granchil extends child{
    void display(){
        System.out.println("dlkjdj");
    }
    
    // child preoper +parent 
}
//client program 
public class Inheritance {
    private int x=10;
     class subclass{
         int y=x+10;
         
     }
   
    public static void main(String[] args) { //entry point to java.. 
        
        child c=new child();
        c.add();  //30
        c.sub();  //-20
        parent p=new parent();
        p.add();  //30   
        granchil g=new granchil();
        g.display();
       
        
        
        
           
        }
        
    }
    



package com.practice.com;

class staticvariable {
    int a=10; // instance variable 
   static  int y=10; // static variable or class variable 
    void add1(){
        a++;
        y++;
//        a++;  
        System.out.println("a value is "+a);
        System.out.println("y value is "+y);
        
    }
    void add2(){
        a++;
        y++;
//        a++;
        System.out.println("a value is "+a);
        System.out.println("y value is "+y);
    }
    void add3(){
        y++;
        a++;
        System.out.println("a value is "+a);
        System.out.println("y value is "+y);
    }
}
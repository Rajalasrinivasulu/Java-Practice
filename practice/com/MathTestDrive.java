

package com.practice.com;
class Mathrealclass{
    int a=20;
     int b=30;
   void Addition(){
       int result=a+b;
       System.out.println("Sum of  two numbers is "+result);       
   }
}
public class MathTestDrive {
    public static void main(String argss[]){
        Mathrealclass mr=new Mathrealclass();
        mr.Addition();        
        int n=10;        
        Mathrealclass mc=new Mathrealclass();         
        System.out.println(n);       
        
        System.out.println(mc);// prints package name with   class name 
}
}

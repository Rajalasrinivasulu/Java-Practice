/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Marist User
 */
class y{
    
}
class x{
    void add(int  x, float t){
        float f=x+t;
        System.out.println(f);
    }
    void add(int x,int y) //parametns
    {
        int s=x+y;
        System.out.println(s);
    }    
}
public class metholdoverloading {
    public static void main(String args[]){
        x x1=new x();
        x1.add(10, 20);   
        x1.add(10, 20.5f);
       
        
    }
    
}

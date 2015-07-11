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

class x {
    int x=10;
    public  void dispaly(){
         System.out.println(x);
     }   
}
class y extends x{
    @Override
    public void dispaly(){
        System.out.println(x+10);
    }
    void man(){
        System.out.println("Srinivas reddy");
    }
}
public class MethodOverriding {
    public static void main(String args[])
    {
//       x x=new x();
        x x =new y();
        y y=new y();
        x.dispaly();
        y.dispaly();
//       x.man();
    }    
}

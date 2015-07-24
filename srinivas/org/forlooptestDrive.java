/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srinivas.org;


 class forloop {
    void display(){
        int y=7;
        for(int x=1;x<8;x++){
            y++;
            if(x>4){
                System.out.print(++y+" ");
            }
            if(y>14){
                System.out.println("x is ="+x);
                break;
            }
        }
    }
    
}
public class forlooptestDrive {
    public static void main(String args[]){
        forloop f1=new forloop();
       f1.display();
        
        
    }
            
}

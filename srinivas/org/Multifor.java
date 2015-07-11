/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srinivas.org;

/**
 *
 * @author Marist User
 */
public class Multifor {
    public static void main(String args[]){
        for(int x=0;x<4;x++)
        {
            for(int y=4;y>2;y--)
            {               
                    System.out.println(x+" "+y);                  
                
            }
            if(x==1){
                x++;
    
            }
        }
    }
    
}

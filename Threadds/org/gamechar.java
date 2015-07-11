/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

public class gamechar implements Serializable{
    int power;
    String type;
//    String[] weapons;
    public void  Gamechar(int p,String t){
        power=p;
        type=t;
//        weapons=w;
        
    }
    public int power(){
        return power;
    }
    public String type(){
        return type;
    }
//    public String weapons(){
//        String wl="";
//        for(int i=0;i<weapons.length;i++){
//            wl+=wl+"";
//        }
//        return wl;
//    }
    
}

    


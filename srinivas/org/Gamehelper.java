/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srinivas.org;

import java.io.*;
public class Gamehelper {
    
    public String getuserunput(String str){
        String inputLine=null;
        System.out.print(str +"");
        try{
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
           inputLine= is.readLine();
           if(inputLine.length()==0)
               return null;
        
        
    }catch(Exception e){
    System.out.println("IO Exception is "+e);
    
}
    return inputLine;
   } 
}

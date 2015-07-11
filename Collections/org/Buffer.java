/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Collections.org;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Buffer// Buffer is a cart in shopping//
 {
    public static void main(String args[]){
        try {
            File f=new File("abc.txt");
            FileReader f1=new FileReader(f);
            BufferedReader f2=new BufferedReader(f1);
            String line="null";
            while((line=f2.readLine())!=null){
                System.out.println(line);
                
            }
            f2.close();
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
  }

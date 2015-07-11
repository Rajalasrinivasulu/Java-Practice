/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;

class file{
    int x=10;
    String name="Srininvas Reddy";
    String Addrees="77 garden Street";
    String location="Poughkeepsie";
}
public class FileWriter {
    public static void main(String args[]) throws Exception {
        try{
            FileWriter fw=new FileWriter("abc.txt");
            fw.write("Srinivnas Reddy");
        }catch(Exception e) {}
    
}
   
    File f=new File("Chapter7");
   
    
    

    private FileWriter(String abctxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void write(String srinivnas_Reddy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

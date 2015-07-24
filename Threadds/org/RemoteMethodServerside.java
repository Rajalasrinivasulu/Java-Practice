/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author Marist User
 */
public class RemoteMethodServerside  extends UnicastRemoteObject implements RemoteMethodinvokingclientside {
    public String sayhello(){
        return "Say Hello ";
    }
    public  RemoteMethodServerside() throws RemoteException{}
    public static void main(String args[]){
        try {
          RemoteMethodinvokingclientside  m=new RemoteMethodServerside();
            Naming.rebind("Hello Remote", m);
        }catch(Exception ex) { ex.printStackTrace(); 
        }
        
    }
    
}

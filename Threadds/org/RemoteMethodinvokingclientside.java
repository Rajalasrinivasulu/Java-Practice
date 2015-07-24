/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.rmi.*;

/**
 *
 * @author Marist User
 */
public interface  RemoteMethodinvokingclientside  extends Remote{
    public String sayhello() throws RemoteException;
    
}

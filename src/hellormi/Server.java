/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author marie
 */
public class Server extends UnicastRemoteObject implements HelloServer {
    protected Server() throws RemoteException{
    super();
    }
    @Override
    public String echo(String inp)throws RemoteException{
    return "I am Server"+inp;
    }
 
    
}

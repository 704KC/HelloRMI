/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellormi;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author marie
 */
public class Client {
    public static void main(String []args)throws  RemoteException,MalformedURLException,NotBoundException{
        
        try{
            Registry reg =LocateRegistry.getRegistry(1094);
        HelloServer hs=(HelloServer)reg.lookup("Hello Mary");
        String inp="Cloud";
        System.out.println("-----"+hs.echo(inp));
        } catch(Exception e){
        System.out.println(e);
        }
}
    
}

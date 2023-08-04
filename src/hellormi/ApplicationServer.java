/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellormi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author marie
 */
public class ApplicationServer {
    public static void main(String[]args){
        try{
    Server s=new Server();
    Registry reg= LocateRegistry.createRegistry(1094);
    reg.rebind("Hello Mary", s);
    System.out.println("Server is bound");
        }catch(Exception e){
        System.out.println(e);
        }
            }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hellormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author marie
 */
public interface HelloServer  extends Remote{
    public String echo(String inp)throws RemoteException;
    
}

package klaufg03.rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiMethodenInterface extends Remote
{ 
  public double sin(double x) throws RemoteException;
  
  public double cos(double x) throws RemoteException;
  
  public double tan(double x) throws RemoteException;
  
  public double cot(double x) throws RemoteException;
  
  public double exp(double x) throws RemoteException;
  
  public double log(double x) throws RemoteException;
  
  
}
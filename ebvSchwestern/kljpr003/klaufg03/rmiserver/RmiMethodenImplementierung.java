package klaufg03.rmiserver;

import java.rmi.*;
import java.rmi.server.*;

import java.util.GregorianCalendar;
import java.util.Date;
import java.util.StringTokenizer;

public class RmiMethodenImplementierung 
  extends UnicastRemoteObject implements RmiMethodenInterface
{
 
  private static final long serialVersionUID = 710L;

//Der Konstruktor erzeugt ein Remote Objekt, das auf Port 16660 horcht
  public RmiMethodenImplementierung() throws RemoteException
  {
    super(16660);
  }

  public double sin(double x)throws RemoteException
  {
    return Math.sin(x);
  }
  public double cos(double x)throws RemoteException
  {
    return Math.cos(x);
  }
  public double tan(double x)throws RemoteException
  {
    return Math.tan(x);
  }
  public double cot(double x)throws RemoteException
  {
    return 1/Math.tan(x);
  }
  public  double exp(double x)throws RemoteException
  {
    return Math.exp(x);
  }
  public  double log(double x)throws RemoteException
  {
    return Math.log(x)/Math.log(10);
  }
}

package klaufg03.rmiserver;

import java.rmi.Naming;

public class Server 
{ 

  public static void main(String[] args)
  {
// Startmeldung
    System.out.println(
      "\nBeispiel zur Verwendung eines Interface - RMI Server"+
      "\nCopyright 2006,2008 by M. Eikelberg (www.eikelberg.de)");

    try
    {
// Security Manager konfigurieren und setzen
      String policypath="klaufg03/rmiserver/rmipolicy_server.txt";
      System.setProperty("java.security.policy",policypath);
      System.setProperty("java.rmi.server.hostname","127.0.0.1");
      if (System.getSecurityManager() == null)
        System.setSecurityManager(new SecurityManager());
      
// Remote Object instanziieren und als Dienst bei der RMI Registrierung anmelden      
      RmiMethodenImplementierung myRmiMethImpl = new RmiMethodenImplementierung();
      String rmiUrl = "rmi://127.0.0.1:11099/rmidienst";
      System.out.println("\nDie URL des RMI-Dienstes lautet: "+rmiUrl);
      Naming.rebind(rmiUrl,myRmiMethImpl);
      System.out.println(
        "\nRMI-Dienst ist angemeldet, Server wartet auf Client-Zugriffe...\n");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}

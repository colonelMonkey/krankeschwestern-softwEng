package klaufg03.rmiclient;

import java.rmi.Remote;
import java.io.Console;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.rmi.NotBoundException;
import de.eikelberg.iotools.*;
import klaufg03.rmiserver.RmiMethodenInterface;

public class Client
{ 

  public static void main(String[] args)
  {
// Startmeldung
    System.out.println(
        "\nBeispiel zur Verwendung eines Interface - RMI Client"+
        "\nCopyright 2006,2008 by M. Eikelberg (www.eikelberg.de)");

    try
    {
// Security Manager konfigurieren und setzen
      String policypath="klaufg03/rmiclient/rmipolicy_client.txt";
      System.setProperty("java.security.policy",policypath);
      if (System.getSecurityManager() == null)
        System.setSecurityManager(new SecurityManager());

// Remote Object suchen      
      String rmiurl = "rmi://127.0.0.1:11099/rmidienst";
      System.out.println("\nEs wird folgender RMI-Dienst gesucht: "+rmiurl);
      Remote myRemoteObj = Naming.lookup(rmiurl);

// Cast auf das Remote Object absetzen, damit es vom Typ des Interface wird      
      RmiMethodenInterface myRmiMethInterf;
      myRmiMethInterf= (RmiMethodenInterface) myRemoteObj;
      System.out.println("\nRMI-Dienst "+rmiurl+" wurde gefunden.");

// Methodenaufruf auf dem Server
      
      
      
      //eigenes
        // Schleife für Verarbeitung
       char weiter = 'j';
        do
        {
          ScreenOut.kPrintln("Welcher Funktionswert soll berechnet werden:\n"
              + "Cosinus              c\n"
              + "Sinus                s\n"
              + "Tangens              t\n"
              + "Kotangens            o\n"
              + "Zehnerlogarithmus    l\n"
              + "Exponentialfunktion  e\n"
              +"\n"
              +"Geben sie ihre auswahl ein:"
              );
          char auswahl = KeyboardIn.kReadLine().charAt(0);
          
          
          double x = 0d;
          ScreenOut.kPrintln("Geben sie bitte eine Double Zahl ein.");
          try
          {
          x = Double.parseDouble(KeyboardIn.kReadLine());
          }
          catch(NumberFormatException e){
            ScreenOut.kPrintln("Die eingegebene Zahl lässt sich nicht als double parsen");
          }
          
          switch(auswahl) 
          {
            case 'c' :
            {
              ScreenOut.kPrintln("Das Berechnungsergebnis lautet " + "cos(" + x +") = " + myRmiMethInterf.cos(x));
            }
            break;
            case 's' :
            {
              ScreenOut.kPrintln("Das Berechnungsergebnis lautet " + "sin(" + x +") = " + myRmiMethInterf.sin(x));
            }
            break;
            case 't' :
            {
              ScreenOut.kPrintln("Das Berechnungsergebnis lautet " + "tan(" + x +") = " + myRmiMethInterf.tan(x));
            }
            break;
            case 'o' :
            {
              ScreenOut.kPrintln("Das Berechnungsergebnis lautet " + "cot(" + x +") = " + myRmiMethInterf.cot(x));
            }
            break;
            case 'l' :
            {
              ScreenOut.kPrintln("Das Berechnungsergebnis lautet " + "log(" + x +") = " + myRmiMethInterf.log(x));
            }
            break;
            case 'e' :
            {
              ScreenOut.kPrintln("Das Berechnungsergebnis lautet " + "exp(" + x +") = " + myRmiMethInterf.exp(x));
            }
            break;
            default:
            {
              ScreenOut.kPrintln("Fehler bei der Eingabe der Operation");
            }
            break;
          }
          
       
          weiter = weiterPruefung();
        } while (weiter=='j' || weiter=='J');
      
      //bis hier
    }
    
    
    catch (RemoteException e)
    {
      System.out.println("\nEine RemoteException ist aufgetreten.");
      e.printStackTrace();
    }
    catch (NotBoundException e)
    {
      System.out.println(
        "\nDer Dienst \"rmidienst\" ist noch nicht an die Registry gebunden.");
      e.printStackTrace();
    }
    catch (Exception e)
    {
      System.out.println("\nFehler beim Verbindungsaufbau zum Server.");
      e.printStackTrace();
    }
  }

  private static char weiterPruefung() 
  {
    Scanner eingabe  = new Scanner(System.in);
    ScreenOut.kPrintln("Wollen sie die Verarbeitung wiederholen? (J/N): ");
    char ans = eingabe.nextLine().charAt(0);
    return ans;
  }
 
}


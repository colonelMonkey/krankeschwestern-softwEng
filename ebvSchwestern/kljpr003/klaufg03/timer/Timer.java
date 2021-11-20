package klaufg03.timer;

/**
 * Klasse wartet 3 Sekunden und beendet dann die Verarbeitung
 */

public class Timer
{ 
  public static void main (String [] argument)
  {
    int warteZeit = 10*1000;   // default Warte-Zeit von 10 Sekunden
    if (argument.length >= 1)
    {
      try
      {
        warteZeit = Integer.parseInt(argument [0]);
        warteZeit = warteZeit * 1000;
      }
      catch (NumberFormatException fehler)
      {
        System.out.println("Falsche Wartezeit als Parameter angegeben - keine ganze Zahl!");
      }
      catch (Exception fehler)
      {
        System.out.println("Falsche Wartezeit als Parameter angegeben!");
      }
    }
    try
    {
      Thread.sleep(warteZeit);
    }
    catch (InterruptedException e) 
    { 
      System.out.println("Wartezeit wurde abgebrochen!");
    } 
  }
}
package spielfeldeditor;

import java.io.File;

import zufallsgenerator.ZufallsgeneratorPrototyp;



public class Spielfeldeditor implements SpielfeldeditorSchnittstelle
{
  File geladen;
  
/**
 * �ffnet das Spielfeldeditor Dropdown-Men�
 */
  public Spielfeldeditor()
  {
    // TODO Auto-generated constructor stub
  }

  /**
   * SE-06: Zufallsgenerator | Werkzeug um das Spielfeld mit Zuf�lligen
   * werten zu f�llen
   */
  @Override
  public ZufallsgeneratorPrototyp getZufallsgenerator()
  {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * SE-01: Laden | Ruft Filechooser auf, wor�uber ein bereits 
   * gespeichertes Spielfeld geladen wird.
   */
  @Override
  public void se_laden()
  {
    // TODO Auto-generated method stub
    
  }

  /**
   * SE-02: Einf�gen | Einen kleineren Spielfeldzustand in das 
   * Aktuelle wird an einer beliebigen Stelle eingef�gt
   */
  @Override
  public void se_einfuegen()
  {
    // TODO Auto-generated method stub
    
  }

  /**
   * SE-03: Speichern | Aktueller Zustand des Spielfeldes wird in
   * einer Datei gesichert.
   */
  @Override
  public void se_speichern()
  {
    // TODO Auto-generated method stub
    
  }

  /**
   * SE-04: Gr��e | Dimensionen: Das erste Eintragsk�astchen gibt
   * die Breite an, das Zweite die H�he des gew�nschten Spielfeldes.
   */
  @Override
  public void setGroeße(int x, int y)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void fuelleZufall()
  {
    // TODO Auto-generated method stub
    
  }

  /**
   * SE-07: Clear | Generiert ein leeres Spielfeld.
   */
  @Override
  public void clear()
  {
    // TODO Auto-generated method stub
    
  }

}

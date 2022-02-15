package spielfeldeditor;

import java.io.File;

import zufallsgenerator.ZufallsgeneratorPrototyp;



public class Spielfeldeditor implements SpielfeldeditorSchnittstelle
{
  File geladen;
  
/**
 * Öffnet das Spielfeldeditor Dropdown-Menü
 */
  public Spielfeldeditor()
  {
    // TODO Auto-generated constructor stub
  }

  /**
   * SE-06: Zufallsgenerator | Werkzeug um das Spielfeld mit Zufälligen
   * werten zu füllen
   */
  @Override
  public ZufallsgeneratorPrototyp getZufallsgenerator()
  {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * SE-01: Laden | Ruft Filechooser auf, wor¨uber ein bereits 
   * gespeichertes Spielfeld geladen wird.
   */
  @Override
  public void se_laden()
  {
    // TODO Auto-generated method stub
    
  }

  /**
   * SE-02: Einfügen | Einen kleineren Spielfeldzustand in das 
   * Aktuelle wird an einer beliebigen Stelle eingefügt
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
   * SE-04: Größe | Dimensionen: Das erste Eintragsk¨astchen gibt
   * die Breite an, das Zweite die Höhe des gewünschten Spielfeldes.
   */
  @Override
  public void setGroeÃŸe(int x, int y)
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

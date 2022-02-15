package regeleditor;

import java.io.File;

import zufallsgenerator.ZufallsgeneratorPrototyp;

public class Regeleditor implements RegeleditorSchnittstelle
{
  File geladen;
  boolean topologie;
  ZufallsgeneratorPrototyp random;

  /**
   * 
   */
  public Regeleditor()
  {
    // TODO Auto-generated constructor stub
  }

  
  /**
   *  Regeleditor: RF-01 | Laden Ruft den Filechooser zum Laden eines anderen Regelausdrucks auf
   */
  @Override
  public void re_laden()
  {
    
  }
  

  /**
   * RF-02: Speichern | Ruft den Java-Swing-Filechooser zum Speichern des aktuellen Regelausdrucks auf.
   */
  @Override
  public boolean re_speichern()
  {
	// Gibt immer false zurück, weil noch nicht implementiert
	return false;
  }


  /**
   * RF-03: Topologiewechsler | Auswahlschalter für das Spielfeldrandverhalten.
   */
  @Override
  public boolean getTopo()
  {
    // TODO Auto-generated method stub
    return false;
  }
  

  /**
   * RF-04: Regel Bearbeiten | Ruft das Popup-Fenster zum Regelausdruck bearbeiten auf.
   */
  @Override
  public void regelDialog()
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String getRegel()
  {
    // TODO Auto-generated method stub
    return null;
  }

}

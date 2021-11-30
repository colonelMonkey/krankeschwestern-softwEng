package hauptPaket;

import de.eikelberg.guitools.ESinglePanelFrame;

public class Programmstart
{

  public static void main(String[] args)
  {
// 1. Die Startmeldung erfolgt mit einem JOptionPane-Meldungsfenster, 
// ge�ffnet aus der Methode initialize() des Panels MainPanels     
    
// 2. Fensterbeschriftung festlegen 
    String titel = "Game of Life";

// 3. Panel instanziieren    
    MainPanel mp = new MainPanel();
    
// 4. Fenster instanziieren und dabei Referenz auf das Panel sowie
// die Fensterbeschriftung an den Konstruktor �bergeben    
    new ESinglePanelFrame(mp,titel).setResizable(false);
  }

 
}

package hauptPaket;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.eikelberg.guitools.ESinglePanelFrame;

@objid ("cb4a24ab-ad35-499e-98f4-db23cc4a8ada")
public class Programmstart {
    @objid ("e9f4c8b3-4a7c-41ba-97d4-81b65b4a6bcc")
    public MainPanel mainPanel;

    @objid ("cccaf7cc-6c71-44fc-9ffc-320189e5e576")
    public static void main(String[] args) {
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

import javax.swing.JFileChooser;
 
public class OeffnenDialog
{
    public static void main(String[] args)
    {
        // JFileChooser-Objekt erstellen
        JFileChooser chooser = new JFileChooser();
        // Dialog zum Oeffnen von Dateien anzeigen
        chooser.showOpenDialog(null);
    }
}

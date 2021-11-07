import javax.swing.JFileChooser;
 
public class SpeichernDialog
{
    // main-Methode
    public static void main(String[] args)
    {
        // JFileChooser-Objekt erstellen
        JFileChooser chooser = new JFileChooser();
        // Dialog zum Speichern von Dateien anzeigen
        chooser.showSaveDialog(null);
    }
}

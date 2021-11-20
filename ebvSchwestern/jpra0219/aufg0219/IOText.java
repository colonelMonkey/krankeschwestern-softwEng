package aufg0219;
import de.eikelberg.iotools.*;
public class IOText
{

  public static void main(String[] args)
  {
    //Einlesen
    DatasetIn reader = new DatasetIn("daten\\input.txt");
    String in = reader.dReadLine();
    reader.dClose();
    //ausgeben
    DatasetOut writer = new DatasetOut("daten\\output.txt");
    writer.dPrintln("Der output ist: "+in);
    writer.dClose();
    
  }

}

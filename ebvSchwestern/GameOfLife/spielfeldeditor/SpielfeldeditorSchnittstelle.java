package spielfeldeditor;

import zufallsgenerator.ZufallsgeneratorSchnittstelle;

public interface SpielfeldeditorSchnittstelle
{
  ZufallsgeneratorSchnittstelle getZufallsgenerator();
  void se_laden();
  void se_einfuegen();
  void se_speichern();
  void setGroeße(int x, int y);
  void fuelleZufall();
  
  
}

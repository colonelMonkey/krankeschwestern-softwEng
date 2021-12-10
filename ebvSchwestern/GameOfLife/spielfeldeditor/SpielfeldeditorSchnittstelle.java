package spielfeldeditor;

import zufallsgenerator.ZufallsgeneratorPrototyp;


public interface SpielfeldeditorSchnittstelle
{
  ZufallsgeneratorPrototyp getZufallsgenerator();
  void se_laden();
  void se_einfuegen();
  void se_speichern();
  void setGroeße(int x, int y);
  void fuelleZufall();
  void clear();
  
  
}

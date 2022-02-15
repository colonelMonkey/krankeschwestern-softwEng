package arbeiter;

import java.awt.Point;

public abstract class MalerarbeiterSchnittstelle
{
  
  Point linksOben, rechtsUnten;
  int [][] current, nextGen;
  

  /**
   * 
   * @param lO
   * @param rU
   * @param current
   * @param nextGen
   */
  MalerarbeiterSchnittstelle(Point lO, Point rU,int [][] current, int [][] nextGen )
  {
    linksOben = lO;
    rechtsUnten = rU;
    this.current = current;
    this.nextGen = nextGen;
  }
  
  abstract void Faerbe();
}

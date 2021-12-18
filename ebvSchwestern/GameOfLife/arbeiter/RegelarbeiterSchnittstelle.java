package arbeiter;
import java.awt.Point;

public abstract class RegelarbeiterSchnittstelle
{
  Point linksOben, rechtsUnten;
  int [][] current, nextGen;
  int [][] testDiaa = {{0,0,0,0},
                       {0,1,1,0},
                       {1,0,1,0},
                       {0,1,0,0}};
  
  RegelarbeiterSchnittstelle(Point lO, Point rU,int [][] current, int [][] nextGen )
  {
    linksOben = lO;
    rechtsUnten = rU;
    this.current = current;
    this.nextGen = nextGen;
  }
  
  abstract void transit();
}

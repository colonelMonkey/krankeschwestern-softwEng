package arbeiter;
import java.awt.Point;



public class RegelarbeiterSchnittstelle
{
  
  public RegelarbeiterSchnittstelle(){}
	
  Point linksOben, rechtsUnten;
  int [][] current, nextGen;
  

  
  RegelarbeiterSchnittstelle(Point lO, Point rU,int [][] current, int [][] nextGen )
  {
    linksOben = lO;
    rechtsUnten = rU;
    this.current = current;
    this.nextGen = nextGen;
  }
  
  public static int[][]  transit(int[][] currentGen) {
	  return new int[5][5]; //muss noch programmiert werden
  };
  
}

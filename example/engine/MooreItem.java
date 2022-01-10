package engine;

public class MooreItem implements FormulaItem {
	@Override 
	public int calculate(int x, int y, Zellen feld) {
		    return feld.readZelle(x-1, y-1)
		         + feld.readZelle(x-1, y)
		         + feld.readZelle(x-1, y+1)
		         + feld.readZelle(  x, y+1)
		         + feld.readZelle(x+1, y+1)
		         + feld.readZelle(x+1, y)
		         + feld.readZelle(x+1, y-1)
		         + feld.readZelle(  x, y-1);
		 }
}

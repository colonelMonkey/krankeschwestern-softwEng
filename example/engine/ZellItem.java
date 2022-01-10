package engine;

public class ZellItem implements FormulaItem{
	  int mDX, mDY;

	  ZellItem(int dx, int dy) {
	    mDX = dx;
	    mDY = dy;
	  }
	  @Override
	public
	  int calculate(int x, int y, Zellen feld) {//Erlaubt ein Spielfeld und ein x/y zu übergeben, um den Wert der Zelle zurückzugeben.
	    return feld.readZelle(x + mDX, y + mDY);
	  }
}

package engine;

public class ConstItem implements FormulaItem {
	  int mValue;
	  public ConstItem(int value) {
	    mValue = value;
	  }
	  @Override
	public
	  int calculate(int x, int y, Zellen feld) {
	    return mValue;
	  }
}

package engine;

import java.util.Stack;

public class Simulator {
	  private Zellen mCurrentFeld;
	  private FormulaItem mRoot;

	  public Simulator(String formula) {
	    mRoot = parseUPNFormula(formula);
	  }

	  public void setFeld(Zellen feld) {
	    mCurrentFeld = feld;
	  }

	  private FormulaItem parseUPNFormula(String formula) {
	    Stack<FormulaItem> stack = new Stack<>();
	    int len = formula.length();
	    for (int i=0; i<len; i++) {
	      char token = formula.charAt(i);
	      FormulaItem cur = null;

	      switch (token) {
	        case 'a': cur = new ZellItem(-1, -1); break;
	        case 'b': cur = new ZellItem(-1, 0); break;
	        case 'c': cur = new ZellItem(-1, 1); break;
	        case 'd': cur = new ZellItem(0, 1); break;
	        case 'e': cur = new ZellItem(1, 1); break;
	        case 'f': cur = new ZellItem(1, 0); break;
	        case 'g': cur = new ZellItem(1, -1); break;
	        case 'h': cur = new ZellItem(0, -1); break;
	        case 'z': cur = new ZellItem(0, 0); break;
	        case '0': cur = new ConstItem(0); break;
	        case '1': cur = new ConstItem(1); break;
	        case '2': cur = new ConstItem(2); break;
	        case '3': cur = new ConstItem(3); break;
	        case '4': cur = new ConstItem(4); break;
	        case '5': cur = new ConstItem(5); break;
	        case '6': cur = new ConstItem(6); break;
	        case '7': cur = new ConstItem(7); break;
	        case '8': cur = new ConstItem(8); break;
	        case '9': cur = new ConstItem(9); break;
	        case 'm': cur = new MooreItem(); break;
	        case 'n': cur = new NeumannItem(); break;
	        case '+': cur = new OperatorItem(Operator.Add, stack); break;
	        //Weitere Operatoren für den Parser fehlen noch.
	      }
	      stack.push(cur);
	    }
	    return stack.pop();
	  } 
	    
	    void doOneStep() {
			    Zellen prevFeld = mCurrentFeld.clone();
			    for (int x=0; x<mCurrentFeld.SX; x++) {
			      for (int y=0; y<mCurrentFeld.SY; y++) {
			        mCurrentFeld.setZelle(x, y, mRoot.calculate(x, y, prevFeld));
			      }
			    }
			  }
}

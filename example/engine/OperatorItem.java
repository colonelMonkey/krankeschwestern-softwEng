package engine;

import java.util.Stack;
public class OperatorItem implements FormulaItem {
	  FormulaItem mLinks;
	  FormulaItem mRechts;
	  Operator mOp;

	  public OperatorItem(Operator op, Stack<FormulaItem> stack) {
	    mRechts = stack.pop();
	    mLinks = stack.pop();
	    mOp = op;
	  }
	  @Override
	  public int calculate(int x, int y, Zellen feld) {
	    int links = mLinks.calculate(x, y, feld);
	    int rechts = mRechts.calculate(x, y, feld);
	    int ergebnis = 0; 
	    
	    switch (mOp) {
	    case Add :      ergebnis = links +  rechts; break;
	    case Subtract :  ergebnis =  links -  rechts; break;
	    case Multiply:   ergebnis =  links *  rechts; break;
	    case Divide:    ergebnis =  links /  rechts; break;
	    case LessThan:  ergebnis = links <  rechts ? 1 : 0; break;
	    case MoreThan:  ergebnis = links >  rechts ? 1 : 0; break;
	    case Equals:    ergebnis=  links == rechts ? 1 : 0; break;  
	    case And:       ergebnis = ((links !=0) && (rechts != 0)) ? 1: 0; break;
	    case Or:        ergebnis = ((links !=0)||(rechts !=0)) ? 1: 0; break;
	    case Xor:       ergebnis = ((links != rechts)) ? 1: 0; break;	    }
	  
	  return ergebnis;
	  }
}
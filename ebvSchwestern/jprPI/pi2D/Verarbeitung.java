package pi2D;

public class Verarbeitung
{
  private Verarbeitung() { }
  
  public static void calculate(MainPanel mp)
  {
    //update graphics
    int n = (int)mp.getSpinnerEdges().getModel().getValue();
    System.out.println(n);
    double alpha = (2 * Math.PI)/n;
    System.out.println(alpha);
    mp.getPnlGrapics().setN(n);
    mp.getPnlGrapics().repaint();
    //calculate PI
    int diameter = 1;
    double apprPI = (n * Math.sin(alpha/2) * diameter) / diameter;
    double precision = apprPI / Math.PI;
    mp.getTfCalculatedValue().setText("" + apprPI);
    mp.getTfPrecision().setText(Math.round(precision*1E11)/1E9 + "%");

  }
}

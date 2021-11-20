package pi2D;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class nGonPanel extends JPanel
{
  /**
   * 
   */
  private static final long serialVersionUID = 314L;
  
  private int n;
  private double alpha = 2*Math.PI / n;
  
  
  public double getAlpha()
  {
    return alpha;
  }

  public void setAlpha(double alpha)
  {
    this.alpha = alpha;
  }

  public int getN()
  {
    return n;
  }

  public void setN(int n)
  {
    this.n = n;
  }

  public nGonPanel(int n)
  {
    this.n = n;
  }
  
  protected void paintComponent( Graphics g )
  {
    super.paintComponent(g);
    int corner = 2;
    int diameter = g.getClipBounds().height-5;
    int middle = diameter/2 + corner;
    paintCircle(g, diameter, corner);
    //triangles
    paintNGon(g, middle, diameter-1);
    paintPoint(g, middle, middle);
    
    
  }
  private void paintCircle(Graphics g, int d, int offset) 
  {
    g.drawOval(offset, offset, d, d);
  }
  
  private void paintPoint(Graphics g, int x, int y)
  {
    g.setColor(Color.RED);
    g.drawOval(x, y, 2, 2);
    g.fillOval(x, y, 2, 2);
    g.setColor(Color.BLACK);
  }
  
  private void paintNGon(Graphics g, int middle, int d) 
  {
    alpha = 2*Math.PI / n;
    double angle = 0;
    int x1 = (int)Math.round(Math.cos(angle)*d*0.5);
    int y1 = (int)Math.round(Math.sin(angle)*d*0.5);
    for(int i = 0; i < n; i++)
    {
      g.setColor(Color.DARK_GRAY);
      g.drawLine(middle, middle, middle + x1,  middle + y1);
      angle += alpha;
      int x2 = (int)Math.round(Math.cos(angle)*d*0.5);
      int y2 = (int)Math.round(Math.sin(angle)*d*0.5);
      g.setColor(Color.BLUE);
      g.drawLine(middle + x1, middle + y1, middle + x2, middle + y2);
      x1 = x2;
      y1 = y2;
    }
    g.setColor(Color.BLACK);
  }
  
  

}

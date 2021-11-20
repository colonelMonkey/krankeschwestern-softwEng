package bspMandelbrot;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Canvas;

public class MainPanel extends JPanel
{

  private static final long serialVersionUID = 700L;
  private MyCanvas canvas;

  public MainPanel()
  {
    initialize();
  }

  private void initialize()
  {
// Startmeldung
    /*/
    JOptionPane.showMessageDialog(this.getMainPanel(),
        "Muster-Programm für die Programmierung grafischer Benutzeroberflächen gemäß Kap. 13\n"
            + "Copyright 2009, 2016 by M. Eikelberg (www.eikelberg.de)",
        "", JOptionPane.INFORMATION_MESSAGE);
        /*/
    setSize(new Dimension(1200, 900));
    setPreferredSize(new Dimension(1200, 900));
    setLayout(null);
    add(getCanvas());
    new Verarbeitung().testBI(getMainPanel());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }
  protected MyCanvas getCanvas() {
    if (canvas == null) {
    	canvas = new MyCanvas();
    	canvas.setBounds(0, 0, 1200, 900);
    }
    return canvas;
  }
}

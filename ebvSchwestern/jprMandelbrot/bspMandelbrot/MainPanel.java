package bspMandelbrot;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Canvas;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class MainPanel extends JPanel
{
  
  static double scale = 1.2;
  static int xoff = 500;
  static int yoff = 0;
  static int shiftX = 0;
  static int shiftY = 0;

  private static final long serialVersionUID = 700L;
  private MyCanvas canvas;
  private JMenuBar menuBar;
  private JButton butRedraw;
  private JMenuItem mntmScale;
  private Verarbeitung mV; 

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
    setSize(new Dimension(1920, 1080));
    setPreferredSize(new Dimension(1920, 1080));
    setLayout(null);
    add(getMenuBar());
    add(getCanvas());
    mV = new Verarbeitung();
    mV.testBI(getMainPanel());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }
  protected MyCanvas getCanvas() {
    if (canvas == null) {
    	canvas = new MyCanvas();
    	canvas.addMouseListener(new MouseAdapter() {
    	  @Override
    	  public void mouseClicked(MouseEvent arg0) {
    	    shiftX = (int) ((arg0.getX()- getMainPanel().getWidth()/2));
    	    shiftY = (int) ((arg0.getY()- getMainPanel().getHeight()/2));
    	    
    	  }
    	});
    	canvas.addMouseWheelListener(new MouseWheelListener() {
    	  public void mouseWheelMoved(MouseWheelEvent arg0) {
    	    double scrl = arg0.getUnitsToScroll() * 0.0005;
    	    if(scrl < 0)
    	      scale *= 0.95;
    	    else
    	      scale *= 1.05;
    	    getMntmScale().setText("Scale: "+scale);
    	    
    	  }
    	});
    	canvas.setBounds(0, 20, 1920, 1080);
    }
    return canvas;
  }
  protected JMenuBar getMenuBar() {
    if (menuBar == null) {
    	menuBar = new JMenuBar();
    	menuBar.setBounds(0, 0, 1920, 21);
    	menuBar.add(getButRedraw());
    	menuBar.add(getMntmScale());
    }
    return menuBar;
  }
  protected JButton getButRedraw() {
    if (butRedraw == null) {
    	butRedraw = new JButton("Redraw");
    	butRedraw.addMouseListener(new MouseAdapter() {
    	  @Override
    	  public void mouseClicked(MouseEvent arg0) {
    	    xoff -= shiftX;
    	    yoff += shiftY;
    	    mV.testBI(getMainPanel());
    	    xoff = 0;
          yoff = 0;
    	    
    	  }
    	});
    }
    return butRedraw;
  }
  protected JMenuItem getMntmScale() {
    if (mntmScale == null) {
    	mntmScale = new JMenuItem("");
    }
    return mntmScale;
  }
}

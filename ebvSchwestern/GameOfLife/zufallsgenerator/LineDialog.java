package zufallsgenerator;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class LineDialog extends JDialog
{
  private JLabel lbVon;
  private JLabel lbBis;
  private JLabel lbGewicht;
  private JTextField tfVon;
  private JTextField tfBis;
  private JTextField tfGewicht;

  public LineDialog()
  {
    // TODO Auto-generated constructor stub
    initialize();
  }
  private void initialize() {
    getContentPane().setLayout(null);
    getContentPane().add(getLbVon());
    getContentPane().add(getLbBis());
    getContentPane().add(getLbGewicht());
    getContentPane().add(getTfVon());
    getContentPane().add(getTfBis());
    getContentPane().add(getTfGewicht());
  }
  protected JLabel getLbVon() {
    if (lbVon == null) {
    	lbVon = new JLabel("von:");
    	lbVon.setBounds(121, 81, 70, 15);
    }
    return lbVon;
  }
  protected JLabel getLbBis() {
    if (lbBis == null) {
    	lbBis = new JLabel("bis:");
    	lbBis.setBounds(121, 108, 70, 15);
    }
    return lbBis;
  }
  protected JLabel getLbGewicht() {
    if (lbGewicht == null) {
    	lbGewicht = new JLabel("Gewicht:");
    	lbGewicht.setBounds(121, 135, 70, 15);
    }
    return lbGewicht;
  }
  protected JTextField getTfVon() {
    if (tfVon == null) {
    	tfVon = new JTextField();
    	tfVon.setBounds(209, 79, 114, 19);
    	tfVon.setColumns(10);
    }
    return tfVon;
  }
  protected JTextField getTfBis() {
    if (tfBis == null) {
    	tfBis = new JTextField();
    	tfBis.setBounds(209, 106, 114, 19);
    	tfBis.setColumns(10);
    }
    return tfBis;
  }
  protected JTextField getTfGewicht() {
    if (tfGewicht == null) {
    	tfGewicht = new JTextField();
    	tfGewicht.setBounds(209, 133, 114, 19);
    	tfGewicht.setColumns(10);
    }
    return tfGewicht;
  }
}

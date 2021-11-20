package pi2D;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainPanel extends JPanel
{

  private static final long serialVersionUID = 314L;
  private nGonPanel pnlGrapics;
  private JSpinner spinnerEdges;
  private JLabel lbNumberOfEdges;
  private JTextField tfCalculatedValue;
  private JLabel lbApproximatedValue;
  private JLabel lbPrecision;
  private JTextField tfPrecision;
  private JButton butCalculate;

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
    setSize(new Dimension(330, 160));
    setPreferredSize(new Dimension(340, 170));
    setLayout(null);
    add(getPnlGrapics());
    add(getSpinnerEdges());
    add(getLbNumberOfEdges());
    add(getTfCalculatedValue());
    add(getLbApproximatedValue());
    add(getLbPrecision());
    add(getTfPrecision());
    add(getButCalculate());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }
  protected nGonPanel getPnlGrapics() {
    if (pnlGrapics == null) {
    	pnlGrapics = new nGonPanel(3);
    	pnlGrapics.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
    	pnlGrapics.setBounds(181, 11, 151, 151);
    }
    return pnlGrapics;
  }
  protected JSpinner getSpinnerEdges() {
    if (spinnerEdges == null) {
    	spinnerEdges = new JSpinner();
    	spinnerEdges.setModel(new SpinnerNumberModel(3, 3, null, 1));
    	spinnerEdges.setBounds(119, 11, 51, 20);
    }
    return spinnerEdges;
  }
  protected JLabel getLbNumberOfEdges() {
    if (lbNumberOfEdges == null) {
    	lbNumberOfEdges = new JLabel("Number of Edges:\r\n");
    	lbNumberOfEdges.setBounds(10, 14, 110, 14);
    }
    return lbNumberOfEdges;
  }
  protected JTextField getTfCalculatedValue() {
    if (tfCalculatedValue == null) {
    	tfCalculatedValue = new JTextField();
    	tfCalculatedValue.setHorizontalAlignment(SwingConstants.CENTER);
    	tfCalculatedValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
    	tfCalculatedValue.setEditable(false);
    	tfCalculatedValue.setBounds(10, 64, 160, 30);
    	tfCalculatedValue.setColumns(10);
    }
    return tfCalculatedValue;
  }
  protected JLabel getLbApproximatedValue() {
    if (lbApproximatedValue == null) {
    	lbApproximatedValue = new JLabel("Approximated Value:");
    	lbApproximatedValue.setBounds(10, 39, 131, 14);
    }
    return lbApproximatedValue;
  }
  protected JLabel getLbPrecision() {
    if (lbPrecision == null) {
    	lbPrecision = new JLabel("Precision:");
    	lbPrecision.setBounds(10, 108, 58, 14);
    }
    return lbPrecision;
  }
  protected JTextField getTfPrecision() {
    if (tfPrecision == null) {
    	tfPrecision = new JTextField();
    	tfPrecision.setEditable(false);
    	tfPrecision.setBounds(74, 105, 96, 20);
    	tfPrecision.setColumns(10);
    }
    return tfPrecision;
  }
  protected JButton getButCalculate() {
    if (butCalculate == null) {
    	butCalculate = new JButton("Calculate");
    	butCalculate.addMouseListener(new MouseAdapter() {
    	  @Override
    	  public void mouseClicked(MouseEvent arg0) {
    	    Verarbeitung.calculate(getMainPanel());
    	  }
    	});
    	butCalculate.setBounds(10, 136, 161, 25);
    }
    return butCalculate;
  }
}

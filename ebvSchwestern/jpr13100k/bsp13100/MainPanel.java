package bsp13100;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel
{

  private static final long serialVersionUID = 700L;
  private JLabel lbSchrittWeite;
  private JTextField tfSchrittWeite;
  private JPanel panel;
  private JRadioButton rbAufwrts;
  private JRadioButton rbAbwrts;
  private final ButtonGroup buttonGroup = new ButtonGroup();
  private JButton butZaehlungDurchfuehren;
  private JLabel lbZaehlerstand;
  private JTextField tfZaehlerStand;

  public MainPanel()
  {
    initialize();
  }

  private void initialize()
  {
// Startmeldung
    JOptionPane.showMessageDialog(
      this.getMainPanel(),
      "Nicholas Schuran 01831899",
      "",
      JOptionPane.INFORMATION_MESSAGE);
    setSize(new Dimension(270, 170));
    setPreferredSize(new Dimension(270, 170));
    setLayout(null);
    add(getLbSchrittWeite());
    add(getTfSchrittWeite());
    add(getPanel());
    add(getButZaehlungDurchfuehren());
    add(getLbZaehlerstand());
    add(getTfZaehlerStand());
  }
  public ButtonGroup getButtonGroup()
  {
    return buttonGroup;
  }

  private MainPanel getMainPanel()
  {
    return this;
  }
  protected JLabel getLbSchrittWeite() {
    if (lbSchrittWeite == null) {
    	lbSchrittWeite = new JLabel("Schrittweite:");
    	lbSchrittWeite.setBounds(10, 11, 100, 20);
    }
    return lbSchrittWeite;
  }
  protected JTextField getTfSchrittWeite() {
    if (tfSchrittWeite == null) {
    	tfSchrittWeite = new JTextField();
    	tfSchrittWeite.setBounds(120, 11, 140, 20);
    	tfSchrittWeite.setColumns(10);
    }
    return tfSchrittWeite;
  }
  protected JPanel getPanel() {
    if (panel == null) {
    	panel = new JPanel();
    	panel.setBorder(new TitledBorder(null, "Z\u00E4hlrichtung", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    	panel.setBounds(10, 42, 250, 49);
    	panel.add(getRbAufwrts());
    	panel.add(getRbAbwrts());
    }
    return panel;
  }
  protected JRadioButton getRbAufwrts() {
    if (rbAufwrts == null) {
    	rbAufwrts = new JRadioButton("aufw\u00E4rts");
    	rbAufwrts.setActionCommand("aufw");
    	rbAufwrts.setSelected(true);
    	buttonGroup.add(rbAufwrts);
    }
    return rbAufwrts;
  }
  protected JRadioButton getRbAbwrts() {
    if (rbAbwrts == null) {
    	rbAbwrts = new JRadioButton("abw\u00E4rts");
    	rbAbwrts.setActionCommand("abw");
    	buttonGroup.add(rbAbwrts);
    }
    return rbAbwrts;
  }
  protected JButton getButZaehlungDurchfuehren() {
    if (butZaehlungDurchfuehren == null) {
    	butZaehlungDurchfuehren = new JButton("Z\u00E4hlung durchf\u00FChren");
    	butZaehlungDurchfuehren.addKeyListener(new KeyAdapter() {
    	  @Override
    	  public void keyTyped(KeyEvent arg0) {
    	    Verarbeitung.zaehle(getMainPanel());
    	  }
    	});
    	butZaehlungDurchfuehren.addMouseListener(new MouseAdapter() {
    	  @Override
    	  public void mouseClicked(MouseEvent arg0) {
    	    Verarbeitung.zaehle(getMainPanel());
    	  }
    	});
    	butZaehlungDurchfuehren.setBounds(10, 102, 250, 20);
    }
    return butZaehlungDurchfuehren;
  }
  protected JLabel getLbZaehlerstand() {
    if (lbZaehlerstand == null) {
    	lbZaehlerstand = new JLabel("Z\u00E4hlerstand");
    	lbZaehlerstand.setBounds(10, 133, 100, 20);
    }
    return lbZaehlerstand;
  }
  protected JTextField getTfZaehlerStand() {
    if (tfZaehlerStand == null) {
    	tfZaehlerStand = new JTextField();
    	tfZaehlerStand.setText("0");
    	tfZaehlerStand.setEditable(false);
    	tfZaehlerStand.setColumns(10);
    	tfZaehlerStand.setBounds(120, 133, 140, 20);
    }
    return tfZaehlerStand;
  }
  private class SwingAction extends AbstractAction {
    public SwingAction() {
      putValue(NAME, "SwingAction");
      putValue(SHORT_DESCRIPTION, "Some short description");
    }
    public void actionPerformed(ActionEvent e) {
    }
  }
  
}

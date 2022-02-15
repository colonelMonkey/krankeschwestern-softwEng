package zufallsgenerator;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Dimension;

public class TableDialog extends JDialog
{
  private JTable tabX;
  private LineDialog lDiaa;
  private JButton butX;
  private JButton butEntfernen;
  private JButton butBearbeiten;
  private JButton butbernehmen;
  private JButton butAbbrechen;

  public TableDialog()
  {
    // TODO Auto-generated constructor stub
    initialize();
  }
  private void initialize() {
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(null);
    getContentPane().add(getTabX());
    getContentPane().add(getButX());
    getContentPane().add(getButEntfernen());
    getContentPane().add(getButBearbeiten());
    getContentPane().add(getButbernehmen());
    getContentPane().add(getButAbbrechen());
  }
  protected JTable getTabX() {
    if (tabX == null) {
    	tabX = new JTable();
    	tabX.setBounds(12, 0, 402, 191);
    }
    return tabX;
  }
  protected JButton getButX() {
    if (butX == null) {
    	butX = new JButton("+");
    	butX.setBounds(132, 203, 44, 25);
    }
    return butX;
  }
  protected JButton getButEntfernen() {
    if (butEntfernen == null) {
    	butEntfernen = new JButton("Entfernen");
    	butEntfernen.setBounds(188, 203, 117, 25);
    }
    return butEntfernen;
  }
  protected JButton getButBearbeiten() {
    if (butBearbeiten == null) {
    	butBearbeiten = new JButton("Bearbeiten");
    	butBearbeiten.setBounds(321, 203, 117, 25);
    }
    return butBearbeiten;
  }
  protected JButton getButbernehmen() {
    if (butbernehmen == null) {
    	butbernehmen = new JButton("Übernehmen");
    	butbernehmen.setBounds(313, 239, 125, 25);
    }
    return butbernehmen;
  }
  protected JButton getButAbbrechen() {
    if (butAbbrechen == null) {
    	butAbbrechen = new JButton("Abbrechen");
    	butAbbrechen.setBounds(188, 240, 117, 25);
    }
    return butAbbrechen;
  }
  protected int[] zeigZeilenDialog() {
    int[] ausgabe = {0,0,0};
    return ausgabe;
  }
}

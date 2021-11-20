package bsp13100;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class MainPanel extends JPanel
{

  private static final long serialVersionUID = 700L;

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
    setSize(new Dimension(300, 200));
    setPreferredSize(new Dimension(300, 200));
    setLayout(null);
  }

  private MainPanel getMainPanel()
  {
    return this;
  }
}

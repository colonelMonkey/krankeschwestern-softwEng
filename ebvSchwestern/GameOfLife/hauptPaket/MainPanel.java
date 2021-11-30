package hauptPaket;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.awt.ComponentOrientation;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class MainPanel extends JPanel
{

  private static final long serialVersionUID = 700L;
  private JMenuBar menuBar;
  private JMenu mnSpielfeldeditor;
  private JMenu mnRegeleditor;
  private JLabel lbZustand;
  private JMenuItem mntmSLaden;
  private JMenuItem mntmSEinfgen;
  private JMenuItem mntmSSpeichern;
  private JSeparator separator_1;
  private JLabel lbGre;
  private JPanel panel;
  private JTextField tfBreite;
  private JLabel lbX_1;
  private JTextField tfHoehe;
  private JMenuItem mntmAnwenden;
  private JSeparator separator;
  private JMenuItem mntmZufallsgenerator;
  private JSeparator separator_2;
  private JMenuItem mntmFeldLeeren;
  private JLabel lbRegelsatzGameoflifetxt;
  private JSeparator separator_3;
  private JMenuItem mntmRLaden;
  private JMenuItem mntmRSpeichern;
  private JSeparator separator_4;
  private JLabel lbTopologie;
  private JRadioButtonMenuItem rdbtnmntmStandard;
  private JRadioButtonMenuItem rdbtnmntmTorus;
  private final ButtonGroup bGTopo = new ButtonGroup();
  private JSeparator separator_5;
  private JMenuItem mntmRegelBearbeiten;
  private JPanel panelBottomBar;
  private Button buttonPlayPause;
  private Button buttonSchritt;
  private JPanel panelSlider;
  private JSlider slDelay;
  private JLabel lbVerzgerung;
  private JSpinner spZellLupe;
  private MyCanvas canvas;

  public MainPanel()
  {
    initialize();
  }

  private void initialize()
  {
    setPreferredSize(new Dimension(1300, 900));
    setThisSize(new Dimension(1300, 900));
    setLayout(null);
    add(getMenuBar());
    add(getPanelBottomBar());
    add(getCanvas());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }
  public Dimension getThisSize() {
    return getSize();
  }
  public void setThisSize(Dimension size) {
    setSize(size);
  }
  protected JMenuBar getMenuBar() {
    if (menuBar == null) {
    	menuBar = new JMenuBar();
    	menuBar.setBounds(0, 0, 1300, 21);
    	menuBar.add(getMnSpielfeldeditor());
    	menuBar.add(getMnRegeleditor());
    }
    return menuBar;
  }
  protected JMenu getMnSpielfeldeditor() {
    if (mnSpielfeldeditor == null) {
    	mnSpielfeldeditor = new JMenu("Spielfeldeditor");
    	mnSpielfeldeditor.add(getLbZustand());
    	mnSpielfeldeditor.add(getMntmSLaden());
    	mnSpielfeldeditor.add(getMntmSEinfgen());
    	mnSpielfeldeditor.add(getMntmSSpeichern());
    	mnSpielfeldeditor.add(getSeparator_1());
    	mnSpielfeldeditor.add(getLbGre());
    	mnSpielfeldeditor.add(getPanel());
    	mnSpielfeldeditor.add(getMntmAnwenden());
    	mnSpielfeldeditor.add(getSeparator_2());
    	mnSpielfeldeditor.add(getMntmZufallsgenerator());
    	mnSpielfeldeditor.add(getSeparator());
    	mnSpielfeldeditor.add(getMntmFeldLeeren());
    }
    return mnSpielfeldeditor;
  }
  protected JMenu getMnRegeleditor() {
    if (mnRegeleditor == null) {
    	mnRegeleditor = new JMenu("Regeleditor");
    	mnRegeleditor.add(getLbRegelsatzGameoflifetxt());
    	mnRegeleditor.add(getSeparator_3());
    	mnRegeleditor.add(getMntmRLaden());
    	mnRegeleditor.add(getMntmRSpeichern());
    	mnRegeleditor.add(getSeparator_4());
    	mnRegeleditor.add(getLbTopologie());
    	mnRegeleditor.add(getRdbtnmntmStandard());
    	mnRegeleditor.add(getRdbtnmntmTorus());
    	mnRegeleditor.add(getSeparator_5());
    	mnRegeleditor.add(getMntmRegelBearbeiten());
    }
    return mnRegeleditor;
  }
  protected JLabel getLbZustand() {
    if (lbZustand == null) {
    	lbZustand = new JLabel("Zustand");
    	lbZustand.setFont(new Font("Dialog", Font.BOLD, 13));
    }
    return lbZustand;
  }
  protected JMenuItem getMntmSLaden() {
    if (mntmSLaden == null) {
    	mntmSLaden = new JMenuItem("Laden");
    }
    return mntmSLaden;
  }
  protected JMenuItem getMntmSEinfgen() {
    if (mntmSEinfgen == null) {
    	mntmSEinfgen = new JMenuItem("Einfügen");
    }
    return mntmSEinfgen;
  }
  protected JMenuItem getMntmSSpeichern() {
    if (mntmSSpeichern == null) {
    	mntmSSpeichern = new JMenuItem("Speichern");
    }
    return mntmSSpeichern;
  }
  protected JSeparator getSeparator_1() {
    if (separator_1 == null) {
    	separator_1 = new JSeparator();
    }
    return separator_1;
  }
  protected JLabel getLbGre() {
    if (lbGre == null) {
    	lbGre = new JLabel("Größe");
    	lbGre.setFont(new Font("Dialog", Font.BOLD, 13));
    }
    return lbGre;
  }
  protected JPanel getPanel() {
    if (panel == null) {
    	panel = new JPanel();
    	panel.add(getTfBreite());
    	panel.add(getLbX_1());
    	panel.add(getTfHoehe());
    }
    return panel;
  }
  protected JTextField getTfBreite() {
    if (tfBreite == null) {
    	tfBreite = new JTextField();
    	tfBreite.setColumns(5);
    }
    return tfBreite;
  }
  protected JLabel getLbX_1() {
    if (lbX_1 == null) {
    	lbX_1 = new JLabel("x");
    }
    return lbX_1;
  }
  protected JTextField getTfHoehe() {
    if (tfHoehe == null) {
    	tfHoehe = new JTextField();
    	tfHoehe.setColumns(5);
    }
    return tfHoehe;
  }
  protected JMenuItem getMntmAnwenden() {
    if (mntmAnwenden == null) {
    	mntmAnwenden = new JMenuItem("Anwenden");
    }
    return mntmAnwenden;
  }
  protected JSeparator getSeparator() {
    if (separator == null) {
    	separator = new JSeparator();
    }
    return separator;
  }
  protected JMenuItem getMntmZufallsgenerator() {
    if (mntmZufallsgenerator == null) {
    	mntmZufallsgenerator = new JMenuItem("Zufallsgenerator");
    }
    return mntmZufallsgenerator;
  }
  protected JSeparator getSeparator_2() {
    if (separator_2 == null) {
    	separator_2 = new JSeparator();
    }
    return separator_2;
  }
  protected JMenuItem getMntmFeldLeeren() {
    if (mntmFeldLeeren == null) {
    	mntmFeldLeeren = new JMenuItem("Feld leeren");
    }
    return mntmFeldLeeren;
  }
  protected JLabel getLbRegelsatzGameoflifetxt() {
    if (lbRegelsatzGameoflifetxt == null) {
    	lbRegelsatzGameoflifetxt = new JLabel("Regelsatz: GameOfLife.txt");
    	lbRegelsatzGameoflifetxt.setFont(new Font("Dialog", Font.BOLD, 13));
    }
    return lbRegelsatzGameoflifetxt;
  }
  protected JSeparator getSeparator_3() {
    if (separator_3 == null) {
    	separator_3 = new JSeparator();
    }
    return separator_3;
  }
  protected JMenuItem getMntmRLaden() {
    if (mntmRLaden == null) {
    	mntmRLaden = new JMenuItem("Laden");
    }
    return mntmRLaden;
  }
  protected JMenuItem getMntmRSpeichern() {
    if (mntmRSpeichern == null) {
    	mntmRSpeichern = new JMenuItem("Speichern");
    }
    return mntmRSpeichern;
  }
  protected JSeparator getSeparator_4() {
    if (separator_4 == null) {
    	separator_4 = new JSeparator();
    }
    return separator_4;
  }
  protected JLabel getLbTopologie() {
    if (lbTopologie == null) {
    	lbTopologie = new JLabel("Topologie");
    	lbTopologie.setFont(new Font("Dialog", Font.BOLD, 13));
    }
    return lbTopologie;
  }
  protected JRadioButtonMenuItem getRdbtnmntmStandard() {
    if (rdbtnmntmStandard == null) {
    	rdbtnmntmStandard = new JRadioButtonMenuItem("Standard");
    	rdbtnmntmStandard.setSelected(true);
    	bGTopo.add(rdbtnmntmStandard);
    }
    return rdbtnmntmStandard;
  }
  protected JRadioButtonMenuItem getRdbtnmntmTorus() {
    if (rdbtnmntmTorus == null) {
    	rdbtnmntmTorus = new JRadioButtonMenuItem("Torus");
    	bGTopo.add(rdbtnmntmTorus);
    }
    return rdbtnmntmTorus;
  }
  protected JSeparator getSeparator_5() {
    if (separator_5 == null) {
    	separator_5 = new JSeparator();
    }
    return separator_5;
  }
  protected JMenuItem getMntmRegelBearbeiten() {
    if (mntmRegelBearbeiten == null) {
    	mntmRegelBearbeiten = new JMenuItem("Regel bearbeiten");
    }
    return mntmRegelBearbeiten;
  }
  protected JPanel getPanelBottomBar() {
    if (panelBottomBar == null) {
    	panelBottomBar = new JPanel();
    	panelBottomBar.setBorder(new LineBorder(new Color(0, 0, 0)));
    	panelBottomBar.setBounds(0, 810, 1300, 90);
    	panelBottomBar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    	panelBottomBar.add(getButtonPlayPause());
    	panelBottomBar.add(getButtonSchritt());
    	panelBottomBar.add(getPanelSlider());
    	panelBottomBar.add(getSpZellLupe());
    }
    return panelBottomBar;
  }
  protected Button getButtonPlayPause() {
    if (buttonPlayPause == null) {
    	buttonPlayPause = new Button("Play/Pause");
    	buttonPlayPause.setSize(new Dimension(120, 50));
    	buttonPlayPause.setPreferredSize(new Dimension(120, 50));
    	buttonPlayPause.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent arg0) {
    	  }
    	});
    }
    return buttonPlayPause;
  }
  protected Button getButtonSchritt() {
    if (buttonSchritt == null) {
    	buttonSchritt = new Button("Schritt");
    	buttonSchritt.setSize(new Dimension(120, 50));
    	buttonSchritt.setPreferredSize(new Dimension(120, 50));
    }
    return buttonSchritt;
  }
  protected JPanel getPanelSlider() {
    if (panelSlider == null) {
    	panelSlider = new JPanel();
    	panelSlider.setSize(new Dimension(250, 70));
    	panelSlider.setPreferredSize(new Dimension(250, 70));
    	panelSlider.add(getSlDelay());
    	panelSlider.add(getLbVerzgerung());
    }
    return panelSlider;
  }
  protected JSlider getSlDelay() {
    if (slDelay == null) {
    	slDelay = new JSlider();
    	slDelay.setPreferredSize(new Dimension(250, 42));
    	slDelay.setMinorTickSpacing(250);
    	slDelay.setPaintLabels(true);
    	slDelay.setPaintTicks(true);
    	slDelay.setSnapToTicks(true);
    	slDelay.setInverted(true);
    	Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
      labelTable.put(0, new JLabel("Warp 9") );
      for (int i = 1; i <= 5; i++)
      {
        labelTable.put(1000*i, new JLabel(""+i) );
      }
      slDelay.setLabelTable(labelTable);
    	slDelay.setMajorTickSpacing(1000);
    	slDelay.setMaximum(5000);
    	slDelay.setValue(1000);
    }
    return slDelay;
  }
  protected JLabel getLbVerzgerung() {
    if (lbVerzgerung == null) {
    	lbVerzgerung = new JLabel("Verzögerung[S]");
    }
    return lbVerzgerung;
  }
  protected JSpinner getSpZellLupe() {
    if (spZellLupe == null) {
    	spZellLupe = new JSpinner();
    	spZellLupe.setFont(new Font("Dialog", Font.BOLD, 30));
    	spZellLupe.setPreferredSize(new Dimension(80, 50));
    }
    return spZellLupe;
  }
  protected Canvas getCanvas() {
    if (canvas == null) {
    	canvas = new MyCanvas();
    	canvas.setBoundsG(0, 20, 1300, 790);
    }
    return canvas;
  }
}

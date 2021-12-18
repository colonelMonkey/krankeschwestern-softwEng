package hauptPaket;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Hashtable;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b7bc074e-80be-487c-a869-051664d5f47b")
public class MainPanel extends JPanel {
    @objid ("cc9e5fcf-b43f-4a0f-8399-c51d44f0047a")
    private static final long serialVersionUID = 700L;

    @objid ("619b3782-53bd-4ca3-808a-7c1fd70c1500")
    public Verarbeitung verarbeitung;

    @objid ("c91480a2-b4b9-4fa2-9bcd-b62b2fcc5600")
    public FeldGrafikSchittstelle feldGrafikSchittstelle;

    @objid ("ea866962-f2b7-414d-8236-710571bd513c")
    private JMenuBar menuBar;

    @objid ("1a5e5889-d3e8-4a9e-a6a9-ce5f533b71a2")
    private JMenu mnSpielfeldeditor;

    @objid ("9a028f33-f009-409c-8a95-f40e81dde9a1")
    private JMenu mnRegeleditor;

    @objid ("9adab0e7-ef03-4ccb-9d46-97377ccc2965")
    private JLabel lbZustand;

    @objid ("dba2c648-6c7d-4bbb-8f36-117a1e6a4adc")
    private JMenuItem mntmSLaden;

    @objid ("302e2453-2aa7-451b-b686-23aa97039c92")
    private JMenuItem mntmSEinfgen;

    @objid ("55f9111f-d611-4153-9256-e21a2f93c5ff")
    private JMenuItem mntmSSpeichern;

    @objid ("3c394518-76d1-4a95-b315-8daccd0571d6")
    private JSeparator separator_1;

    @objid ("0f4be6f4-ea67-4ade-9109-de78b67c7774")
    private JLabel lbGre;

    @objid ("206ea7de-14a9-47e5-9ff6-895430f1354e")
    private JPanel panel;

    @objid ("b6ce3bd8-187b-4d4a-abc0-30a899e5ff43")
    private JTextField tfBreite;

    @objid ("ae18c848-0954-4f1d-97ed-de25f646efd4")
    private JLabel lbX_1;

    @objid ("bba61325-f935-4967-adb4-afebe1c18a07")
    private JTextField tfHoehe;

    @objid ("d1747798-b0b7-4aeb-96e3-2b6fd2e35f07")
    private JMenuItem mntmAnwenden;

    @objid ("93c6b172-b4e5-46b5-adad-f1c888bec896")
    private JSeparator separator;

    @objid ("ef5c029f-50f2-48a4-9b04-f03b2d1483e4")
    private JMenuItem mntmZufallsgenerator;

    @objid ("3bf17f19-aa54-46bf-bacc-36bc742b2e1e")
    private JSeparator separator_2;

    @objid ("d83fd257-6a37-4532-aec7-8694df618b26")
    private JMenuItem mntmFeldLeeren;

    @objid ("76ec36a8-f114-408d-8423-072cab65f03f")
    private JLabel lbRegelsatzGameoflifetxt;

    @objid ("4c390808-7032-4d78-a436-13f92ea95062")
    private JSeparator separator_3;

    @objid ("82d78124-1642-46ba-a455-d09979acbeb9")
    private JMenuItem mntmRLaden;

    @objid ("d68d8e6f-d454-42b4-821b-d2fa0b1abe57")
    private JMenuItem mntmRSpeichern;

    @objid ("f3913237-1ef4-4485-a159-1553dd3a5173")
    private JSeparator separator_4;

    @objid ("e5330ba5-a867-4bd8-aedb-5284b92b5123")
    private JLabel lbTopologie;

    @objid ("8601c1b3-d69f-43f0-a95c-a896f22bae25")
    private JRadioButtonMenuItem rdbtnmntmStandard;

    @objid ("df3ff196-b33b-4c34-90cf-b4c3307debb1")
    private JRadioButtonMenuItem rdbtnmntmTorus;

    @objid ("e69281af-447a-4500-bbcf-e3c71c64b7d5")
    private final ButtonGroup bGTopo = new ButtonGroup();

    @objid ("0ce45bb9-2aba-4613-8806-8ceb27d02f56")
    private JSeparator separator_5;

    @objid ("29eb045b-46a8-48c3-ac75-ba121c92f270")
    private JMenuItem mntmRegelBearbeiten;

    @objid ("30ae0291-4b63-4b32-9c36-e15067e082f1")
    private JPanel panelBottomBar;

    @objid ("38b1cfb0-cd33-4567-a90e-25a7ed5de942")
    private JPanel panelSlider;

    @objid ("d9e35cf0-930a-47e2-830a-32b1a1bdd58d")
    private JSlider slDelay;

    @objid ("cb4bd14b-e284-4794-a3ef-7a246610ccd0")
    private JLabel lbVerzgerung;

    @objid ("81d36f72-786b-4d3b-801f-2384972e78b7")
    private JSpinner spZellLupe;

    @objid ("2f12cb23-e8f1-449e-a05a-75a64ef4cb4a")
    private Button buttonPlayPause;

    @objid ("72d20e8b-2977-4772-9073-0a34b71d171d")
    private Button buttonSchritt;

    @objid ("9f85cfbe-2899-4c30-a70c-1e82235484cd")
    public Verarbeitung verarbeitung;

    @objid ("1a52b959-4f1f-47dc-ac0e-e04bdeeec644")
    public FeldGrafikSchittstelle feldGrafikSchittstelle;

    @objid ("195b0a30-3625-46c2-aa2e-a620d1ccdd06")
    public MainPanel() {
        initialize();
    }

    @objid ("d57a76e7-2d8b-40d7-b9ed-754b7fe7b017")
    private void initialize() {
        setPreferredSize(new Dimension(1300, 900));
        setThisSize(new Dimension(1300, 900));
        setLayout(null);
        add(getMenuBar());
        add(getPanelBottomBar());
        add(getCanvas());
    }

    @objid ("dfd555a2-9b25-48a9-9004-01b59c4c859b")
    private MainPanel getMainPanel() {
        return this;
    }

    @objid ("0c6f210c-42d1-4c2a-8d47-31c3755a4c19")
    public Dimension getThisSize() {
        return getSize();
    }

    @objid ("70e3e9c8-cedc-432d-988e-75a0389c2ae9")
    public void setThisSize(Dimension size) {
        setSize(size);
    }

    @objid ("4ccc6683-ff6e-43a8-a574-27cb6ce5842a")
    protected JMenuBar getMenuBar() {
        if (menuBar == null) {
            menuBar = new JMenuBar();
            menuBar.setBounds(0, 0, 1300, 21);
            menuBar.add(getMnSpielfeldeditor());
            menuBar.add(getMnRegeleditor());
        }
        return menuBar;
    }

    @objid ("ee430d0b-2458-4688-9da9-52505d29c1b5")
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

    @objid ("a4feafd2-1564-48e2-b74f-0bc7a5bd2ab1")
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

    @objid ("a16e5147-a7e3-4d03-a07c-d39f66b0bddb")
    protected JLabel getLbZustand() {
        if (lbZustand == null) {
            lbZustand = new JLabel("Zustand");
            lbZustand.setFont(new Font("Dialog", Font.BOLD, 13));
        }
        return lbZustand;
    }

    @objid ("9da6e992-f64f-427f-8421-ccf29da093de")
    protected JMenuItem getMntmSLaden() {
        if (mntmSLaden == null) {
            mntmSLaden = new JMenuItem("Laden");
        }
        return mntmSLaden;
    }

    @objid ("9f3b240d-1f28-4ff0-a3e5-9a2ccd40e16b")
    protected JMenuItem getMntmSEinfgen() {
        if (mntmSEinfgen == null) {
            mntmSEinfgen = new JMenuItem("Einfügen");
        }
        return mntmSEinfgen;
    }

    @objid ("3d687fe6-0ebf-424e-935d-8c190bfa06e6")
    protected JMenuItem getMntmSSpeichern() {
        if (mntmSSpeichern == null) {
            mntmSSpeichern = new JMenuItem("Speichern");
        }
        return mntmSSpeichern;
    }

    @objid ("fceb9b0e-76f3-42fd-be10-f4c763187017")
    protected JSeparator getSeparator_1() {
        if (separator_1 == null) {
            separator_1 = new JSeparator();
        }
        return separator_1;
    }

    @objid ("fbedee18-0595-40d0-b515-e3b67a77c69d")
    protected JLabel getLbGre() {
        if (lbGre == null) {
            lbGre = new JLabel("Größe");
            lbGre.setFont(new Font("Dialog", Font.BOLD, 13));
        }
        return lbGre;
    }

    @objid ("20e5c8f7-bd90-42a8-8d0a-78c93d4a544e")
    protected JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.add(getTfBreite());
            panel.add(getLbX_1());
            panel.add(getTfHoehe());
        }
        return panel;
    }

    @objid ("afb9060b-849a-4ccf-927b-1e33f165efc8")
    protected JTextField getTfBreite() {
        if (tfBreite == null) {
            tfBreite = new JTextField();
            tfBreite.setColumns(5);
        }
        return tfBreite;
    }

    @objid ("abad99da-ca1a-4fdc-8d20-827b5634cf7f")
    protected JLabel getLbX_1() {
        if (lbX_1 == null) {
            lbX_1 = new JLabel("x");
        }
        return lbX_1;
    }

    @objid ("72335eac-143a-4959-9743-11802726c18f")
    protected JTextField getTfHoehe() {
        if (tfHoehe == null) {
            tfHoehe = new JTextField();
            tfHoehe.setColumns(5);
        }
        return tfHoehe;
    }

    @objid ("e0677590-ba77-4260-b09c-cdae2b1e9b9d")
    protected JMenuItem getMntmAnwenden() {
        if (mntmAnwenden == null) {
            mntmAnwenden = new JMenuItem("Anwenden");
        }
        return mntmAnwenden;
    }

    @objid ("b2baf796-d718-4bdd-91b1-93bf884589f2")
    protected JSeparator getSeparator() {
        if (separator == null) {
            separator = new JSeparator();
        }
        return separator;
    }

    @objid ("170e8222-e5b2-4435-9762-70c2e8a1d634")
    protected JMenuItem getMntmZufallsgenerator() {
        if (mntmZufallsgenerator == null) {
            mntmZufallsgenerator = new JMenuItem("Zufallsgenerator");
        }
        return mntmZufallsgenerator;
    }

    @objid ("36f889d9-28a9-4b30-a1ae-2f82a4b4dead")
    protected JSeparator getSeparator_2() {
        if (separator_2 == null) {
            separator_2 = new JSeparator();
        }
        return separator_2;
    }

    @objid ("56201199-f59e-473b-8c9b-6bc1f860bb81")
    protected JMenuItem getMntmFeldLeeren() {
        if (mntmFeldLeeren == null) {
            mntmFeldLeeren = new JMenuItem("Feld leeren");
        }
        return mntmFeldLeeren;
    }

    @objid ("1e693aa6-b8d7-4b4a-b469-19a41981b44d")
    protected JLabel getLbRegelsatzGameoflifetxt() {
        if (lbRegelsatzGameoflifetxt == null) {
            lbRegelsatzGameoflifetxt = new JLabel("Regelsatz: GameOfLife.txt");
            lbRegelsatzGameoflifetxt.setFont(new Font("Dialog", Font.BOLD, 13));
        }
        return lbRegelsatzGameoflifetxt;
    }

    @objid ("8ab3833e-01df-41e5-b77e-840a44646b16")
    protected JSeparator getSeparator_3() {
        if (separator_3 == null) {
            separator_3 = new JSeparator();
        }
        return separator_3;
    }

    @objid ("1f645a76-7b45-417c-851d-4d185c5aed27")
    protected JMenuItem getMntmRLaden() {
        if (mntmRLaden == null) {
            mntmRLaden = new JMenuItem("Laden");
        }
        return mntmRLaden;
    }

    @objid ("ce560352-e50c-4145-a02c-a9e05f5515ab")
    protected JMenuItem getMntmRSpeichern() {
        if (mntmRSpeichern == null) {
            mntmRSpeichern = new JMenuItem("Speichern");
        }
        return mntmRSpeichern;
    }

    @objid ("6d81b5bb-6b6e-4e3a-8024-c89d4b1f012d")
    protected JSeparator getSeparator_4() {
        if (separator_4 == null) {
            separator_4 = new JSeparator();
        }
        return separator_4;
    }

    @objid ("b1fac304-a50b-4f20-adc2-15ec0a489f2d")
    protected JLabel getLbTopologie() {
        if (lbTopologie == null) {
            lbTopologie = new JLabel("Topologie");
            lbTopologie.setFont(new Font("Dialog", Font.BOLD, 13));
        }
        return lbTopologie;
    }

    @objid ("5f43e919-bf9c-4d7b-835f-d9ad3d1995bb")
    protected JRadioButtonMenuItem getRdbtnmntmStandard() {
        if (rdbtnmntmStandard == null) {
            rdbtnmntmStandard = new JRadioButtonMenuItem("Standard");
            rdbtnmntmStandard.setSelected(true);
            bGTopo.add(rdbtnmntmStandard);
        }
        return rdbtnmntmStandard;
    }

    @objid ("172a004c-2a2d-4502-992c-af81eb0046cb")
    protected JRadioButtonMenuItem getRdbtnmntmTorus() {
        if (rdbtnmntmTorus == null) {
            rdbtnmntmTorus = new JRadioButtonMenuItem("Torus");
            bGTopo.add(rdbtnmntmTorus);
        }
        return rdbtnmntmTorus;
    }

    @objid ("ca7f09f3-1946-4a81-bc51-5e1873bfaa78")
    protected JSeparator getSeparator_5() {
        if (separator_5 == null) {
            separator_5 = new JSeparator();
        }
        return separator_5;
    }

    @objid ("395425ae-570e-4303-b980-258542f34ecf")
    protected JMenuItem getMntmRegelBearbeiten() {
        if (mntmRegelBearbeiten == null) {
            mntmRegelBearbeiten = new JMenuItem("Regel bearbeiten");
        }
        return mntmRegelBearbeiten;
    }

    @objid ("973dfc3f-5936-4883-9681-042f0e246b4f")
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

    @objid ("b1b5ee46-8ced-4e42-a3d0-35740edc4ebc")
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

    @objid ("02b73096-6464-404f-82bc-0fd246241c18")
    protected Button getButtonSchritt() {
        if (buttonSchritt == null) {
            buttonSchritt = new Button("Schritt");
            buttonSchritt.setSize(new Dimension(120, 50));
            buttonSchritt.setPreferredSize(new Dimension(120, 50));
        }
        return buttonSchritt;
    }

    @objid ("948a7ce2-5b9d-41f3-a3e8-01587465e232")
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

    @objid ("aef28298-763e-41a5-85fc-4a611b4246b4")
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

    @objid ("2e11ffb4-1af6-4c89-bdb7-c928f8cfb440")
    protected JLabel getLbVerzgerung() {
        if (lbVerzgerung == null) {
            lbVerzgerung = new JLabel("Verzögerung[S]");
        }
        return lbVerzgerung;
    }

    @objid ("ff3cd3f8-1499-46f8-975e-4b06ffde3058")
    protected JSpinner getSpZellLupe() {
        if (spZellLupe == null) {
            spZellLupe = new JSpinner();
            spZellLupe.setFont(new Font("Dialog", Font.BOLD, 30));
            spZellLupe.setPreferredSize(new Dimension(80, 50));
        }
        return spZellLupe;
    }

    @objid ("71f39875-98fe-4d6d-b56b-4195755f13c9")
    protected Canvas getCanvas() {
        if (canvas == null) {
            canvas = new MyCanvas();
            canvas.setBoundsG(0, 20, 1300, 790);
        }
        return canvas;
    }

}

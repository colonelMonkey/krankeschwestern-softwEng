package zufallsgenerator;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("73b85f4b-27f3-48f3-88d7-1538ae63f961")
public class TableDialog extends JDialog {
    @objid ("05a52eef-ba94-41ee-b33a-93d75e31d627")
    private LineDialog lDia;

    @objid ("83414c8b-a859-4aad-adde-e6fb3f6e40b9")
    public LineDialog lineDialog;

    @objid ("2e6ebe4b-0306-4126-b309-159519072ff2")
    private JTable tabX;

    @objid ("639e8498-79b1-434e-94e6-1e0cf850a23a")
    private JButton butX;

    @objid ("00ac47d5-3995-4c5a-97a5-ef6226bb33b8")
    private JButton butEntfernen;

    @objid ("c045a663-5d19-4f29-a829-572a52941775")
    private JButton butBearbeiten;

    @objid ("662d5b05-0e97-43b8-9d08-11a2e6b7f867")
    private JButton butbernehmen;

    @objid ("b59bfb19-c1f1-468d-af71-68d453a30d51")
    private JButton butAbbrechen;

    @objid ("629dcdd3-48c7-4c46-a297-bd6368cec6ff")
    public TableDialog() {
        // TODO Auto-generated constructor stub
        initialize();
    }

    @objid ("5ad60105-e4e6-4d08-b3d6-3d3ec8c30888")
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

    @objid ("b359d967-6d67-4dc6-b447-4ccdf0b1363d")
    protected JTable getTabX() {
        if (tabX == null) {
            tabX = new JTable();
            tabX.setBounds(12, 0, 402, 191);
        }
        return tabX;
    }

    @objid ("742720f1-137e-4dd5-a158-31621e0c785f")
    protected JButton getButX() {
        if (butX == null) {
            butX = new JButton("+");
            butX.setBounds(132, 203, 44, 25);
        }
        return butX;
    }

    @objid ("1525fccb-b78a-4ad5-82ef-2bdc1bc31622")
    protected JButton getButEntfernen() {
        if (butEntfernen == null) {
            butEntfernen = new JButton("Entfernen");
            butEntfernen.setBounds(188, 203, 117, 25);
        }
        return butEntfernen;
    }

    @objid ("2f10b57a-b892-4ba6-a22e-7aedb4b96140")
    protected JButton getButBearbeiten() {
        if (butBearbeiten == null) {
            butBearbeiten = new JButton("Bearbeiten");
            butBearbeiten.setBounds(321, 203, 117, 25);
        }
        return butBearbeiten;
    }

    @objid ("e2f816c6-ab79-4d0d-9fdd-08ac8adbd406")
    protected JButton getButbernehmen() {
        if (butbernehmen == null) {
            butbernehmen = new JButton("Übernehmen");
            butbernehmen.setBounds(313, 239, 125, 25);
        }
        return butbernehmen;
    }

    @objid ("e68ab0a7-a2e4-4335-b9f0-c78c87baa1a3")
    protected JButton getButAbbrechen() {
        if (butAbbrechen == null) {
            butAbbrechen = new JButton("Abbrechen");
            butAbbrechen.setBounds(188, 240, 117, 25);
        }
        return butAbbrechen;
    }

    @objid ("5db2732e-b4ab-4cc7-ad5b-17eaac007cd9")
    protected int[] zeigZeilenDialog() {
        int[] ausgabe = {0,0,0};
        return ausgabe;
    }

}

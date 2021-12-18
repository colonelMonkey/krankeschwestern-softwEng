package javax.swing.plaf.basic;

import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.JPopupMenu;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-211c-0000-000000000000")
public class BasicComboPopup extends JPopupMenu implements ComboPopup {
    @objid ("00d00398-0000-2120-0000-000000000000")
    public class InvocationKeyHandler extends KeyAdapter {
    }

    @objid ("00d00398-0000-2124-0000-000000000000")
    public class ListDataHandler implements ListDataListener {
    }

    @objid ("6c631a79-9a96-4a3a-bd2b-f5023d614f3b")
    protected class InvocationMouseHandler extends MouseAdapter {
    }

    @objid ("83365200-1d32-40fd-8a73-6b52168faad2")
    protected class InvocationMouseMotionHandler extends MouseMotionAdapter {
    }

    @objid ("632ffecd-5384-4b03-a7f6-e6e7bec60eb7")
    protected class ItemHandler implements ItemListener {
    }

    @objid ("534aabcd-8c93-47e8-bc17-94861627c36f")
    protected class ListMouseHandler extends MouseAdapter {
    }

    @objid ("f12da15e-9388-425c-850e-f9a79ecdbe4b")
    protected class ListMouseMotionHandler extends MouseMotionAdapter {
    }

    @objid ("b9e0361d-31e1-4cf9-8a65-d530df870f77")
    protected class ListSelectionHandler implements ListSelectionListener {
    }

    @objid ("2ba00224-e371-4390-b5e5-565a747a1568")
    protected class PropertyChangeHandler implements PropertyChangeListener {
    }

}

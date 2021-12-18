package javax.swing;

import java.awt.ItemSelectable;
import java.awt.event.ActionListener;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleSelection;
import javax.swing.event.ListDataListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2492-0000-000000000000")
public class JComboBox extends JComponent implements ItemSelectable, ListDataListener, ActionListener, Accessible {
    @objid ("00d00398-0000-2499-0000-000000000000")
    public interface KeySelectionManager {
        @objid ("6c74c94f-365f-4a02-927f-4cf183dede01")
        int selectionForKey(char p0, ComboBoxModel p1);

    }

    @objid ("c54445cc-9529-439b-8a64-e5719ae05ee2")
    protected class AccessibleJComboBox extends AccessibleJComponent implements AccessibleAction, AccessibleSelection {
    }

}

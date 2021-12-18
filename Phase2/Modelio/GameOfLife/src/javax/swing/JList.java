package javax.swing;

import java.beans.PropertyChangeListener;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleSelection;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2477-0000-000000000000")
public class JList extends JComponent implements Scrollable, Accessible {
    @objid ("01ec0d38-0000-189d-0000-000000000000")
    public static final class DropLocation extends DropLocation {
    }

    @objid ("96b38ea7-5391-4821-a7aa-fd297852dac8")
    protected class AccessibleJList extends AccessibleJComponent implements AccessibleSelection, PropertyChangeListener, ListSelectionListener, ListDataListener {
        @objid ("3dc98acd-26d8-46f2-93a1-0b22d472ca36")
        protected class AccessibleJListChild extends AccessibleContext implements Accessible, AccessibleComponent {
        }

    }

}

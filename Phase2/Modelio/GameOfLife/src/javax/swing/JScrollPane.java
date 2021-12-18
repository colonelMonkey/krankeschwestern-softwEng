package javax.swing;

import java.beans.PropertyChangeListener;
import javax.accessibility.Accessible;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.UIResource;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23fb-0000-000000000000")
public class JScrollPane extends JComponent implements ScrollPaneConstants, Accessible {
    @objid ("00d90e7c-5c27-4da2-b91f-5e59836e2f96")
    protected class AccessibleJScrollPane extends AccessibleJComponent implements ChangeListener, PropertyChangeListener {
    }

    @objid ("f234c50a-8f8f-47c4-8cf2-d44dbac89f9b")
    protected class ScrollBar extends JScrollBar implements UIResource {
    }

}

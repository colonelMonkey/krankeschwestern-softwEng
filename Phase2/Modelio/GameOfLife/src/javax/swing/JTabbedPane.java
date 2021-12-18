package javax.swing;

import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleSelection;
import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-245b-0000-000000000000")
public class JTabbedPane extends JComponent implements Serializable, Accessible, SwingConstants {
    @objid ("9e01fe08-b76a-41c3-b0d5-42c7df169cc1")
    protected class AccessibleJTabbedPane extends AccessibleJComponent implements AccessibleSelection, ChangeListener {
    }

    @objid ("79080a84-d468-419e-9e7b-cc80e72d5f76")
    protected class ModelListener implements ChangeListener, Serializable {
    }

}

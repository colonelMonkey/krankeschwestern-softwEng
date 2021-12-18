package javax.swing;

import java.awt.event.WindowAdapter;
import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleSelection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23da-0000-000000000000")
public class JMenu extends JMenuItem implements Accessible, MenuElement {
    @objid ("1587eb5f-1e3b-403e-a401-b40fa8801c00")
    protected class AccessibleJMenu extends AccessibleJMenuItem implements AccessibleSelection {
    }

    @objid ("59c61b2f-fd1b-40aa-85ca-cb5016dcd826")
    protected class WinListener extends WindowAdapter implements Serializable {
    }

}

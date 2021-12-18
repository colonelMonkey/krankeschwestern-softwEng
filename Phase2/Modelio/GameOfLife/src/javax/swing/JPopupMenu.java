package javax.swing;

import java.beans.PropertyChangeListener;
import javax.accessibility.Accessible;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-248d-0000-000000000000")
public class JPopupMenu extends JComponent implements Accessible, MenuElement {
    @objid ("00d00398-0000-2490-0000-000000000000")
    public static class Separator extends JSeparator {
    }

    @objid ("c8a4c63f-01d5-41b2-a104-9b9dc5939d54")
    protected class AccessibleJPopupMenu extends AccessibleJComponent implements PropertyChangeListener {
    }

}

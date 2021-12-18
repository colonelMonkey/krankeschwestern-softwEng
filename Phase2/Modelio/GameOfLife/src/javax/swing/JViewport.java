package javax.swing;

import java.awt.event.ComponentAdapter;
import java.io.Serializable;
import javax.accessibility.Accessible;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-247c-0000-000000000000")
public class JViewport extends JComponent implements Accessible {
    @objid ("7e1bdc6a-7014-4e1a-93ff-9544cf945f09")
    protected class AccessibleJViewport extends AccessibleJComponent {
    }

    @objid ("b19434af-6be9-49ab-b5c9-cda5e7c16d14")
    protected class ViewListener extends ComponentAdapter implements Serializable {
    }

}

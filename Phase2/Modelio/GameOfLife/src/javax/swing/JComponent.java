package javax.swing;

import java.awt.Container;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.io.Serializable;
import javax.accessibility.AccessibleExtendedComponent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-24c2-0000-000000000000")
public abstract class JComponent extends Container implements Serializable {
    @objid ("00d00398-0000-24c3-0000-000000000000")
    public abstract class AccessibleJComponent extends AccessibleAWTContainer implements AccessibleExtendedComponent {
        @objid ("7bc15f62-b1c3-4aa4-979f-aed4fcec8e43")
        protected class AccessibleContainerHandler implements ContainerListener {
        }

        @objid ("2a9b001d-8534-4bef-8359-dab257844293")
        protected class AccessibleFocusHandler implements FocusListener {
        }

    }

}

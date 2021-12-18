package java.beans;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a73-0000-000000000000")
public interface VetoableChangeListener extends EventListener {
    @objid ("85716a90-e52e-4cbd-88f4-6c416689cb0d")
    void vetoableChange(PropertyChangeEvent p0) throws PropertyVetoException;

}

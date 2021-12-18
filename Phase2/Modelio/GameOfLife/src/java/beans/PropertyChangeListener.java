package java.beans;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a9b-0000-000000000000")
public interface PropertyChangeListener extends EventListener {
    @objid ("9f8732e0-a248-4a7f-b558-cdeb5215d073")
    void propertyChange(PropertyChangeEvent p0);

}

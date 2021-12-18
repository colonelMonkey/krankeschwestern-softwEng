package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2874-0000-000000000000")
public interface ContainerListener extends EventListener {
    @objid ("15a3d43b-dd93-46f1-ac95-350e8c283dad")
    void componentAdded(ContainerEvent p0);

    @objid ("9964b315-87cd-403d-a39b-c3936e188374")
    void componentRemoved(ContainerEvent p0);

}

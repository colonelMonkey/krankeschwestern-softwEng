package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2854-0000-000000000000")
public interface HierarchyListener extends EventListener {
    @objid ("03537934-e754-41b8-b9ba-9d169250eafb")
    void hierarchyChanged(HierarchyEvent p0);

}

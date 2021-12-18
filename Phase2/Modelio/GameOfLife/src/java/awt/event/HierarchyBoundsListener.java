package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-285a-0000-000000000000")
public interface HierarchyBoundsListener extends EventListener {
    @objid ("4f4de1c4-ffb3-4d45-9099-b83fbb7c1618")
    void ancestorMoved(HierarchyEvent p0);

    @objid ("8b2e7eac-7938-4dd4-ade1-03255fe3a437")
    void ancestorResized(HierarchyEvent p0);

}

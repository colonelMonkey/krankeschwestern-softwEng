package java.beans.beancontext;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a66-0000-000000000000")
public interface BeanContextMembershipListener extends EventListener {
    @objid ("5142d8d3-7862-484c-be0c-3ad19a3ea1bb")
    void childrenAdded(BeanContextMembershipEvent p0);

    @objid ("1c7e4343-303c-43fa-9f56-76e3c3c3d3a8")
    void childrenRemoved(BeanContextMembershipEvent p0);

}

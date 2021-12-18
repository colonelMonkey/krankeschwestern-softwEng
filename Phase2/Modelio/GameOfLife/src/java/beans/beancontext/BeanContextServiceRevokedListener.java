package java.beans.beancontext;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a63-0000-000000000000")
public interface BeanContextServiceRevokedListener extends EventListener {
    @objid ("aca8de64-cbfc-471c-9b9c-e5ed3a66f13d")
    void serviceRevoked(BeanContextServiceRevokedEvent p0);

}

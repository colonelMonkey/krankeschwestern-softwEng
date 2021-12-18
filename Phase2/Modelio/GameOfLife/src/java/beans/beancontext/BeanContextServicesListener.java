package java.beans.beancontext;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a56-0000-000000000000")
public interface BeanContextServicesListener extends BeanContextServiceRevokedListener {
    @objid ("2af86e26-ca6b-411b-a7f0-9d1588cb0a66")
    void serviceAvailable(BeanContextServiceAvailableEvent p0);

}

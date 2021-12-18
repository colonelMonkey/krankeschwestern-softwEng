package java.beans.beancontext;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a67-0000-000000000000")
public class BeanContextServicesSupport extends BeanContextSupport implements BeanContextServices {
    @objid ("76e49619-d393-4b23-98df-5ad82aa53f9c")
    protected class BCSSChild extends BCSChild {
    }

    @objid ("8d7fdeb7-a2a8-4242-a76c-43ee5a5e33db")
    protected class BCSSProxyServiceProvider implements BeanContextServiceProvider, BeanContextServiceRevokedListener {
    }

    @objid ("5612f121-b4d7-4a11-9578-4523ab24b041")
    protected static class BCSSServiceProvider implements Serializable {
    }

}

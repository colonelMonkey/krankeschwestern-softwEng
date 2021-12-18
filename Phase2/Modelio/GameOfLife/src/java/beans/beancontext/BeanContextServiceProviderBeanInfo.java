package java.beans.beancontext;

import java.beans.BeanInfo;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a6d-0000-000000000000")
public interface BeanContextServiceProviderBeanInfo extends BeanInfo {
    @objid ("f8c1c7ec-9292-4741-bb10-7d3a22d44a84")
    List<BeanInfo> getServicesBeanInfo();

}

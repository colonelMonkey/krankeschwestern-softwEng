package java.beans;

import java.awt.Image;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a77-0000-000000000000")
public interface BeanInfo {
    @objid ("44e0049a-520a-4eb0-a10c-42f89a5dcbfb")
    List<BeanInfo> getAdditionalBeanInfo();

    @objid ("9bbc30a6-8af9-4a30-9d0f-da580931cd4e")
    BeanDescriptor getBeanDescriptor();

    @objid ("2c6110fb-bb0b-44ee-a942-d24c27e92ae1")
    int getDefaultEventIndex();

    @objid ("24e06e61-2777-426d-b6a8-bafd5c6376df")
    int getDefaultPropertyIndex();

    @objid ("467bfffa-1a96-431e-8e7f-237dd77f729d")
    List<EventSetDescriptor> getEventSetDescriptors();

    @objid ("71cc0f18-496a-4992-b976-37414cea0f6e")
    Image getIcon(int p0);

    @objid ("e4081c50-2994-4ac6-9ab2-890cd7984c8e")
    List<MethodDescriptor> getMethodDescriptors();

    @objid ("043fdf2e-e13e-4255-8998-6e0c229b4430")
    List<PropertyDescriptor> getPropertyDescriptors();

}

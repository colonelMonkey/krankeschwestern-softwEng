package java.beans.beancontext;

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a61-0000-000000000000")
public interface BeanContextChild {
    @objid ("4263c7ee-9238-4e9a-83e6-0322fb6cbfe9")
    void addPropertyChangeListener(String p0, PropertyChangeListener p1);

    @objid ("30f17611-27bc-4ea1-80e0-a2cdfd672f92")
    void addVetoableChangeListener(String p0, VetoableChangeListener p1);

    @objid ("313d2f46-6384-4b0f-bca7-b94d997e59bc")
    BeanContext getBeanContext();

    @objid ("c637a870-1186-4ea2-bf9f-46b749473c4d")
    void removePropertyChangeListener(String p0, PropertyChangeListener p1);

    @objid ("fadfec12-f93f-481f-8c16-bf5224d2c68d")
    void removeVetoableChangeListener(String p0, VetoableChangeListener p1);

    @objid ("ccb42208-c409-43bb-8510-68f8e32eebfe")
    void setBeanContext(BeanContext p0) throws PropertyVetoException;

}

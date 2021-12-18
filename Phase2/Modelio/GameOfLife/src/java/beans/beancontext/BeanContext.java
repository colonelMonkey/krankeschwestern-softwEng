package java.beans.beancontext;

import java.beans.DesignMode;
import java.beans.Visibility;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a5b-0000-000000000000")
public interface BeanContext extends BeanContextChild, Collection, DesignMode, Visibility {
    @objid ("9ddca5b1-8eff-44e4-b88a-06024ebcb61d")
    void addBeanContextMembershipListener(BeanContextMembershipListener p0);

    @objid ("a99a06ed-0786-4def-92c8-46c1b4c980b1")
    URL getResource(String p0, BeanContextChild p1) throws IllegalArgumentException;

    @objid ("64cae70c-3108-41b7-92bd-96876b42f274")
    InputStream getResourceAsStream(String p0, BeanContextChild p1) throws IllegalArgumentException;

    @objid ("e52c394d-475f-4005-b05b-da33e92f35af")
    Object instantiateChild(String p0) throws ClassNotFoundException, IOException;

    @objid ("aee7831f-ac35-4314-a493-fb377292eb64")
    void removeBeanContextMembershipListener(BeanContextMembershipListener p0);

}

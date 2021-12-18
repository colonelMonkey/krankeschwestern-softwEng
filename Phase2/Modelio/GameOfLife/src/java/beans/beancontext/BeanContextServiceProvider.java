package java.beans.beancontext;

import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a58-0000-000000000000")
public interface BeanContextServiceProvider {
    @objid ("2dc9a916-aeae-4db4-a0e8-0ede4bb5b3e7")
    Iterator getCurrentServiceSelectors(BeanContextServices p0, Class p1);

    @objid ("98c16c27-6eb1-413e-83ad-12c3ae2072e5")
    Object getService(BeanContextServices p0, Object p1, Class p2, Object p3);

    @objid ("928adfde-36d1-4b40-b97f-81cad87f4166")
    void releaseService(BeanContextServices p0, Object p1, Object p2);

}

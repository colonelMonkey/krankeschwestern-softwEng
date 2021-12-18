package java.beans.beancontext;

import java.util.Iterator;
import java.util.TooManyListenersException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a6e-0000-000000000000")
public interface BeanContextServices extends BeanContext, BeanContextServicesListener {
    @objid ("755876c1-204b-45ba-a344-4839215f5c96")
    void addBeanContextServicesListener(BeanContextServicesListener p0);

    @objid ("a37ca1b7-facb-4352-86f2-f446f32f0cfd")
    boolean addService(Class p0, BeanContextServiceProvider p1);

    @objid ("4f538e69-22be-4bdb-ab06-8c47a82eda12")
    Iterator getCurrentServiceClasses();

    @objid ("602a4351-173e-416a-8135-c5553c226e39")
    Iterator getCurrentServiceSelectors(Class p0);

    @objid ("1ce218c6-254c-46ef-8ca9-0275bb2e7fdf")
    Object getService(BeanContextChild p0, Object p1, Class p2, Object p3, BeanContextServiceRevokedListener p4) throws TooManyListenersException;

    @objid ("c08d9f4f-fb23-4ca4-8317-4c3588bf3493")
    boolean hasService(Class p0);

    @objid ("8eda18dc-e35e-4fdd-9582-789feeaa5ee4")
    void releaseService(BeanContextChild p0, Object p1, Object p2);

    @objid ("8bf520ca-294c-482a-88af-dd4be932c06f")
    void removeBeanContextServicesListener(BeanContextServicesListener p0);

    @objid ("3f8418cf-3985-4053-9e51-841a7b0047c7")
    void revokeService(Class p0, BeanContextServiceProvider p1, boolean p2);

}

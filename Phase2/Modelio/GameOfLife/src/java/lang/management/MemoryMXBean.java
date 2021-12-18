package java.lang.management;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae8-0000-000000000000")
public interface MemoryMXBean extends PlatformManagedObject {
    @objid ("d49fb395-1513-4225-820a-22bcfdc3627f")
    void gc();

    @objid ("be16bb27-7c41-4dee-af22-138b221040b4")
    MemoryUsage getHeapMemoryUsage();

    @objid ("a018165d-860a-4d38-8682-91bbad7f0fa6")
    MemoryUsage getNonHeapMemoryUsage();

    @objid ("0b0858bc-d5e3-4b2e-85f0-0da27c6f8dd7")
    int getObjectPendingFinalizationCount();

    @objid ("84ef7f9f-3446-4133-ac1e-a86a95055c72")
    boolean isVerbose();

    @objid ("a4b31bfc-1a6e-426e-988b-9868081e4ab1")
    void setVerbose(boolean p0);

}

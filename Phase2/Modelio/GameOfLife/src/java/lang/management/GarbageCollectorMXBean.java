package java.lang.management;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2adf-0000-000000000000")
public interface GarbageCollectorMXBean extends MemoryManagerMXBean {
    @objid ("89866292-006c-4161-b289-3bb52582b351")
    long getCollectionCount();

    @objid ("c869b740-d2af-41b4-bbde-6ec4b7133128")
    long getCollectionTime();

}

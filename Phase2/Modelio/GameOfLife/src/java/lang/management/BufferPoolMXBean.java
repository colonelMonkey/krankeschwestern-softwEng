package java.lang.management;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-a1a6-0000-000000000000")
public interface BufferPoolMXBean extends PlatformManagedObject {
    @objid ("9ba4a4de-bf34-4b6c-97bd-0f00348e9930")
    long getCount();

    @objid ("76ea7996-8241-4133-85c8-0ea543fee939")
    long getMemoryUsed();

    @objid ("c048d58a-ed27-4649-8ca4-82c9bf74748e")
    String getName();

    @objid ("4b39e216-d687-448b-87ae-30dd40628b46")
    long getTotalCapacity();

}

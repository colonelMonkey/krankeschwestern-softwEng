package java.lang.management;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae0-0000-000000000000")
public interface MemoryManagerMXBean extends PlatformManagedObject {
    @objid ("6615a818-b097-4261-8f9e-618d676b7902")
    List<String> getMemoryPoolNames();

    @objid ("1769f410-a002-4d7c-9810-de464857d33f")
    String getName();

    @objid ("3b8fc41e-81e3-4567-8161-5bd01063fe35")
    boolean isValid();

}

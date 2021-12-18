package java.lang.management;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae1-0000-000000000000")
public interface OperatingSystemMXBean extends PlatformManagedObject {
    @objid ("ab0e1fa5-a073-49f1-9568-1e0d2134c2d2")
    String getArch();

    @objid ("b522f3ec-46c7-4cf8-ad88-7d54bace7ff7")
    int getAvailableProcessors();

    @objid ("c08e38f7-5fa9-426d-9bab-bbb09b44c4f7")
    String getName();

    @objid ("ecc2cd5e-280d-4691-8664-8f1c28c12ad6")
    double getSystemLoadAverage();

    @objid ("785c9d56-e6e5-4e82-867c-791691a3cd02")
    String getVersion();

}

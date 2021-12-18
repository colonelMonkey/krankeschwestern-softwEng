package java.lang.management;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2add-0000-000000000000")
public interface CompilationMXBean extends PlatformManagedObject {
    @objid ("9ca5d183-6b62-4b59-82f1-3b7f319dc227")
    String getName();

    @objid ("70ba53aa-f567-4545-8989-50b1db9f16ef")
    long getTotalCompilationTime();

    @objid ("cb778f67-01b5-4ccd-b0a0-2ef26ab31c77")
    boolean isCompilationTimeMonitoringSupported();

}

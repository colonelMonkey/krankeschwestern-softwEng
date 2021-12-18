package java.lang.management;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae4-0000-000000000000")
public interface RuntimeMXBean extends PlatformManagedObject {
    @objid ("61917b6c-eed2-49b2-bfb3-cafd01399f74")
    String getBootClassPath();

    @objid ("06d5ff61-bc22-4e52-a2ce-e4eba35c7d13")
    String getClassPath();

    @objid ("5795279a-6335-4510-a881-c8d9d4dc3263")
    List getInputArguments();

    @objid ("ba3d2f68-152f-4d54-8eb8-5f45a325d997")
    String getLibraryPath();

    @objid ("279ae95d-9d77-40f1-a026-a4bab1f16e1a")
    String getManagementSpecVersion();

    @objid ("9fc68df0-1a54-47a9-b41b-ed4b1b904dab")
    String getName();

    @objid ("6d65b92e-01a2-48fa-a3b6-2d2668fe00d8")
    String getSpecName();

    @objid ("aa4d8150-79c2-4a12-90ac-228bc82c060a")
    String getSpecVendor();

    @objid ("5a381426-b997-442d-86a8-c64909217b54")
    String getSpecVersion();

    @objid ("9bac5bd2-90a0-4d1a-938f-d4e5d5a5cfff")
    long getStartTime();

    @objid ("02a31cea-f051-4a19-b07f-4034a08432c3")
    Map getSystemProperties();

    @objid ("1a51f28e-33bd-424e-8915-dd3b9c2e6788")
    long getUptime();

    @objid ("5a854d53-8ceb-47a9-86da-da807ae4c747")
    String getVmName();

    @objid ("1277bc2d-2ec3-4e6e-bbf5-576edbb5f021")
    String getVmVendor();

    @objid ("46c058b1-1bca-4c19-b887-4ba2a3755b50")
    String getVmVersion();

    @objid ("dedba5ef-2818-4c6b-9fd9-2e0689bc7eb9")
    boolean isBootClassPathSupported();

}

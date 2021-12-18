package java.security.cert;

import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2730-0000-000000000000")
public interface X509Extension {
    @objid ("bb27783e-d886-4c3c-bfee-054c7c05acf0")
    Set getCriticalExtensionOIDs();

    @objid ("9d2b8007-c804-45e0-aff5-a0fdf8e73b3d")
    List<Byte> getExtensionValue(String p0);

    @objid ("0082861f-6ef4-4cff-b4ab-cd0eb0464cb9")
    Set getNonCriticalExtensionOIDs();

    @objid ("20d159f6-3ad3-4aaa-910d-5db475878041")
    boolean hasUnsupportedCriticalExtension();

}

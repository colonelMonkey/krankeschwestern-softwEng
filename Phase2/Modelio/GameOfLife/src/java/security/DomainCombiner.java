package java.security;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27da-0000-000000000000")
public interface DomainCombiner {
    @objid ("cacd39ab-d841-4155-a712-5c99ee818f6a")
    List<ProtectionDomain> combine(List<ProtectionDomain> p0, List<ProtectionDomain> p1);

}

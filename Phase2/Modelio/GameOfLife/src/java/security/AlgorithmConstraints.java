package java.security;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0000-23fa-0000-000000000000")
public interface AlgorithmConstraints {
    @objid ("ce076ffb-d7f0-4a82-9620-65236ec772cd")
    boolean permits(Set p0, String p1, AlgorithmParameters p2);

    @objid ("0e45ba0b-2e45-4900-87c7-26addcc19dd7")
    boolean permits(Set p0, Key p1);

    @objid ("501ebdfd-6985-40b0-aafc-703722328cbd")
    boolean permits(Set p0, String p1, Key p2, AlgorithmParameters p3);

}

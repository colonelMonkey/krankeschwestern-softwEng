package java.security.cert;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2748-0000-000000000000")
public interface CertSelector extends Cloneable {
    @objid ("0261bc9a-96e5-4486-a4b7-49013b6ff2b5")
    Object clone();

    @objid ("970e22a6-109e-4273-b116-5ae532a104fc")
    boolean match(Certificate p0);

}

package java.security.interfaces;

import java.security.PublicKey;
import java.security.spec.ECPoint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2784-0000-000000000000")
public interface ECPublicKey extends PublicKey, ECKey {
    @objid ("ce3c31c6-3a69-4881-94dc-b5efeea44e03")
    ECPoint getW();

}

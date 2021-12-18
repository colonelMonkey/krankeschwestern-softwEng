package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2780-0000-000000000000")
public interface ECPrivateKey extends PrivateKey, ECKey {
    @objid ("12230076-d388-47b4-9b0e-93ac3c736687")
    BigInteger getS();

}

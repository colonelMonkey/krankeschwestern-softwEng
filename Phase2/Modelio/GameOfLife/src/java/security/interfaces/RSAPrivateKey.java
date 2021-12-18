package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2781-0000-000000000000")
public interface RSAPrivateKey extends PrivateKey, RSAKey {
    @objid ("ac91c61c-2ac3-4bae-a54b-73d5429670ca")
    BigInteger getPrivateExponent();

}

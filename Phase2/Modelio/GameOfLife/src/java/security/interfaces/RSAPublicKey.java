package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2782-0000-000000000000")
public interface RSAPublicKey extends PublicKey, RSAKey {
    @objid ("44810d03-7f9b-456d-a998-01f13f77ca03")
    BigInteger getPublicExponent();

}

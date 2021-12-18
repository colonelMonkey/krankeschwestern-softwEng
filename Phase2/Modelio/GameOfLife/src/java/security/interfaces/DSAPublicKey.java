package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-278a-0000-000000000000")
public interface DSAPublicKey extends DSAKey, PublicKey {
    @objid ("46610770-1697-44c5-8da7-458e9bec59e7")
    BigInteger getY();

}

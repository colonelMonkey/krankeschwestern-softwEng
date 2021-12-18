package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-277f-0000-000000000000")
public interface DSAPrivateKey extends DSAKey, PrivateKey {
    @objid ("86488610-d8db-41eb-a864-2431bfced2d3")
    BigInteger getX();

}

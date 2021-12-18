package java.security.interfaces;

import java.security.InvalidParameterException;
import java.security.SecureRandom;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2785-0000-000000000000")
public interface DSAKeyPairGenerator {
    @objid ("40df43b1-8e6e-44cc-958a-103d5e69a495")
    void initialize(DSAParams p0, SecureRandom p1) throws InvalidParameterException;

    @objid ("6cd05106-e58c-4f54-b9d6-c1ab5570dd28")
    void initialize(int p0, boolean p1, SecureRandom p2) throws InvalidParameterException;

}

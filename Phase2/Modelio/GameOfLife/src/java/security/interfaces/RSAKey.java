package java.security.interfaces;

import java.math.BigInteger;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-278b-0000-000000000000")
public interface RSAKey {
    @objid ("dd04586c-cbcb-4726-acec-4271cec5804b")
    BigInteger getModulus();

}

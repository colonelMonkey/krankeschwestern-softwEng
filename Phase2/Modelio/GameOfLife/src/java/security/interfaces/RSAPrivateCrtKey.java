package java.security.interfaces;

import java.math.BigInteger;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2787-0000-000000000000")
public interface RSAPrivateCrtKey extends RSAPrivateKey {
    @objid ("b67234b8-701a-4766-ab08-60ef6e3611b4")
    BigInteger getCrtCoefficient();

    @objid ("0b993284-ec0d-46df-8ff4-c8bb65873969")
    BigInteger getPrimeExponentP();

    @objid ("9a7935fb-5766-4321-9d7f-d1f053e7ce41")
    BigInteger getPrimeExponentQ();

    @objid ("0081155a-5836-411e-8bf0-872b5b72442f")
    BigInteger getPrimeP();

    @objid ("b5b2fb84-3f60-450b-8ddc-b57d95a0ad40")
    BigInteger getPrimeQ();

    @objid ("07d676f9-95f1-4bc4-aa24-ffa271310eac")
    BigInteger getPublicExponent();

}

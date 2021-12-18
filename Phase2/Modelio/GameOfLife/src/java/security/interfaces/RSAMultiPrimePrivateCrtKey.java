package java.security.interfaces;

import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2786-0000-000000000000")
public interface RSAMultiPrimePrivateCrtKey extends RSAPrivateKey {
    @objid ("27e8e449-d947-49be-b258-3a3e5d1bf23b")
    BigInteger getCrtCoefficient();

    @objid ("d4372c69-823f-4393-83e0-3f9482df89fd")
    List<RSAOtherPrimeInfo> getOtherPrimeInfo();

    @objid ("4c9f3f4d-18b8-4925-a91e-395bc13e36ba")
    BigInteger getPrimeExponentP();

    @objid ("f7b63bf2-6a9f-4838-b366-da9a0badb9dc")
    BigInteger getPrimeExponentQ();

    @objid ("f39f73dd-1d9a-427e-8579-4a81e70a457a")
    BigInteger getPrimeP();

    @objid ("a60bd454-7649-417d-aa56-ff04253d5f58")
    BigInteger getPrimeQ();

    @objid ("8e865242-5ddc-4694-8ea3-5092736b28a5")
    BigInteger getPublicExponent();

}

package java.security.interfaces;

import java.math.BigInteger;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2789-0000-000000000000")
public interface DSAParams {
    @objid ("bfae8a9c-1f69-455b-955d-56626f742b27")
    BigInteger getG();

    @objid ("05c38017-913e-4907-98af-4a7e2db62f04")
    BigInteger getP();

    @objid ("083cd094-28b1-4154-afc5-bcd38e974620")
    BigInteger getQ();

}

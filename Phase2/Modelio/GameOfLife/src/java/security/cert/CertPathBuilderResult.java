package java.security.cert;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-272a-0000-000000000000")
public interface CertPathBuilderResult extends Cloneable {
    @objid ("4604b73c-8d8e-4542-97b7-471513476a49")
    Object clone();

    @objid ("02908832-70f0-4f65-8602-3f0e355021bc")
    CertPath getCertPath();

}

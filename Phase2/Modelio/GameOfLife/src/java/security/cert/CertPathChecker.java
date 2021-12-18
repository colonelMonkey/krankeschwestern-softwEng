package java.security.cert;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("12de325d-c6ed-4202-b750-8692f56643df")
public interface CertPathChecker {
    @objid ("7f376168-5095-45e4-8e17-e4265a161722")
    void check(Certificate p0) throws CertPathValidatorException;

    @objid ("89bb42db-f415-4757-9838-8e200be62288")
    void init(boolean p0) throws CertPathValidatorException;

    @objid ("7197b923-45ce-46d7-bb13-a74bd7be0f7a")
    boolean isForwardCheckingSupported();

}

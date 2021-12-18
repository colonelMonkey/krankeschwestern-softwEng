package java.security.cert;

import java.io.Serializable;
import java.security.GeneralSecurityException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-274a-0000-000000000000")
public class CertPathValidatorException extends GeneralSecurityException {
    @objid ("2580001c-0005-f6cc-0000-000000000000")
    public interface Reason extends Serializable {
    }

    @objid ("59323cf3-baa5-4c84-a680-88fa7d4b348d")
    public enum BasicReason {
        ;
    }

}

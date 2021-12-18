package java.security;

import java.util.Set;
import javax.security.auth.Destroyable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-279a-0000-000000000000")
public class KeyStore {
    @objid ("00d00398-0000-279b-0000-000000000000")
    public static abstract class Builder {
    }

    @objid ("00d00398-0000-279d-0000-000000000000")
    public static class CallbackHandlerProtection implements ProtectionParameter {
    }

    @objid ("00d00398-0000-279e-0000-000000000000")
    public interface Entry {
        @objid ("46f25f52-e9eb-407c-88b8-7eb2af542daa")
        Set getAttributes();

        @objid ("6d9ff2bc-f025-4dbf-bd48-335f1d1a8647")
        interface Attribute {
            @objid ("56b51e4e-0c91-4994-81eb-09d22e252731")
            String getName();

            @objid ("65415beb-08cb-49f8-9a37-31596d0a9506")
            String getValue();

        }

    }

    @objid ("00d00398-0000-279f-0000-000000000000")
    public interface LoadStoreParameter {
        @objid ("f2b51848-2b05-480c-ac3b-b5752bc643d2")
        ProtectionParameter getProtectionParameter();

    }

    @objid ("00d00398-0000-27a0-0000-000000000000")
    public static class PasswordProtection implements ProtectionParameter, Destroyable {
    }

    @objid ("00d00398-0000-27a1-0000-000000000000")
    public static final class PrivateKeyEntry implements Entry {
    }

    @objid ("00d00398-0000-27a2-0000-000000000000")
    public interface ProtectionParameter {
    }

    @objid ("00d00398-0000-27a3-0000-000000000000")
    public static final class SecretKeyEntry implements Entry {
    }

    @objid ("00d00398-0000-27a5-0000-000000000000")
    public static final class TrustedCertificateEntry implements Entry {
    }

}

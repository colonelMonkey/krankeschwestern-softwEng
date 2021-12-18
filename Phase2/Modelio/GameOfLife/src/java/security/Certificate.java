package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27c3-0000-000000000000")
public interface Certificate {
    @objid ("10dc9016-8bb7-4142-a10c-f32a2a69c5ae")
    void decode(InputStream p0) throws IOException, KeyException;

    @objid ("c134da78-0fce-4344-9921-b7c08d756d2a")
    void encode(OutputStream p0) throws IOException, KeyException;

    @objid ("864378b8-74ca-4fef-86ad-660928cfe18b")
    String getFormat();

    @objid ("d8f2e8cb-3ccd-40a8-9be7-5dd65996e91c")
    Principal getGuarantor();

    @objid ("23ac6bb9-a8d9-4727-9167-9d81d333db67")
    Principal getPrincipal();

    @objid ("143a0135-7cee-48ac-b2a4-cca9c3c039b0")
    PublicKey getPublicKey();

    @objid ("5b30e4c4-e1ac-4208-9bb2-e66602fc0525")
    String toString(boolean p0);

}

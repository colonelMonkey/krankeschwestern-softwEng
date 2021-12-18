package java.nio.file.attribute;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-3c4c-0000-000000000000")
public interface FileOwnerAttributeView extends FileAttributeView {
    @objid ("792e029d-11a9-4bd1-b360-2503a0cb6901")
    UserPrincipal getOwner() throws IOException;

    @objid ("7745ad4d-79d1-44cd-a00e-03d5a44fe084")
    String name();

    @objid ("037b8c22-84f9-48a6-895d-31a721b7ad34")
    void setOwner(UserPrincipal p0) throws IOException;

}

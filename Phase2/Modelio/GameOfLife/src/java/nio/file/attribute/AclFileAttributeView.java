package java.nio.file.attribute;

import java.io.IOException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-4049-0000-000000000000")
public interface AclFileAttributeView extends FileOwnerAttributeView {
    @objid ("de114b64-bac9-4b17-be31-047c507ad66c")
    List getAcl() throws IOException;

    @objid ("1971c694-f7ef-4034-af07-06e31ed09f68")
    String name();

    @objid ("d25547b0-2e8e-4ee7-9496-47920daebc17")
    void setAcl(List p0) throws IOException;

}

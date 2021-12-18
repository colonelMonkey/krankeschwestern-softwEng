package java.nio.file.attribute;

import java.io.IOException;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-0e3a-0000-000000000000")
public interface PosixFileAttributeView extends BasicFileAttributeView, FileOwnerAttributeView {
    @objid ("bba78104-678c-45d9-b4fc-16a0ae20d4ae")
    String name();

    @objid ("53c31318-7f79-46d3-baf3-0f0c570ebd99")
    PosixFileAttributes readAttributes() throws IOException;

    @objid ("909bc966-f00b-415d-a243-2f0a821ac72e")
    BasicFileAttributes readAttributes() throws IOException;

    @objid ("1a2e0902-6021-4890-b562-51c77d5d33b7")
    void setGroup(GroupPrincipal p0) throws IOException;

    @objid ("fd6f8300-67c3-4374-aab2-c50b0a82392c")
    void setPermissions(Set p0) throws IOException;

}

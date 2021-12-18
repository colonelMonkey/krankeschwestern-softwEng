package java.nio.file.attribute;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-38cb-0000-000000000000")
public interface BasicFileAttributeView extends FileAttributeView {
    @objid ("ae8e8532-46b3-4e47-a57b-e071bceec510")
    String name();

    @objid ("49dcd5a1-b1b3-435a-9f2d-81b4b6bea6e1")
    BasicFileAttributes readAttributes() throws IOException;

    @objid ("976d98b1-9833-4de3-8450-c0b4a8b14a98")
    void setTimes(FileTime p0, FileTime p1, FileTime p2) throws IOException;

}

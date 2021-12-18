package java.nio.file.attribute;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-44c8-0000-000000000000")
public interface DosFileAttributeView extends BasicFileAttributeView {
    @objid ("d074679a-a589-417f-b902-267b2393b52c")
    String name();

    @objid ("d60e95b9-9c52-471f-b35a-bc2ce445c007")
    BasicFileAttributes readAttributes() throws IOException;

    @objid ("05fc9fc7-b6d7-4eac-9bd5-c95020ab5ed8")
    DosFileAttributes readAttributes() throws IOException;

    @objid ("16c7e60a-2588-4751-99c4-5ea6e4056f2d")
    void setArchive(boolean p0) throws IOException;

    @objid ("c12b9355-ad7c-4d26-9b76-0dcbc76508a8")
    void setHidden(boolean p0) throws IOException;

    @objid ("f30bd8ad-ba2f-4c13-891c-1aea57f3e0be")
    void setReadOnly(boolean p0) throws IOException;

    @objid ("fb43a3ab-ed82-4e4f-963a-c2e114b8e734")
    void setSystem(boolean p0) throws IOException;

}

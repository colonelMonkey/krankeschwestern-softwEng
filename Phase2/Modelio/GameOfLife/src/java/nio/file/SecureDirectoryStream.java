package java.nio.file;

import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-1623-0000-000000000000")
public interface SecureDirectoryStream extends DirectoryStream {
    @objid ("bcc61ff0-810c-4225-81a1-3b1685dafb31")
    void deleteDirectory(Object p0) throws IOException;

    @objid ("adeecf8d-33e7-42b5-861a-4e59a3d556db")
    void deleteFile(Object p0) throws IOException;

    @objid ("6359e8a3-a227-4b86-b38c-63f3093de06f")
    FileAttributeView getFileAttributeView(Class p0);

    @objid ("e247349e-d468-441a-a680-c5e6b7b938ce")
    FileAttributeView getFileAttributeView(Object p0, Class p1, List<LinkOption> p2);

    @objid ("51b0aee3-8300-4b28-984c-f71e0525fab2")
    void move(Object p0, SecureDirectoryStream p1, Object p2) throws IOException;

    @objid ("bec5467d-2829-454b-89ac-b3c3144b7860")
    SeekableByteChannel newByteChannel(Object p0, Set p1, List<FileAttribute> p2) throws IOException;

    @objid ("11dab0b5-ab5a-4154-9c23-03af53bb1465")
    SecureDirectoryStream newDirectoryStream(Object p0, List<LinkOption> p1) throws IOException;

}

package java.io;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e18-0000-000000000000")
public interface ObjectOutput extends DataOutput, AutoCloseable {
    @objid ("350698ff-8c58-4fd2-bdf5-02a6ff5f3d07")
    void close() throws IOException;

    @objid ("cc0b9778-101b-4b9a-a0cd-8822f7db2a44")
    void flush() throws IOException;

    @objid ("87e621d6-6d24-437e-9f8a-3ff9608c4f0c")
    void write(List<Byte> p0) throws IOException;

    @objid ("bbd04f4d-2d71-4464-a6e2-2bce81f60e32")
    void write(int p0) throws IOException;

    @objid ("7e2f1283-bd0d-4ea4-96e0-95c0d38973ce")
    void write(List<Byte> p0, int p1, int p2) throws IOException;

    @objid ("2b56e5ab-5d05-4714-a449-6a36bcc0604d")
    void writeObject(Object p0) throws IOException;

}

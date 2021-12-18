package java.io;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e3b-0000-000000000000")
public interface ObjectInput extends DataInput, AutoCloseable {
    @objid ("3e840bb2-e18e-4f55-a653-3f2184d539f7")
    int available() throws IOException;

    @objid ("6d5467c6-afa3-4fb3-9861-bb3e5c909ef2")
    void close() throws IOException;

    @objid ("f753eedb-6ad1-48ea-af1d-3f676157e6c7")
    int read(List<Byte> p0, int p1, int p2) throws IOException;

    @objid ("d95627b9-6477-4620-8ae3-9dba2ec783cb")
    int read(List<Byte> p0) throws IOException;

    @objid ("b7450d9b-cbfe-4b6b-996a-527101fd903e")
    int read() throws IOException;

    @objid ("0a6424c4-ca99-40b4-b982-b1081520f0c9")
    Object readObject() throws ClassNotFoundException, IOException;

    @objid ("93f02c9b-c4e4-49c1-8a37-aef4869d1726")
    long skip(long p0) throws IOException;

}

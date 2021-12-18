package java.io;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e5c-0000-000000000000")
public interface Closeable extends AutoCloseable {
    @objid ("bbb0353f-006e-4a97-b5c9-fcf21ac3c2cf")
    void close() throws IOException;

}

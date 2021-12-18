package java.nio.channels;

import java.io.Closeable;
import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29eb-0000-000000000000")
public interface Channel extends Closeable {
    @objid ("73a9186f-30cf-4d8f-8de5-9016ad87ac31")
    void close() throws IOException;

    @objid ("102a6f25-6679-424d-a257-dd5bc7bd6834")
    boolean isOpen();

}

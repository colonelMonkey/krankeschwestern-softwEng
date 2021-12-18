package java.nio.channels;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-1684-0000-000000000000")
public interface NetworkChannel extends Channel {
    @objid ("da55a516-9f9d-4a84-a234-b75e1fb5bb2a")
    NetworkChannel bind(SocketAddress p0) throws IOException;

    @objid ("f8256f50-b9ac-417e-8859-8e7e7ca4fc20")
    SocketAddress getLocalAddress() throws IOException;

    @objid ("0580be34-0c73-41c9-a2e1-0c611129da61")
    Object getOption(SocketOption p0) throws IOException;

    @objid ("0632d4b6-8737-4524-a577-f6baaa512c52")
    NetworkChannel setOption(SocketOption p0, Object p1) throws IOException;

    @objid ("b3f536de-718d-4bf9-a96d-8577800652c9")
    Set supportedOptions();

}

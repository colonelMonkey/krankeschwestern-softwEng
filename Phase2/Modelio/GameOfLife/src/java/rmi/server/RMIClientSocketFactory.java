package java.rmi.server;

import java.io.IOException;
import java.net.Socket;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2daa-0000-000000000000")
public interface RMIClientSocketFactory {
    @objid ("5b8b67af-b8a3-4a22-9fb6-420cfb400d82")
    Socket createSocket(String p0, int p1) throws IOException;

}

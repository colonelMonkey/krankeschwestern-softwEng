package java.rmi.server;

import java.io.IOException;
import java.net.ServerSocket;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2da5-0000-000000000000")
public interface RMIServerSocketFactory {
    @objid ("7d8cc161-93f6-4127-a58d-e562c5c1a442")
    ServerSocket createServerSocket(int p0) throws IOException;

}

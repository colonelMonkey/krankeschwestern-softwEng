package java.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d99-0000-000000000000")
public interface ServerRef extends RemoteRef {
    @objid ("6e1e5735-5c5e-454e-8587-12c087877a76")
    RemoteStub exportObject(Remote p0, Object p1) throws RemoteException;

    @objid ("9070a938-347e-494e-bb30-43a066307c70")
    String getClientHost() throws ServerNotActiveException;

}

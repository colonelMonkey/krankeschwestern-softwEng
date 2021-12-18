package java.rmi.registry;

import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2db4-0000-000000000000")
public interface RegistryHandler {
    @objid ("c782a91e-b872-44c3-ad8b-7cc5dce54059")
    Registry registryImpl(int p0) throws RemoteException;

    @objid ("ad554b8c-e9d1-474c-947e-ed4969c91452")
    Registry registryStub(String p0, int p1) throws RemoteException, UnknownHostException;

}

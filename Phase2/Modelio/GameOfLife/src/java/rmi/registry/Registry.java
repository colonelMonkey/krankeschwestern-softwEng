package java.rmi.registry;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2db3-0000-000000000000")
public interface Registry extends Remote {
    @objid ("04c4149c-59d2-4efd-b473-599b0ba307de")
    void bind(String p0, Remote p1) throws AccessException, AlreadyBoundException, RemoteException;

    @objid ("0c1ae565-5ca3-4c45-be50-692439481461")
    List<String> list() throws AccessException, RemoteException;

    @objid ("cab510aa-5a57-4798-b7da-3915a1886871")
    Remote lookup(String p0) throws AccessException, NotBoundException, RemoteException;

    @objid ("483ef476-01a1-49e2-a931-69009e7640b4")
    void rebind(String p0, Remote p1) throws AccessException, RemoteException;

    @objid ("3f9d3fcf-8d43-4a98-91e2-c20a2b49302d")
    void unbind(String p0) throws AccessException, NotBoundException, RemoteException;

}

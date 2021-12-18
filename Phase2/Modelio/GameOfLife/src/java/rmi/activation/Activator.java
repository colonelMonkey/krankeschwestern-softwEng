package java.rmi.activation;

import java.rmi.MarshalledObject;
import java.rmi.Remote;
import java.rmi.RemoteException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d89-0000-000000000000")
public interface Activator extends Remote {
    @objid ("3eac377f-7687-429a-a942-26bcdf7f5ef8")
    MarshalledObject activate(ActivationID p0, boolean p1) throws ActivationException, RemoteException, UnknownObjectException;

}

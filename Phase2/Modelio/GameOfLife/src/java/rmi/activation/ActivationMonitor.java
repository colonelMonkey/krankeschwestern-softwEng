package java.rmi.activation;

import java.rmi.MarshalledObject;
import java.rmi.Remote;
import java.rmi.RemoteException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d83-0000-000000000000")
public interface ActivationMonitor extends Remote {
    @objid ("8bb917a6-c5ee-459e-a0de-34ecef5aab7e")
    void activeObject(ActivationID p0, MarshalledObject p1) throws RemoteException, UnknownObjectException;

    @objid ("4b369871-39d5-4b44-b916-b7dbab44a5e3")
    void inactiveGroup(ActivationGroupID p0, long p1) throws RemoteException, UnknownGroupException;

    @objid ("edbe3ab9-e9b4-452b-abb0-70677703ff34")
    void inactiveObject(ActivationID p0) throws RemoteException, UnknownObjectException;

}

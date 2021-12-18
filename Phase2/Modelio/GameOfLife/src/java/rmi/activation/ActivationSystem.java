package java.rmi.activation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d8a-0000-000000000000")
public interface ActivationSystem extends Remote {
    @objid ("8140bfb6-26fd-4fc7-b004-8d41679407ac")
    ActivationMonitor activeGroup(ActivationGroupID p0, ActivationInstantiator p1, long p2) throws ActivationException, RemoteException, UnknownGroupException;

    @objid ("85943da3-14f0-4296-8bbf-562b7334a8a5")
    ActivationDesc getActivationDesc(ActivationID p0) throws ActivationException, RemoteException, UnknownObjectException;

    @objid ("a18794cb-6112-4cce-8186-753aa77aa2b1")
    ActivationGroupDesc getActivationGroupDesc(ActivationGroupID p0) throws ActivationException, RemoteException, UnknownGroupException;

    @objid ("fb4bcc08-2623-41fe-8fec-a6a2ab1e9d37")
    ActivationGroupID registerGroup(ActivationGroupDesc p0) throws ActivationException, RemoteException;

    @objid ("0c60cd31-9685-40ba-adfa-1dd4bf43b1db")
    ActivationID registerObject(ActivationDesc p0) throws ActivationException, RemoteException, UnknownGroupException;

    @objid ("1a3c1882-39fd-4c8b-afd8-12f4652acc30")
    ActivationDesc setActivationDesc(ActivationID p0, ActivationDesc p1) throws ActivationException, RemoteException, UnknownGroupException, UnknownObjectException;

    @objid ("ae116abf-a882-4a08-88f1-6578a36f96ae")
    ActivationGroupDesc setActivationGroupDesc(ActivationGroupID p0, ActivationGroupDesc p1) throws ActivationException, RemoteException, UnknownGroupException;

    @objid ("17916a05-dbb6-4c99-80f6-883278196435")
    void shutdown() throws RemoteException;

    @objid ("e796ba6e-0f36-4a6d-a32d-6c0d063deb4a")
    void unregisterGroup(ActivationGroupID p0) throws ActivationException, RemoteException, UnknownGroupException;

    @objid ("c1fef82d-0f3a-4990-9dc1-c9365336d081")
    void unregisterObject(ActivationID p0) throws ActivationException, RemoteException, UnknownObjectException;

}

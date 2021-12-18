package java.rmi.activation;

import java.rmi.MarshalledObject;
import java.rmi.Remote;
import java.rmi.RemoteException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d84-0000-000000000000")
public interface ActivationInstantiator extends Remote {
    @objid ("0a27836e-7568-45ce-b911-94ab891ec553")
    MarshalledObject newInstance(ActivationID p0, ActivationDesc p1) throws ActivationException, RemoteException;

}

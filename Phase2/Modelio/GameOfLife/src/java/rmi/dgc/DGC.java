package java.rmi.dgc;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ObjID;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2dbc-0000-000000000000")
public interface DGC extends Remote {
    @objid ("c00545d4-0ebe-4605-b3c1-7e4175f08296")
    void clean(List<ObjID> p0, long p1, VMID p2, boolean p3) throws RemoteException;

    @objid ("01ac034c-bf09-42b7-9b5c-74537166e08b")
    Lease dirty(List<ObjID> p0, long p1, Lease p2) throws RemoteException;

}

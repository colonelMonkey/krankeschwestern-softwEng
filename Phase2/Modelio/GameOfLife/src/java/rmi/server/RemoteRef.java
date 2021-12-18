package java.rmi.server;

import java.io.Externalizable;
import java.io.ObjectOutput;
import java.lang.reflect.Method;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2da4-0000-000000000000")
public interface RemoteRef extends Externalizable {
    @objid ("1b0cfb43-c8a4-4326-a424-cd3d66c432e8")
    void done(RemoteCall p0) throws RemoteException;

    @objid ("092d5968-1b2b-4c61-b2ee-13b288492b4e")
    String getRefClass(ObjectOutput p0);

    @objid ("14b9cd38-ab20-4b8f-9e3c-279397a96ccc")
    void invoke(RemoteCall p0) throws Exception;

    @objid ("89523d6a-19c3-443d-ba73-25dd6627d0b6")
    Object invoke(Remote p0, Method p1, List<Object> p2, long p3) throws Exception;

    @objid ("a43d05e7-87ee-46c9-9265-6dc3955b8da1")
    RemoteCall newCall(RemoteObject p0, List<Operation> p1, int p2, long p3) throws RemoteException;

    @objid ("577bdd42-7e14-4424-97ed-b5a83c951ed9")
    boolean remoteEquals(RemoteRef p0);

    @objid ("c72f5d59-fbe7-45de-a27b-e0a7565c46fa")
    int remoteHashCode();

    @objid ("dfc5045c-278c-4aea-81fe-3474594348aa")
    String remoteToString();

}

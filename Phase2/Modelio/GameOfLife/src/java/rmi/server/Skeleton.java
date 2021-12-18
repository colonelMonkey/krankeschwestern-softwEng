package java.rmi.server;

import java.rmi.Remote;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d9d-0000-000000000000")
public interface Skeleton {
    @objid ("d1385d0d-8ffb-47cb-baed-34b7689a9799")
    void dispatch(Remote p0, RemoteCall p1, int p2, long p3) throws Exception;

    @objid ("ea694474-5c8e-43d5-be77-b13991ae071d")
    List<Operation> getOperations();

}

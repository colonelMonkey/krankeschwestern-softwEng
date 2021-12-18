package java.rmi.server;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2dac-0000-000000000000")
public interface RMIFailureHandler {
    @objid ("b6dc15b3-7890-48e0-8c99-9832c0794304")
    boolean failure(Exception p0);

}

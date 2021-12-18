package java.awt.peer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28eb-0000-000000000000")
public interface ScrollbarPeer extends ComponentPeer {
    @objid ("bb848206-e7d0-4cb3-9b76-9ebd3ba0a79b")
    void setLineIncrement(int p0);

    @objid ("d0b876f1-9a3b-48b7-882a-074902c00bde")
    void setPageIncrement(int p0);

    @objid ("e2c542ca-aeeb-43e0-85bd-8aa5a12e64bc")
    void setValues(int p0, int p1, int p2, int p3);

}

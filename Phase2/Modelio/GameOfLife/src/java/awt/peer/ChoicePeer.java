package java.awt.peer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ec-0000-000000000000")
public interface ChoicePeer extends ComponentPeer {
    @objid ("712f5ff1-1520-4a51-a296-f0c301aa4189")
    void add(String p0, int p1);

    @objid ("616cfae3-a43b-45cf-83ce-bd2ba80729be")
    void remove(int p0);

    @objid ("f94e4c78-7d7b-4ed4-8340-f8f82aadab3a")
    void removeAll();

    @objid ("8e506f74-09ab-46ee-acde-15fed02b569e")
    void select(int p0);

}

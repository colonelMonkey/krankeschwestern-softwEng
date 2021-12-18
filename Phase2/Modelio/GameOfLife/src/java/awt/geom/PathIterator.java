package java.awt.geom;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28c5-0000-000000000000")
public interface PathIterator {
    @objid ("b54ce6f9-6645-4c98-8402-2adf9a32276a")
    int currentSegment(List<Float> p0);

    @objid ("a1cdb153-4bb4-4d86-9af6-ad966f530417")
    int currentSegment(List<Double> p0);

    @objid ("fa5ef4c9-1b7c-406d-af36-7bf4d8117490")
    int getWindingRule();

    @objid ("2bbf5654-02f0-4552-8e57-e885a1b4a547")
    boolean isDone();

    @objid ("43b8f342-278c-4a04-ae6c-a889db4ba484")
    void next();

}

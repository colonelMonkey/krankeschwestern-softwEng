package java.awt.peer;

import java.awt.Point;
import java.awt.Window;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28f1-0000-000000000000")
public interface MouseInfoPeer {
    @objid ("f0ef8e80-60ea-483d-8f93-c5130e7bb7a4")
    int fillPointWithCoords(Point p0);

    @objid ("d8c7a6e7-87e6-4ff8-b716-965d566485f4")
    boolean isWindowUnderMouse(Window p0);

}

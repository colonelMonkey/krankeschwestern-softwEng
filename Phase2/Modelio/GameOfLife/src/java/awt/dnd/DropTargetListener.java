package java.awt.dnd;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27fb-0000-000000000000")
public interface DropTargetListener extends EventListener {
    @objid ("67c685e1-86bf-4ca1-a135-4ce58d3be4be")
    void dragEnter(DropTargetDragEvent p0);

    @objid ("c0f48b33-1695-4321-9ca3-126060c4aa20")
    void dragExit(DropTargetEvent p0);

    @objid ("23b56ab9-297f-455b-a562-b35248717b48")
    void dragOver(DropTargetDragEvent p0);

    @objid ("382d0f18-956c-462f-bee0-3b86fa9fb3b3")
    void drop(DropTargetDropEvent p0);

    @objid ("caa4b8dd-ad7a-48f0-a947-e5241a6eac3e")
    void dropActionChanged(DropTargetDragEvent p0);

}

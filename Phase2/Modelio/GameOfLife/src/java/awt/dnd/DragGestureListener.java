package java.awt.dnd;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2804-0000-000000000000")
public interface DragGestureListener extends EventListener {
    @objid ("46f61d2d-a20d-4085-ad18-1e6423178f5b")
    void dragGestureRecognized(DragGestureEvent p0);

}

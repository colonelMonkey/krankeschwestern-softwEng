package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-284a-0000-000000000000")
public interface MouseMotionListener extends EventListener {
    @objid ("9c19bb7d-08ff-4741-947c-aea1fa991fb8")
    void mouseDragged(MouseEvent p0);

    @objid ("2abfede4-e85a-4ec4-b4e2-dda8f674b35c")
    void mouseMoved(MouseEvent p0);

}

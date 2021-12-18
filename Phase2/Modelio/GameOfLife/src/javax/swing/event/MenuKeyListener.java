package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-236a-0000-000000000000")
public interface MenuKeyListener extends EventListener {
    @objid ("f79b4cbb-e646-4b2b-bda7-73d28ed9bcb0")
    void menuKeyPressed(MenuKeyEvent p0);

    @objid ("c5b02663-f162-4f32-83af-f3570fda5830")
    void menuKeyReleased(MenuKeyEvent p0);

    @objid ("58563a1b-5024-4ded-b9cb-283d6d6db3f9")
    void menuKeyTyped(MenuKeyEvent p0);

}

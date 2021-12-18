package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-236b-0000-000000000000")
public interface MenuDragMouseListener extends EventListener {
    @objid ("b1180eb5-5973-4cb7-97e6-ba4214c96c90")
    void menuDragMouseDragged(MenuDragMouseEvent p0);

    @objid ("b4aa3e00-ceb7-4279-8dd0-85317c14f8b4")
    void menuDragMouseEntered(MenuDragMouseEvent p0);

    @objid ("f30e012b-8d3d-4470-8b70-f482f2b2d34d")
    void menuDragMouseExited(MenuDragMouseEvent p0);

    @objid ("00442552-43e8-4bba-a568-4249d6f19889")
    void menuDragMouseReleased(MenuDragMouseEvent p0);

}

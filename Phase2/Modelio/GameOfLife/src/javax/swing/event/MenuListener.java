package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-237a-0000-000000000000")
public interface MenuListener extends EventListener {
    @objid ("b89f5810-bb9f-4e7f-a6d0-5792ab0ab654")
    void menuCanceled(MenuEvent p0);

    @objid ("786b4347-8861-47fc-bdea-c15ac8a792c4")
    void menuDeselected(MenuEvent p0);

    @objid ("fd077704-62fc-4c39-b058-52a9ffc79750")
    void menuSelected(MenuEvent p0);

}

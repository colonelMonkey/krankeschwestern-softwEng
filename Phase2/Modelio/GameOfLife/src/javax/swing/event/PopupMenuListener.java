package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-235a-0000-000000000000")
public interface PopupMenuListener extends EventListener {
    @objid ("629ae58c-2ab1-4ba6-a9d8-be345aabee3c")
    void popupMenuCanceled(PopupMenuEvent p0);

    @objid ("9e133d09-2399-4779-b460-1cb08e8a25e6")
    void popupMenuWillBecomeInvisible(PopupMenuEvent p0);

    @objid ("e13e7d58-ebd3-4c20-97c6-f9a2c812a30f")
    void popupMenuWillBecomeVisible(PopupMenuEvent p0);

}

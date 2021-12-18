package java.awt.peer;

import java.awt.Component;
import java.awt.Window;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ed-0000-000000000000")
public interface KeyboardFocusManagerPeer {
    @objid ("0f8f9385-d552-48d6-aaf5-3e83c3a3100c")
    void clearGlobalFocusOwner(Window p0);

    @objid ("d380175a-03ff-4879-ac8e-98c7e237d1f5")
    Component getCurrentFocusOwner();

    @objid ("89e299b0-9a45-4ecb-a010-1c0bb4cadb28")
    Window getCurrentFocusedWindow();

    @objid ("935d55a5-aadf-494d-9e6d-e7c9a13e3d1d")
    void setCurrentFocusOwner(Component p0);

    @objid ("c45a6198-8c44-4069-bec8-c8c7903a2aea")
    void setCurrentFocusedWindow(Window p0);

}

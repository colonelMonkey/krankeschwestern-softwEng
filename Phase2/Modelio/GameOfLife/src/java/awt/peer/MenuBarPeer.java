package java.awt.peer;

import java.awt.Menu;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e9-0000-000000000000")
public interface MenuBarPeer extends MenuComponentPeer {
    @objid ("0f207fca-b421-4c3e-b434-feeaaba539e2")
    void addHelpMenu(Menu p0);

    @objid ("4fc7a7d9-8d41-4dd2-99d4-a68290d67af1")
    void addMenu(Menu p0);

    @objid ("0e33b749-0a8a-4406-b75d-41e4350c1ab6")
    void delMenu(int p0);

}

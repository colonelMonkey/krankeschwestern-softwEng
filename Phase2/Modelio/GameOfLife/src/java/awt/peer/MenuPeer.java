package java.awt.peer;

import java.awt.MenuItem;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28dc-0000-000000000000")
public interface MenuPeer extends MenuItemPeer {
    @objid ("307c4dc1-c4e9-4ae3-89fc-3593e2dbde1f")
    void addItem(MenuItem p0);

    @objid ("3a58c074-4e0a-4532-aae3-4d3c7edeb32d")
    void addSeparator();

    @objid ("6d509131-be60-4b4c-8184-f445ff7805e0")
    void delItem(int p0);

}

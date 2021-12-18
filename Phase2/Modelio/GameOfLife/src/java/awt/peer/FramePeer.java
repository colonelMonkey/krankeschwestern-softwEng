package java.awt.peer;

import java.awt.MenuBar;
import java.awt.Rectangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e2-0000-000000000000")
public interface FramePeer extends WindowPeer {
    @objid ("b2d65932-0dac-4ec4-8d63-d6669cc3c0cd")
    void emulateActivation(boolean p0);

    @objid ("83e85028-03b0-4cff-9400-918bdd79c23e")
    Rectangle getBoundsPrivate();

    @objid ("6277ee35-d543-4ee8-9bb9-9faf568420e0")
    int getState();

    @objid ("17df85a9-de1a-4a1f-9d7a-faa917f6f56c")
    void setBoundsPrivate(int p0, int p1, int p2, int p3);

    @objid ("21d3c3a3-535b-4e2e-909a-bac810815d20")
    void setMaximizedBounds(Rectangle p0);

    @objid ("d2d8c29f-ad63-4b52-ad9c-066ed91ad7b2")
    void setMenuBar(MenuBar p0);

    @objid ("03b6c758-e73f-401c-9f5d-b4053595ca20")
    void setResizable(boolean p0);

    @objid ("3f6bcb8a-d00c-4475-9903-17dc2dda931a")
    void setState(int p0);

    @objid ("9c3101f1-13e5-4073-a027-c5717e849b8c")
    void setTitle(String p0);

}

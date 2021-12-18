package java.awt.peer;

import java.awt.Adjustable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ef-0000-000000000000")
public interface ScrollPanePeer extends ContainerPeer {
    @objid ("1e62ba88-7d6b-4723-ac39-5f1bc944d114")
    void childResized(int p0, int p1);

    @objid ("ee8fae3c-4239-41aa-b024-f3194fdf842a")
    int getHScrollbarHeight();

    @objid ("bf25a2ab-3801-48f7-9649-04758cd56e1d")
    int getVScrollbarWidth();

    @objid ("4abd9ea6-4b68-4f7e-b32b-bdf3e5c02a15")
    void setScrollPosition(int p0, int p1);

    @objid ("a6a887e8-03fb-4c68-a596-e7063f9fc544")
    void setUnitIncrement(Adjustable p0, int p1);

    @objid ("032814d7-f394-4f21-8a44-84dbfb609cdc")
    void setValue(Adjustable p0, int p1);

}

package java.awt;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-299d-0000-000000000000")
public interface MenuContainer {
    @objid ("167194f5-006a-4dc6-8aaa-ba54b5d7dbfa")
    Font getFont();

    @objid ("c7226889-c0d7-4b54-929c-53761b4ccfec")
    boolean postEvent(Event p0);

    @objid ("07939dfc-7fb5-4254-bdde-15c6d85e346d")
    void remove(MenuComponent p0);

}

package java.awt;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-295d-0000-000000000000")
public interface LayoutManager {
    @objid ("d69916d4-3767-456e-a243-011c83df8fe8")
    void addLayoutComponent(String p0, Component p1);

    @objid ("735a9dc6-a1c2-40ec-9051-ebd2836c7ab0")
    void layoutContainer(Container p0);

    @objid ("ca61bf99-aaae-4b7b-b2bc-73e09a80683f")
    Dimension minimumLayoutSize(Container p0);

    @objid ("6d227070-e6cf-42be-9b96-947622e7ff6f")
    Dimension preferredLayoutSize(Container p0);

    @objid ("08f82c62-5624-4b3d-8e23-cd7054cde12a")
    void removeLayoutComponent(Component p0);

}

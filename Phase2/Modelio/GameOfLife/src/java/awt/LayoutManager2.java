package java.awt;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2976-0000-000000000000")
public interface LayoutManager2 extends LayoutManager {
    @objid ("71b675c2-b319-4ba4-bb11-c9e0abcc0c4f")
    void addLayoutComponent(Component p0, Object p1);

    @objid ("193ae1cc-010a-4a8b-af0b-ef433eb21132")
    float getLayoutAlignmentX(Container p0);

    @objid ("f16b7539-755e-4df1-9a6c-d93ceea67f0e")
    float getLayoutAlignmentY(Container p0);

    @objid ("3057aa8d-45ec-4ccd-bb45-8b1b72235ccc")
    void invalidateLayout(Container p0);

    @objid ("9515ca6e-677d-477a-abe7-39d3bf19c95f")
    Dimension maximumLayoutSize(Container p0);

}

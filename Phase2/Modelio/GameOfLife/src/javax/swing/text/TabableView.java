package javax.swing.text;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2060-0000-000000000000")
public interface TabableView {
    @objid ("85f05c9d-6d4e-45f3-bbe9-eacb7794eeec")
    float getPartialSpan(int p0, int p1);

    @objid ("795d6ad5-b046-402d-b3cf-4bb115eb5b22")
    float getTabbedSpan(float p0, TabExpander p1);

}

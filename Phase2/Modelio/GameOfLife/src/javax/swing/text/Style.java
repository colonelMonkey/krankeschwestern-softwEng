package javax.swing.text;

import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-203a-0000-000000000000")
public interface Style extends MutableAttributeSet {
    @objid ("1b7c7e1d-708c-48a4-97f6-19f386198244")
    void addChangeListener(ChangeListener p0);

    @objid ("09ce5cac-5089-4531-a1c1-fefce7fdac07")
    String getName();

    @objid ("f1db7be4-fbcd-480c-b0a3-bc8c5aabd144")
    void removeChangeListener(ChangeListener p0);

}

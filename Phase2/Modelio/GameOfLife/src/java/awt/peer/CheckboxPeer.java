package java.awt.peer;

import java.awt.CheckboxGroup;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ea-0000-000000000000")
public interface CheckboxPeer extends ComponentPeer {
    @objid ("275676cb-212f-4ad4-b33e-7e3bf38aa17b")
    void setCheckboxGroup(CheckboxGroup p0);

    @objid ("6b6141bb-805d-4f59-8fd0-14e53f9abd05")
    void setLabel(String p0);

    @objid ("773c2723-ccd4-4462-b64d-d71a1c2e8913")
    void setState(boolean p0);

}

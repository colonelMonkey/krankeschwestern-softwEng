package javax.swing;

import java.awt.event.ItemListener;
import javax.accessibility.Accessible;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-24b5-0000-000000000000")
public class JToggleButton extends AbstractButton implements Accessible {
    @objid ("00d00398-0000-24b7-0000-000000000000")
    public static class ToggleButtonModel extends DefaultButtonModel {
    }

    @objid ("d2c879b4-4420-47f0-bdef-b5b6f2148223")
    protected class AccessibleJToggleButton extends AccessibleAbstractButton implements ItemListener {
    }

}

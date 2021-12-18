package javax.swing;

import java.awt.ItemSelectable;
import java.io.Serializable;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleExtendedComponent;
import javax.accessibility.AccessibleText;
import javax.accessibility.AccessibleValue;
import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-24b8-0000-000000000000")
public abstract class AbstractButton extends JComponent implements ItemSelectable, SwingConstants {
    @objid ("87155edf-03d4-4cfa-9f29-4e82b5dc8aa4")
    protected abstract class AccessibleAbstractButton extends AccessibleJComponent implements AccessibleAction, AccessibleValue, AccessibleText, AccessibleExtendedComponent {
    }

    @objid ("65a03a9a-5d62-4e00-82c4-786a8f44fd06")
    protected class ButtonChangeListener implements ChangeListener, Serializable {
    }

}

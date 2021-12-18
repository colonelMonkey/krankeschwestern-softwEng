package javax.swing;

import java.awt.LayoutManager;
import java.beans.PropertyChangeListener;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleEditableText;
import javax.accessibility.AccessibleText;
import javax.accessibility.AccessibleValue;
import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23ea-0000-000000000000")
public class JSpinner extends JComponent implements Accessible {
    @objid ("00d00398-0000-23ec-0000-000000000000")
    public static class DateEditor extends DefaultEditor {
    }

    @objid ("00d00398-0000-23ee-0000-000000000000")
    public static class DefaultEditor extends JPanel implements ChangeListener, PropertyChangeListener, LayoutManager {
    }

    @objid ("00d00398-0000-23f0-0000-000000000000")
    public static class ListEditor extends DefaultEditor {
    }

    @objid ("00d00398-0000-23f4-0000-000000000000")
    public static class NumberEditor extends DefaultEditor {
    }

    @objid ("7ef5779e-6e93-4370-a52d-bec52a107066")
    protected class AccessibleJSpinner extends AccessibleJComponent implements AccessibleValue, AccessibleAction, AccessibleText, AccessibleEditableText, ChangeListener {
    }

}

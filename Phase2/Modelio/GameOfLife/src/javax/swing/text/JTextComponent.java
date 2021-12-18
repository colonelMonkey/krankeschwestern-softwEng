package javax.swing.text;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleEditableText;
import javax.accessibility.AccessibleExtendedText;
import javax.accessibility.AccessibleText;
import javax.swing.JComponent;
import javax.swing.Scrollable;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2064-0000-000000000000")
public abstract class JTextComponent extends JComponent implements Scrollable, Accessible {
    @objid ("00d00398-0000-2065-0000-000000000000")
    public class AccessibleJTextComponent extends AccessibleJComponent implements AccessibleText, CaretListener, DocumentListener, AccessibleAction, AccessibleEditableText, AccessibleExtendedText {
    }

    @objid ("01ec0d38-0000-15c7-0000-000000000000")
    public static final class DropLocation extends DropLocation {
    }

    @objid ("00d00398-0000-206c-0000-000000000000")
    public static class KeyBinding {
    }

}

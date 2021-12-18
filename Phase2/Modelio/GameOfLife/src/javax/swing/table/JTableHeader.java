package javax.swing.table;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.swing.JComponent;
import javax.swing.event.TableColumnModelListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23a2-0000-000000000000")
public class JTableHeader extends JComponent implements TableColumnModelListener, Accessible {
    @objid ("d8c89766-ecda-430a-b3a4-506e309b401b")
    protected class AccessibleJTableHeader extends AccessibleJComponent {
        @objid ("7f916323-4ec4-4149-a3dc-405619c383c4")
        protected class AccessibleJTableHeaderEntry extends AccessibleContext implements Accessible, AccessibleComponent {
        }

    }

}

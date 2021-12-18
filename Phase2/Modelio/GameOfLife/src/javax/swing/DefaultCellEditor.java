package javax.swing;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.Serializable;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-241a-0000-000000000000")
public class DefaultCellEditor extends AbstractCellEditor implements TableCellEditor, TreeCellEditor {
    @objid ("fcfca461-e2ac-4d44-a22f-dfe0ecdc60a2")
    protected class EditorDelegate implements ActionListener, ItemListener, Serializable {
    }

}

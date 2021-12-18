package javax.swing;

import java.beans.PropertyChangeListener;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleExtendedTable;
import javax.accessibility.AccessibleSelection;
import javax.accessibility.AccessibleTableModelChange;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.RowSorterListener;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.TableModelListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-24d1-0000-000000000000")
public class JTable extends JComponent implements TableModelListener, Scrollable, TableColumnModelListener, ListSelectionListener, CellEditorListener, Accessible, RowSorterListener {
    @objid ("01ec0d38-0000-18ef-0000-000000000000")
    public static final class DropLocation extends DropLocation {
    }

    @objid ("a1ea7aa1-940a-405a-90b5-cbd71610c2ff")
    protected class AccessibleJTable extends AccessibleJComponent implements AccessibleSelection, ListSelectionListener, TableModelListener, TableColumnModelListener, CellEditorListener, PropertyChangeListener, AccessibleExtendedTable {
        @objid ("faff8e1f-d3b0-4dbb-8de6-192bd00449f1")
        protected class AccessibleJTableCell extends AccessibleContext implements Accessible, AccessibleComponent {
        }

        @objid ("24461058-7870-45d9-a137-8f892ce620fb")
        protected class AccessibleJTableModelChange implements AccessibleTableModelChange {
        }

    }

    @objid ("dba569e7-f3e2-4042-a346-f852f9d47eb4")
    public enum PrintMode {
        ;
    }

}

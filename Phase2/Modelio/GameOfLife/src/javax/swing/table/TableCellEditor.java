package javax.swing.table;

import java.awt.Component;
import javax.swing.CellEditor;
import javax.swing.JTable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23a0-0000-000000000000")
public interface TableCellEditor extends CellEditor {
    @objid ("08a40dde-8be2-4cc8-8a13-e7b018f42b10")
    Component getTableCellEditorComponent(JTable p0, Object p1, boolean p2, int p3, int p4);

}

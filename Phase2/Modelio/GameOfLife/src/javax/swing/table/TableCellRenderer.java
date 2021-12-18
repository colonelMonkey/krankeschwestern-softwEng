package javax.swing.table;

import java.awt.Component;
import javax.swing.JTable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-239c-0000-000000000000")
public interface TableCellRenderer {
    @objid ("1c6bb984-66aa-424e-8e95-d5ddc593b588")
    Component getTableCellRendererComponent(JTable p0, Object p1, boolean p2, boolean p3, int p4, int p5);

}

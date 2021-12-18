package javax.swing.tree;

import java.awt.Component;
import javax.swing.CellEditor;
import javax.swing.JTree;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2331-0000-000000000000")
public interface TreeCellEditor extends CellEditor {
    @objid ("cac8fdf3-b82c-4c2a-879f-2de5eb641c09")
    Component getTreeCellEditorComponent(JTree p0, Object p1, boolean p2, boolean p3, boolean p4, int p5);

}

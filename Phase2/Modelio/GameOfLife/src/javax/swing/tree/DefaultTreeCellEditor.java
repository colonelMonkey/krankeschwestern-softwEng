package javax.swing.tree;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.event.TreeSelectionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-233f-0000-000000000000")
public class DefaultTreeCellEditor implements ActionListener, TreeCellEditor, TreeSelectionListener {
    @objid ("00d00398-0000-2340-0000-000000000000")
    public class DefaultTextField extends JTextField {
    }

    @objid ("00d00398-0000-2341-0000-000000000000")
    public class EditorContainer extends Container {
    }

}

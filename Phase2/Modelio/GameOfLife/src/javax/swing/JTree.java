package javax.swing;

import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleSelection;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeSelectionModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2432-0000-000000000000")
public class JTree extends JComponent implements Scrollable, Accessible {
    @objid ("01ec0d38-0000-1867-0000-000000000000")
    public static final class DropLocation extends DropLocation {
    }

    @objid ("00d00398-0000-2435-0000-000000000000")
    public static class DynamicUtilTreeNode extends DefaultMutableTreeNode {
    }

    @objid ("477aec3a-2b02-4c57-99a2-fe10157c76c4")
    protected class AccessibleJTree extends AccessibleJComponent implements AccessibleSelection, TreeSelectionListener, TreeModelListener, TreeExpansionListener {
        @objid ("f4515b40-23ed-4ae6-a303-a888578e8185")
        protected class AccessibleJTreeNode extends AccessibleContext implements Accessible, AccessibleComponent, AccessibleSelection, AccessibleAction {
        }

    }

    @objid ("d99b1763-1e0a-4807-bcdb-d547060e88a6")
    protected static class EmptySelectionModel extends DefaultTreeSelectionModel {
    }

    @objid ("57495c6e-2369-446c-9128-e99338d4389e")
    protected class TreeModelHandler implements TreeModelListener {
    }

    @objid ("0ec3c077-0113-468c-9053-e0d794d79c4f")
    protected class TreeSelectionRedirector implements Serializable, TreeSelectionListener {
    }

}

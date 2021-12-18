package javax.swing.event;

import java.util.EventListener;
import javax.swing.tree.ExpandVetoException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-237b-0000-000000000000")
public interface TreeWillExpandListener extends EventListener {
    @objid ("2e4cd8c0-c9af-47c0-959f-0c083b45c4ba")
    void treeWillCollapse(TreeExpansionEvent p0) throws ExpandVetoException;

    @objid ("302f73c7-ee51-4a98-a146-20989d000551")
    void treeWillExpand(TreeExpansionEvent p0) throws ExpandVetoException;

}

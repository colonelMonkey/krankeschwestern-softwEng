package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2370-0000-000000000000")
public interface TreeModelListener extends EventListener {
    @objid ("38c3367d-c3e9-43b3-87e7-0cb0c932e400")
    void treeNodesChanged(TreeModelEvent p0);

    @objid ("3056fc8d-774e-461d-86da-79c66556a0ca")
    void treeNodesInserted(TreeModelEvent p0);

    @objid ("233ce624-909f-4a5a-a71a-fd865a4c3a70")
    void treeNodesRemoved(TreeModelEvent p0);

    @objid ("af768168-cf4f-4c31-ae97-f38f6c83ac08")
    void treeStructureChanged(TreeModelEvent p0);

}

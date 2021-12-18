package javax.swing.tree;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-233c-0000-000000000000")
public interface MutableTreeNode extends TreeNode {
    @objid ("7838b5c0-baac-4685-8e98-fe59e7c41473")
    void insert(MutableTreeNode p0, int p1);

    @objid ("47cba6ef-d65b-4fa7-99a4-7f749cfb3cf6")
    void remove(MutableTreeNode p0);

    @objid ("ec97c3ab-1ec7-458a-8f8f-fabdba0e110d")
    void remove(int p0);

    @objid ("58b074ac-2cb2-4dc5-b920-105c517deb8e")
    void removeFromParent();

    @objid ("7ec22094-ac84-49be-a7c0-e116d9aef8ef")
    void setParent(MutableTreeNode p0);

    @objid ("e2933edf-582c-49dc-8869-c60afd5c473e")
    void setUserObject(Object p0);

}

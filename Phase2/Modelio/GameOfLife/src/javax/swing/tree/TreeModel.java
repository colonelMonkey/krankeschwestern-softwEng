package javax.swing.tree;

import javax.swing.event.TreeModelListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2329-0000-000000000000")
public interface TreeModel {
    @objid ("0a76549a-b3b3-4e47-89d0-6181b79ff119")
    void addTreeModelListener(TreeModelListener p0);

    @objid ("3419dbbf-6cfa-4daf-b89c-211ea84db16e")
    Object getChild(Object p0, int p1);

    @objid ("388befa2-3fbf-43e5-8bcf-8e41e51101a4")
    int getChildCount(Object p0);

    @objid ("1a2fd443-7257-4d95-b721-032815bfa29e")
    int getIndexOfChild(Object p0, Object p1);

    @objid ("4716bf8e-d8c9-4267-b1c5-222b1eef5e90")
    Object getRoot();

    @objid ("67bbd22c-40d7-47c5-91b2-3b69b3512b93")
    boolean isLeaf(Object p0);

    @objid ("e9437426-a2c6-476b-8c68-5f52ba2cd3f3")
    void removeTreeModelListener(TreeModelListener p0);

    @objid ("bcc08425-5abf-470a-95f2-35a242681a73")
    void valueForPathChanged(TreePath p0, Object p1);

}

package javax.swing.tree;

import java.util.Enumeration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2324-0000-000000000000")
public interface TreeNode {
    @objid ("79129dde-56b8-48b7-8526-d84f9cdb534e")
    Enumeration children();

    @objid ("33c5c697-9530-4881-b995-11763dae6cf7")
    boolean getAllowsChildren();

    @objid ("a7fc9c8a-d6ba-4647-bb16-59eba916d51c")
    TreeNode getChildAt(int p0);

    @objid ("87bb6c7a-62f0-48bc-9d47-470e16622a01")
    int getChildCount();

    @objid ("1e101ee6-a738-4661-a83a-56d293f46b23")
    int getIndex(TreeNode p0);

    @objid ("58baf70f-4d91-42d3-961d-d307347fd050")
    TreeNode getParent();

    @objid ("d5168c6b-7050-4b21-87dc-fd1b50a77786")
    boolean isLeaf();

}

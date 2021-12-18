package javax.swing.tree;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-232e-0000-000000000000")
public interface RowMapper {
    @objid ("24881df3-15b7-4225-8590-3677f94d3756")
    List<Integer> getRowsForPaths(List<TreePath> p0);

}

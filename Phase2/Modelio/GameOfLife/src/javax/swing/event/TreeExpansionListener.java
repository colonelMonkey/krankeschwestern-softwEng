package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-236c-0000-000000000000")
public interface TreeExpansionListener extends EventListener {
    @objid ("05882988-a488-4f82-b170-5baed9ddad36")
    void treeCollapsed(TreeExpansionEvent p0);

    @objid ("a569bb68-3be8-41b3-ad68-bca29bbcc69e")
    void treeExpanded(TreeExpansionEvent p0);

}

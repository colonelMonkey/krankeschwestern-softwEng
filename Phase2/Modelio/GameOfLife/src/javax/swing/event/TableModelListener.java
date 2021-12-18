package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2374-0000-000000000000")
public interface TableModelListener extends EventListener {
    @objid ("4e307685-3af5-4a17-91e1-584f76b036f6")
    void tableChanged(TableModelEvent p0);

}

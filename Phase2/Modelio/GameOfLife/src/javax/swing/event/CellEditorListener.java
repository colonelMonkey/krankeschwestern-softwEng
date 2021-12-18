package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-235c-0000-000000000000")
public interface CellEditorListener extends EventListener {
    @objid ("627226d2-4da0-4d90-84ec-92167c4dce94")
    void editingCanceled(ChangeEvent p0);

    @objid ("8e85f85f-0188-4526-b7e0-2afc04e9b22e")
    void editingStopped(ChangeEvent p0);

}

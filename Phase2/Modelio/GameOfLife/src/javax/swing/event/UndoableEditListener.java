package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2364-0000-000000000000")
public interface UndoableEditListener extends EventListener {
    @objid ("5d044f19-febd-4d61-87b0-3dada69df3a3")
    void undoableEditHappened(UndoableEditEvent p0);

}

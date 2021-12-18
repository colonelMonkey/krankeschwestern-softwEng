package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2871-0000-000000000000")
public interface FocusListener extends EventListener {
    @objid ("12c73914-ac4e-4357-9550-217ba6fda2fd")
    void focusGained(FocusEvent p0);

    @objid ("5a6e284d-0a9f-45ee-9c97-00b01bb98043")
    void focusLost(FocusEvent p0);

}

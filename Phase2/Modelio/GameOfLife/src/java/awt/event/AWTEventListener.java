package java.awt.event;

import java.awt.AWTEvent;
import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2872-0000-000000000000")
public interface AWTEventListener extends EventListener {
    @objid ("941f2538-8a0b-4201-9960-4d6f80491dd8")
    void eventDispatched(AWTEvent p0);

}

package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-284f-0000-000000000000")
public interface WindowFocusListener extends EventListener {
    @objid ("27f30cf2-33c1-420c-b172-e18ac1634f4b")
    void windowGainedFocus(WindowEvent p0);

    @objid ("e428508d-0e5c-42cc-9ba4-4499292adc54")
    void windowLostFocus(WindowEvent p0);

}

package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-284b-0000-000000000000")
public interface AdjustmentListener extends EventListener {
    @objid ("97a803f3-3adb-4a6d-8ffe-81a45a6e2b60")
    void adjustmentValueChanged(AdjustmentEvent p0);

}

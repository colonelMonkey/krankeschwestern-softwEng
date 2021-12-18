package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2869-0000-000000000000")
public interface WindowStateListener extends EventListener {
    @objid ("70cc7ffc-f8b0-4ddb-9c11-df3728715073")
    void windowStateChanged(WindowEvent p0);

}

package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-286b-0000-000000000000")
public interface WindowListener extends EventListener {
    @objid ("31f3cd79-79a5-48a1-b873-3181589975cc")
    void windowActivated(WindowEvent p0);

    @objid ("63868a9b-2c1c-43dc-905d-eaccfcd5d965")
    void windowClosed(WindowEvent p0);

    @objid ("1c16b6ff-aa06-416b-9e5d-00d919edf3c5")
    void windowClosing(WindowEvent p0);

    @objid ("4aff958e-2639-4d3f-8c76-be82134f11f0")
    void windowDeactivated(WindowEvent p0);

    @objid ("4ee570a6-c9be-490b-9d8e-93236d4d79ca")
    void windowDeiconified(WindowEvent p0);

    @objid ("969cd5c4-a5df-4587-9b8b-93dd2c52864b")
    void windowIconified(WindowEvent p0);

    @objid ("e714a941-0bbb-4e4b-9e7a-2856ac73be81")
    void windowOpened(WindowEvent p0);

}

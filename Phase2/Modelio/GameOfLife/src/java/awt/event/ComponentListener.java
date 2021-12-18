package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2852-0000-000000000000")
public interface ComponentListener extends EventListener {
    @objid ("ede4fabb-e1f8-47ac-b1c9-f2c095a1b3e2")
    void componentHidden(ComponentEvent p0);

    @objid ("aa781bcf-8c54-459f-af64-bd65feab6005")
    void componentMoved(ComponentEvent p0);

    @objid ("fd459c68-9d44-4a79-ad20-76777fcbdd10")
    void componentResized(ComponentEvent p0);

    @objid ("d3038be3-a7e9-4d78-8895-9d3ba592c242")
    void componentShown(ComponentEvent p0);

}

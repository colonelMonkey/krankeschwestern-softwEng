package java.awt.peer;

import java.awt.GraphicsConfiguration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28db-0000-000000000000")
public interface CanvasPeer extends ComponentPeer {
    @objid ("aa58c748-f4c5-4a3c-ad14-ecf16bd9e277")
    GraphicsConfiguration getAppropriateGraphicsConfiguration(GraphicsConfiguration p0);

}

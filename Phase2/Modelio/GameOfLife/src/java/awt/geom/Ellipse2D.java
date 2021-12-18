package java.awt.geom;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ab-0000-000000000000")
public abstract class Ellipse2D extends RectangularShape {
    @objid ("00d00398-0000-28ac-0000-000000000000")
    public static class Double extends Ellipse2D implements Serializable {
    }

    @objid ("00d00398-0000-28ad-0000-000000000000")
    public static class Float extends Ellipse2D implements Serializable {
    }

}

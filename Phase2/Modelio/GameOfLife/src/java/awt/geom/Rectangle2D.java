package java.awt.geom;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ba-0000-000000000000")
public abstract class Rectangle2D extends RectangularShape {
    @objid ("00d00398-0000-28bb-0000-000000000000")
    public static class Double extends Rectangle2D implements Serializable {
    }

    @objid ("00d00398-0000-28bc-0000-000000000000")
    public static class Float extends Rectangle2D implements Serializable {
    }

}

package java.awt.geom;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28d0-0000-000000000000")
public abstract class Arc2D extends RectangularShape {
    @objid ("00d00398-0000-28d1-0000-000000000000")
    public static class Double extends Arc2D implements Serializable {
    }

    @objid ("00d00398-0000-28d2-0000-000000000000")
    public static class Float extends Arc2D implements Serializable {
    }

}

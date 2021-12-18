package java.awt.geom;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28b2-0000-000000000000")
public abstract class RoundRectangle2D extends RectangularShape {
    @objid ("00d00398-0000-28b3-0000-000000000000")
    public static class Double extends RoundRectangle2D implements Serializable {
    }

    @objid ("00d00398-0000-28b4-0000-000000000000")
    public static class Float extends RoundRectangle2D implements Serializable {
    }

}

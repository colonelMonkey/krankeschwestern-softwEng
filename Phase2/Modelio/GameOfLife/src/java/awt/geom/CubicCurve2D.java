package java.awt.geom;

import java.awt.Shape;
import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28af-0000-000000000000")
public abstract class CubicCurve2D implements Shape, Cloneable {
    @objid ("00d00398-0000-28b0-0000-000000000000")
    public static class Double extends CubicCurve2D implements Serializable {
    }

    @objid ("00d00398-0000-28b1-0000-000000000000")
    public static class Float extends CubicCurve2D implements Serializable {
    }

}

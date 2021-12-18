package java.awt.geom;

import java.awt.Shape;
import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28bd-0000-000000000000")
public abstract class QuadCurve2D implements Shape, Cloneable {
    @objid ("00d00398-0000-28be-0000-000000000000")
    public static class Double extends QuadCurve2D implements Serializable {
    }

    @objid ("00d00398-0000-28bf-0000-000000000000")
    public static class Float extends QuadCurve2D implements Serializable {
    }

}

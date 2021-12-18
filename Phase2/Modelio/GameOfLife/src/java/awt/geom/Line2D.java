package java.awt.geom;

import java.awt.Shape;
import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28c6-0000-000000000000")
public abstract class Line2D implements Shape, Cloneable {
    @objid ("00d00398-0000-28c7-0000-000000000000")
    public static class Double extends Line2D implements Serializable {
    }

    @objid ("00d00398-0000-28c8-0000-000000000000")
    public static class Float extends Line2D implements Serializable {
    }

}

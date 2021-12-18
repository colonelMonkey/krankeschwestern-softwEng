package java.awt.geom;

import java.awt.Shape;
import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1a64-0000-000000000000")
public abstract class Path2D implements Shape, Cloneable {
    @objid ("01ec0d38-0000-1a65-0000-000000000000")
    public static class Double extends Path2D implements Serializable {
    }

    @objid ("01ec0d38-0000-1a68-0000-000000000000")
    public static class Float extends Path2D implements Serializable {
    }

}

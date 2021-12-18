package java.awt.geom;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28cb-0000-000000000000")
public abstract class Point2D implements Cloneable {
    @objid ("00d00398-0000-28cc-0000-000000000000")
    public static class Double extends Point2D implements Serializable {
    }

    @objid ("00d00398-0000-28cd-0000-000000000000")
    public static class Float extends Point2D implements Serializable {
    }

}

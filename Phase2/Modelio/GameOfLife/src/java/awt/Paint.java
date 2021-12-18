package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29a7-0000-000000000000")
public interface Paint extends Transparency {
    @objid ("d4de7f28-e089-465b-8e84-ad3e514e7835")
    PaintContext createContext(ColorModel p0, Rectangle p1, Rectangle2D p2, AffineTransform p3, RenderingHints p4);

}

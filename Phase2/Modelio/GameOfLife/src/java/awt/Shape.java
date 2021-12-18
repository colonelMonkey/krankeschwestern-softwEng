package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29b4-0000-000000000000")
public interface Shape {
    @objid ("9c33d42b-d343-4924-b8cb-7154a148a9dd")
    boolean contains(double p0, double p1, double p2, double p3);

    @objid ("27d0ca76-86fb-4f0c-8f96-933f39f74fd7")
    boolean contains(Point2D p0);

    @objid ("a02c4fd4-3b6b-44e4-82d7-d6544e854e17")
    boolean contains(double p0, double p1);

    @objid ("1d061546-50c1-4cdf-8a5f-8d69b33be6ef")
    boolean contains(Rectangle2D p0);

    @objid ("52172cde-3c93-474e-a073-bdf8f8ea465d")
    Rectangle getBounds();

    @objid ("15c87df4-1e07-4433-8d95-df332f68c8d2")
    Rectangle2D getBounds2D();

    @objid ("9c2924cc-e2b1-4a4e-9cce-3e59506a27b9")
    PathIterator getPathIterator(AffineTransform p0);

    @objid ("f079f7c3-6c94-4106-9615-81d5415a3405")
    PathIterator getPathIterator(AffineTransform p0, double p1);

    @objid ("c5d992ee-de9b-47d6-80c7-26954b3e01ea")
    boolean intersects(Rectangle2D p0);

    @objid ("3b9f2200-e7f1-4cc2-9ba7-4102c2d9b745")
    boolean intersects(double p0, double p1, double p2, double p3);

}

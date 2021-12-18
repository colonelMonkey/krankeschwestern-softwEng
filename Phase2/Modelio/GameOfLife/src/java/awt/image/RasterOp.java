package java.awt.image;

import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-281d-0000-000000000000")
public interface RasterOp {
    @objid ("5a41be01-74ce-4735-9b40-aa4c3e977da0")
    WritableRaster createCompatibleDestRaster(Raster p0);

    @objid ("01cce6a2-c292-4a20-a8d3-c15b39c5c0f1")
    WritableRaster filter(Raster p0, WritableRaster p1);

    @objid ("6de1161d-9f23-47b8-aac8-643c6a514a34")
    Rectangle2D getBounds2D(Raster p0);

    @objid ("7f09715c-b201-47df-a4b7-5033fbc02154")
    Point2D getPoint2D(Point2D p0, Point2D p1);

    @objid ("fc9eac21-8fe4-4f7c-ab74-bb30f786ebab")
    RenderingHints getRenderingHints();

}

package java.awt.image;

import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2829-0000-000000000000")
public interface BufferedImageOp {
    @objid ("bc5e96dd-f246-45db-a9f7-bb4c0d4c23a2")
    BufferedImage createCompatibleDestImage(BufferedImage p0, ColorModel p1);

    @objid ("dfbc4f32-845b-4cf0-95e6-183fd5b37496")
    BufferedImage filter(BufferedImage p0, BufferedImage p1);

    @objid ("c5572a18-bf38-48db-9b67-93f1182fb651")
    Rectangle2D getBounds2D(BufferedImage p0);

    @objid ("80bc97b2-4e94-45d5-ae58-53bf8fb9be7c")
    Point2D getPoint2D(Point2D p0, Point2D p1);

    @objid ("031ad205-4367-4948-8abe-f2bc22e1fe16")
    RenderingHints getRenderingHints();

}

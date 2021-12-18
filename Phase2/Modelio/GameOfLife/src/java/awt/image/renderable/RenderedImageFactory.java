package java.awt.image.renderable;

import java.awt.RenderingHints;
import java.awt.image.RenderedImage;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2816-0000-000000000000")
public interface RenderedImageFactory {
    @objid ("ecf97161-7c3b-4a09-8dc2-3e44a870aa4e")
    RenderedImage create(ParameterBlock p0, RenderingHints p1);

}

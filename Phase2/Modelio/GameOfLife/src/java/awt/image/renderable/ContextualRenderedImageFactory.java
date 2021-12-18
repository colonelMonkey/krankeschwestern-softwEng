package java.awt.image.renderable;

import java.awt.geom.Rectangle2D;
import java.awt.image.RenderedImage;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2815-0000-000000000000")
public interface ContextualRenderedImageFactory extends RenderedImageFactory {
    @objid ("d525f801-a6b9-4101-ae47-54d7685d0cc0")
    RenderedImage create(RenderContext p0, ParameterBlock p1);

    @objid ("1f9a1084-aa57-4fc3-b84c-bce642dfb4fb")
    Rectangle2D getBounds2D(ParameterBlock p0);

    @objid ("04074752-7112-4969-87f0-ca4198ebfea0")
    Object getProperty(ParameterBlock p0, String p1);

    @objid ("d1fa6f4a-5cc6-42c7-8756-22d6369747c7")
    List<String> getPropertyNames();

    @objid ("6e691a93-6faf-4b2c-b422-3bfa34631ba6")
    boolean isDynamic();

    @objid ("4e25e9af-cdb7-4894-ae6e-32eb5284a300")
    RenderContext mapRenderContext(int p0, RenderContext p1, ParameterBlock p2, RenderableImage p3);

}

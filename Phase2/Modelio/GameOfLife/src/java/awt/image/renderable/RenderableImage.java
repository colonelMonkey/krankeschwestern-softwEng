package java.awt.image.renderable;

import java.awt.RenderingHints;
import java.awt.image.RenderedImage;
import java.util.List;
import java.util.Vector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2819-0000-000000000000")
public interface RenderableImage {
    @objid ("39c4a758-e477-4639-ac40-24f96fe712d1")
    RenderedImage createDefaultRendering();

    @objid ("9b79992f-62ea-44a1-8b69-ed4a0ee0d5ef")
    RenderedImage createRendering(RenderContext p0);

    @objid ("9dca1d17-9b9e-4039-9970-06caf165c3c2")
    RenderedImage createScaledRendering(int p0, int p1, RenderingHints p2);

    @objid ("2eaa9f54-17df-4848-8a55-f5b86d640f60")
    float getHeight();

    @objid ("6ab1cdf5-8a42-4da5-8676-4ba85bb3a545")
    float getMinX();

    @objid ("eacf1e7e-1672-47bb-9f00-a3b7710256e7")
    float getMinY();

    @objid ("97501c02-3bab-413d-8e9e-9fe424efa57a")
    Object getProperty(String p0);

    @objid ("1c49338e-3bca-45e4-96af-cef1f232e15b")
    List<String> getPropertyNames();

    @objid ("452def4f-41b3-4801-a96d-402ad3e04656")
    Vector getSources();

    @objid ("f4849234-8839-409d-8c55-d2442eed1bfa")
    float getWidth();

    @objid ("72265318-3c23-40ac-9889-b4d12066dcf8")
    boolean isDynamic();

}

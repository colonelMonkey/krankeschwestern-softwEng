package java.awt;

import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2983-0000-000000000000")
public interface CompositeContext {
    @objid ("aae471f7-505c-4458-b0e4-1263ae8a4f3c")
    void compose(Raster p0, Raster p1, WritableRaster p2);

    @objid ("12fcfeca-fef2-48a1-83f9-e838c9763691")
    void dispose();

}

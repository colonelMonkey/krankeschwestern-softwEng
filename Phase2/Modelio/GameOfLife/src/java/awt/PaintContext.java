package java.awt;

import java.awt.image.ColorModel;
import java.awt.image.Raster;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2986-0000-000000000000")
public interface PaintContext {
    @objid ("7f4e4368-aecf-4928-92a0-996d0429fb1d")
    void dispose();

    @objid ("e6933162-fff7-463b-93ba-3fd08fe68bd8")
    ColorModel getColorModel();

    @objid ("21b76e9c-aff4-4dcf-9f85-6a0dc37497cf")
    Raster getRaster(int p0, int p1, int p2, int p3);

}

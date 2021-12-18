package java.awt.image;

import java.awt.Image;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2822-0000-000000000000")
public interface ImageObserver {
    @objid ("aa9a447d-fff5-4618-a92e-a222f08f8cb7")
    boolean imageUpdate(Image p0, int p1, int p2, int p3, int p4, int p5);

}

package java.awt;

import java.awt.image.ColorModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-295f-0000-000000000000")
public interface Composite {
    @objid ("7e912509-4455-46d9-bbaf-79cae9490d64")
    CompositeContext createContext(ColorModel p0, ColorModel p1, RenderingHints p2);

}

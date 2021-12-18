package java.awt.dnd;

import java.awt.Insets;
import java.awt.Point;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27f8-0000-000000000000")
public interface Autoscroll {
    @objid ("97d6fc0a-8c1a-4fe1-99fd-3678b0e16889")
    void autoscroll(Point p0);

    @objid ("da82a9f6-fb81-4d3d-a019-c7a338f7b3bf")
    Insets getAutoscrollInsets();

}

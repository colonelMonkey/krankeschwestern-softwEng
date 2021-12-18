package javax.swing.border;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-1f11-0000-000000000000")
public interface Border {
    @objid ("4cec6c1b-878c-496a-aec0-c5a1b92c5dd5")
    Insets getBorderInsets(Component p0);

    @objid ("0b7b62eb-b293-4824-a0f6-ecf461d736a7")
    boolean isBorderOpaque();

    @objid ("96cc7d09-0cbc-4258-872b-7d77478f603e")
    void paintBorder(Component p0, Graphics p1, int p2, int p3, int p4, int p5);

}

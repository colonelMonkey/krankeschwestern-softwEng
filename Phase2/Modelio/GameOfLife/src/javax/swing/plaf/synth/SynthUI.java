package javax.swing.plaf.synth;

import java.awt.Graphics;
import javax.swing.JComponent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0001-4625-0000-000000000000")
public interface SynthUI extends SynthConstants {
    @objid ("dc663f62-8627-40a6-9e11-c45587ccb0b6")
    SynthContext getContext(JComponent p0);

    @objid ("844b2429-9d37-4c6b-b787-07396057cf65")
    void paintBorder(SynthContext p0, Graphics p1, int p2, int p3, int p4, int p5);

}

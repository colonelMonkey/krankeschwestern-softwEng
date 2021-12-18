package java.awt;

import java.awt.event.KeyEvent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-297d-0000-000000000000")
public interface KeyEventPostProcessor {
    @objid ("9e0db15e-98e0-45f4-9e39-d18fed92fc71")
    boolean postProcessKeyEvent(KeyEvent p0);

}

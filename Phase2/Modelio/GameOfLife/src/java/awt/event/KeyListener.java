package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2850-0000-000000000000")
public interface KeyListener extends EventListener {
    @objid ("b6496767-79fb-47b8-b369-aa0cc2b2a0e7")
    void keyPressed(KeyEvent p0);

    @objid ("0c14306a-3061-4449-91b5-0912dacf027a")
    void keyReleased(KeyEvent p0);

    @objid ("07ba3afd-e744-463e-9e17-8d367f7edd6b")
    void keyTyped(KeyEvent p0);

}

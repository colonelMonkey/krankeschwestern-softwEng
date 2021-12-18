package javax.swing.plaf.basic;

import java.awt.LayoutManager;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeListener;
import javax.swing.SwingConstants;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.InternalFrameUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-21d7-0000-000000000000")
public class BasicInternalFrameUI extends InternalFrameUI {
    @objid ("00d00398-0000-21dd-0000-000000000000")
    public class InternalFrameLayout implements LayoutManager {
    }

    @objid ("00d00398-0000-21de-0000-000000000000")
    public class InternalFramePropertyChangeListener implements PropertyChangeListener {
    }

    @objid ("91258f8d-6c57-4294-94d6-8a6099f3298a")
    protected class BasicInternalFrameListener implements InternalFrameListener {
    }

    @objid ("78c828c3-4f8a-4102-9b57-5829a38f3a5d")
    protected class BorderListener extends MouseInputAdapter implements SwingConstants {
    }

    @objid ("8f75bc35-7e1a-4a8f-bc84-74935814c04b")
    protected class ComponentHandler implements ComponentListener {
    }

    @objid ("a0a3cc09-b650-4c42-9206-0b29fdeec2ee")
    protected class GlassPaneDispatcher implements MouseInputListener {
    }

}

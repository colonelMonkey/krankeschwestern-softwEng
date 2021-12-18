package javax.swing.plaf.basic;

import java.awt.Window;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ToolBarUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-217e-0000-000000000000")
public class BasicToolBarUI extends ToolBarUI implements SwingConstants {
    @objid ("00d00398-0000-2180-0000-000000000000")
    public class DockingListener implements MouseInputListener {
    }

    @objid ("bb179db7-a626-4c4c-85ea-b40b863a18fd")
    protected class DragWindow extends Window {
    }

    @objid ("278b13e0-d8c1-4cf2-a28b-ea099e6f79cc")
    protected class FrameListener extends WindowAdapter {
    }

    @objid ("6d03ad33-8329-4ebd-a0c7-94159fb170e0")
    protected class PropertyListener implements PropertyChangeListener {
    }

    @objid ("7e5a1d33-e9aa-413d-b93e-6240727910a0")
    protected class ToolBarContListener implements ContainerListener {
    }

    @objid ("e3796804-c6e3-49ba-b3be-fad765289f03")
    protected class ToolBarFocusListener implements FocusListener {
    }

}

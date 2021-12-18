package javax.swing.plaf.basic;

import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeListener;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ScrollBarUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-21ce-0000-000000000000")
public class BasicScrollBarUI extends ScrollBarUI implements LayoutManager, SwingConstants {
    @objid ("00d00398-0000-21d3-0000-000000000000")
    public class PropertyChangeHandler implements PropertyChangeListener {
    }

    @objid ("97d6d6ac-de7c-4a96-8225-fa602d4dc260")
    protected class ArrowButtonListener extends MouseAdapter {
    }

    @objid ("027bd9a5-5b6f-4fd3-8d11-3d587f16ba40")
    protected class ModelListener implements ChangeListener {
    }

    @objid ("b530c839-9b12-4acd-9f4d-99bbbcb96ba9")
    protected class ScrollListener implements ActionListener {
    }

    @objid ("354a0631-5fd1-4425-9fa7-00a39eb63e14")
    protected class TrackListener extends MouseAdapter implements MouseMotionListener {
    }

}

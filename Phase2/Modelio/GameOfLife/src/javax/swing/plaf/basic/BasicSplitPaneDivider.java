package javax.swing.plaf.basic;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-214d-0000-000000000000")
public class BasicSplitPaneDivider extends Container implements PropertyChangeListener {
    @objid ("184ff651-a80a-45ce-8d39-de1c889d395c")
    protected class DividerLayout implements LayoutManager {
    }

    @objid ("edb52755-269d-4b0a-968e-a0af76720076")
    protected class DragController {
    }

    @objid ("09631baf-3eae-416f-9c3e-3b552b4de52b")
    protected class MouseHandler extends MouseAdapter implements MouseMotionListener {
    }

    @objid ("c33ce69b-9dfb-4aff-81e9-999ea428463b")
    protected class VerticalDragController extends DragController {
    }

}

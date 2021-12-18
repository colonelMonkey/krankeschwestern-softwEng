package javax.swing.plaf.basic;

import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.event.ChangeListener;
import javax.swing.event.MouseInputAdapter;
import javax.swing.plaf.SliderUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2242-0000-000000000000")
public class BasicSliderUI extends SliderUI {
    @objid ("00d00398-0000-2243-0000-000000000000")
    public class ActionScroller extends AbstractAction {
    }

    @objid ("00d00398-0000-2245-0000-000000000000")
    public class ChangeHandler implements ChangeListener {
    }

    @objid ("00d00398-0000-2246-0000-000000000000")
    public class ComponentHandler extends ComponentAdapter {
    }

    @objid ("00d00398-0000-2247-0000-000000000000")
    public class FocusHandler implements FocusListener {
    }

    @objid ("00d00398-0000-2249-0000-000000000000")
    public class PropertyChangeHandler implements PropertyChangeListener {
    }

    @objid ("00d00398-0000-224a-0000-000000000000")
    public class ScrollListener implements ActionListener {
    }

    @objid ("00d00398-0000-224c-0000-000000000000")
    public class TrackListener extends MouseInputAdapter {
    }

}

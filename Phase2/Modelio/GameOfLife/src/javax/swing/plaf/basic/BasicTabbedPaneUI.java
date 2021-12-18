package javax.swing.plaf.basic;

import java.awt.LayoutManager;
import java.awt.event.FocusAdapter;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.TabbedPaneUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-213e-0000-000000000000")
public class BasicTabbedPaneUI extends TabbedPaneUI implements SwingConstants {
    @objid ("00d00398-0000-2140-0000-000000000000")
    public class FocusHandler extends FocusAdapter {
    }

    @objid ("00d00398-0000-2142-0000-000000000000")
    public class MouseHandler extends MouseAdapter {
    }

    @objid ("00d00398-0000-2143-0000-000000000000")
    public class PropertyChangeHandler implements PropertyChangeListener {
    }

    @objid ("00d00398-0000-2148-0000-000000000000")
    public class TabSelectionHandler implements ChangeListener {
    }

    @objid ("00d00398-0000-2149-0000-000000000000")
    public class TabbedPaneLayout implements LayoutManager {
    }

}

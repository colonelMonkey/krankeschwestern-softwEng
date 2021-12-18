package javax.swing.plaf.basic;

import java.awt.LayoutManager2;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.SplitPaneUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2132-0000-000000000000")
public class BasicSplitPaneUI extends SplitPaneUI {
    @objid ("00d00398-0000-2134-0000-000000000000")
    public class BasicHorizontalLayoutManager implements LayoutManager2 {
    }

    @objid ("00d00398-0000-2135-0000-000000000000")
    public class BasicVerticalLayoutManager extends BasicHorizontalLayoutManager {
    }

    @objid ("00d00398-0000-2136-0000-000000000000")
    public class FocusHandler extends FocusAdapter {
    }

    @objid ("00d00398-0000-2138-0000-000000000000")
    public class KeyboardDownRightHandler implements ActionListener {
    }

    @objid ("00d00398-0000-2139-0000-000000000000")
    public class KeyboardEndHandler implements ActionListener {
    }

    @objid ("00d00398-0000-213a-0000-000000000000")
    public class KeyboardHomeHandler implements ActionListener {
    }

    @objid ("00d00398-0000-213b-0000-000000000000")
    public class KeyboardResizeToggleHandler implements ActionListener {
    }

    @objid ("00d00398-0000-213c-0000-000000000000")
    public class KeyboardUpLeftHandler implements ActionListener {
    }

    @objid ("00d00398-0000-213d-0000-000000000000")
    public class PropertyHandler implements PropertyChangeListener {
    }

}

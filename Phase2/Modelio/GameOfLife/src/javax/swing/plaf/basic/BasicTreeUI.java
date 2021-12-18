package javax.swing.plaf.basic;

import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.event.CellEditorListener;
import javax.swing.event.MouseInputListener;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.TreeUI;
import javax.swing.tree.AbstractLayoutCache.NodeDimensions;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2218-0000-000000000000")
public class BasicTreeUI extends TreeUI {
    @objid ("00d00398-0000-221a-0000-000000000000")
    public class CellEditorHandler implements CellEditorListener {
    }

    @objid ("00d00398-0000-221b-0000-000000000000")
    public class ComponentHandler extends ComponentAdapter implements ActionListener {
    }

    @objid ("00d00398-0000-221d-0000-000000000000")
    public class FocusHandler implements FocusListener {
    }

    @objid ("00d00398-0000-221f-0000-000000000000")
    public class KeyHandler extends KeyAdapter {
    }

    @objid ("00d00398-0000-2220-0000-000000000000")
    public class MouseHandler extends MouseAdapter implements MouseMotionListener {
    }

    @objid ("00d00398-0000-2221-0000-000000000000")
    public class MouseInputHandler implements MouseInputListener {
    }

    @objid ("00d00398-0000-2222-0000-000000000000")
    public class NodeDimensionsHandler extends NodeDimensions {
    }

    @objid ("00d00398-0000-2223-0000-000000000000")
    public class PropertyChangeHandler implements PropertyChangeListener {
    }

    @objid ("00d00398-0000-2224-0000-000000000000")
    public class SelectionModelPropertyChangeHandler implements PropertyChangeListener {
    }

    @objid ("00d00398-0000-2225-0000-000000000000")
    public class TreeCancelEditingAction extends AbstractAction {
    }

    @objid ("00d00398-0000-2228-0000-000000000000")
    public class TreeExpansionHandler implements TreeExpansionListener {
    }

    @objid ("00d00398-0000-2229-0000-000000000000")
    public class TreeHomeAction extends AbstractAction {
    }

    @objid ("00d00398-0000-222a-0000-000000000000")
    public class TreeIncrementAction extends AbstractAction {
    }

    @objid ("00d00398-0000-222b-0000-000000000000")
    public class TreeModelHandler implements TreeModelListener {
    }

    @objid ("00d00398-0000-222c-0000-000000000000")
    public class TreePageAction extends AbstractAction {
    }

    @objid ("00d00398-0000-222d-0000-000000000000")
    public class TreeSelectionHandler implements TreeSelectionListener {
    }

    @objid ("00d00398-0000-222e-0000-000000000000")
    public class TreeToggleAction extends AbstractAction {
    }

    @objid ("00d00398-0000-2230-0000-000000000000")
    public class TreeTraverseAction extends AbstractAction {
    }

}

package javax.swing.plaf.metal;

import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.plaf.basic.BasicFileChooserUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-225c-0000-000000000000")
public class MetalFileChooserUI extends BasicFileChooserUI {
    @objid ("00d00398-0000-2264-0000-000000000000")
    public class FilterComboBoxRenderer extends DefaultListCellRenderer {
    }

    @objid ("6d4b887f-b4f8-4fa0-af21-2bb4be5fc4ac")
    protected class DirectoryComboBoxAction extends AbstractAction {
    }

    @objid ("e623c48f-fd4f-47bf-bf52-9404ebe1338d")
    protected class DirectoryComboBoxModel extends AbstractListModel implements ComboBoxModel {
    }

    @objid ("77387bd8-5119-45f0-9961-8236f13915de")
    protected class FileRenderer extends DefaultListCellRenderer {
    }

    @objid ("c1580248-0295-4762-b275-9017efd0b576")
    protected class FilterComboBoxModel extends AbstractListModel implements ComboBoxModel, PropertyChangeListener {
    }

    @objid ("e7d84c5c-c6fa-4c01-b25d-261a43030bee")
    protected class SingleClickListener extends MouseAdapter {
    }

}

package javax.swing.plaf.basic;

import java.awt.event.MouseAdapter;
import javax.swing.AbstractAction;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.FileChooserUI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2153-0000-000000000000")
public class BasicFileChooserUI extends FileChooserUI {
    @objid ("125e3660-080e-4b70-9dd9-5cf4cf58506e")
    protected class AcceptAllFileFilter extends FileFilter {
    }

    @objid ("d58bc068-e22f-4a0a-8ab4-6b67f83080e6")
    protected class ApproveSelectionAction extends AbstractAction {
    }

    @objid ("cf00b59c-8c5b-47e1-b8cc-1ca79127962f")
    protected class BasicFileView extends FileView {
    }

    @objid ("74b3bc34-c686-4655-85ce-c993e8582162")
    protected class CancelSelectionAction extends AbstractAction {
    }

    @objid ("ccdc4dc1-e4dd-4e6e-9575-5b13bbd79111")
    protected class ChangeToParentDirectoryAction extends AbstractAction {
    }

    @objid ("11fde6fe-3fd1-45b4-9268-d6a77059aaea")
    protected class DoubleClickListener extends MouseAdapter {
    }

    @objid ("149ec312-d29c-4880-b986-46bf6286844b")
    protected class GoHomeAction extends AbstractAction {
    }

    @objid ("92c0d635-9129-49b9-82b9-f62cef853210")
    protected class NewFolderAction extends AbstractAction {
    }

    @objid ("90e74de4-c936-40f8-96ff-6db745502d03")
    protected class SelectionListener implements ListSelectionListener {
    }

    @objid ("5668222f-e15e-4ca0-9414-93a75bdb71f5")
    protected class UpdateAction extends AbstractAction {
    }

}

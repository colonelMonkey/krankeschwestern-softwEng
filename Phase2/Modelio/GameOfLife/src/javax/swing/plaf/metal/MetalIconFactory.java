package javax.swing.plaf.metal;

import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2272-0000-000000000000")
public class MetalIconFactory implements Serializable {
    @objid ("00d00398-0000-227a-0000-000000000000")
    public static class FileIcon16 implements Icon, Serializable {
    }

    @objid ("00d00398-0000-227b-0000-000000000000")
    public static class FolderIcon16 implements Icon, Serializable {
    }

    @objid ("00d00398-0000-2288-0000-000000000000")
    public static class PaletteCloseIcon implements Icon, UIResource, Serializable {
    }

    @objid ("00d00398-0000-228c-0000-000000000000")
    public static class TreeControlIcon implements Icon, Serializable {
    }

    @objid ("00d00398-0000-228e-0000-000000000000")
    public static class TreeFolderIcon extends FolderIcon16 {
    }

    @objid ("00d00398-0000-2290-0000-000000000000")
    public static class TreeLeafIcon extends FileIcon16 {
    }

}

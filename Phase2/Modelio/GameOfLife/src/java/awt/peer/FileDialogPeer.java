package java.awt.peer;

import java.io.FilenameFilter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e3-0000-000000000000")
public interface FileDialogPeer extends DialogPeer {
    @objid ("36dd1a0a-737f-4d7a-8aa9-16ba1bfece17")
    void setDirectory(String p0);

    @objid ("c38acf09-0668-4107-898e-7e77ed996e2f")
    void setFile(String p0);

    @objid ("3c155c8e-e495-48f9-865a-beeeb487c8c3")
    void setFilenameFilter(FilenameFilter p0);

}

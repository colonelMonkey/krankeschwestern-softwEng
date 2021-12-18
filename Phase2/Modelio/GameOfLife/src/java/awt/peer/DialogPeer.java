package java.awt.peer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e6-0000-000000000000")
public interface DialogPeer extends WindowPeer {
    @objid ("f176fa69-d78c-4818-aeaa-756d4ce891f8")
    void blockWindows(List p0);

    @objid ("a568769e-fc37-418b-9c6b-063517d8b69c")
    void setResizable(boolean p0);

    @objid ("86a40ab9-6727-4115-b99a-829503236343")
    void setTitle(String p0);

}

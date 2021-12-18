package java.awt.peer;

import java.awt.Dimension;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28dd-0000-000000000000")
public interface TextFieldPeer extends TextComponentPeer {
    @objid ("77d8e556-a3ca-49b6-b2c5-a04a7244eeee")
    Dimension getMinimumSize(int p0);

    @objid ("b2410b21-2b97-4efb-9fad-cb7a8d4b8668")
    Dimension getPreferredSize(int p0);

    @objid ("1713b6e3-d2ff-4032-ae3f-3ca52fdb51ea")
    void setEchoChar(char p0);

}

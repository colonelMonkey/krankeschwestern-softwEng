package java.awt.peer;

import java.awt.Dimension;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e5-0000-000000000000")
public interface TextAreaPeer extends TextComponentPeer {
    @objid ("b4841c29-6a7d-436a-85bd-fad3f384c5fe")
    Dimension getMinimumSize(int p0, int p1);

    @objid ("dd8de502-111e-4a81-8470-24186295764e")
    Dimension getPreferredSize(int p0, int p1);

    @objid ("d517c972-f462-4a09-bdbd-87f5175a7ad1")
    void insert(String p0, int p1);

    @objid ("496c29fa-2135-4fe8-9b64-18302f6c70c4")
    void replaceRange(String p0, int p1, int p2);

}

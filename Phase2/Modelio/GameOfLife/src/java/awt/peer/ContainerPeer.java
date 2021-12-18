package java.awt.peer;

import java.awt.Insets;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e1-0000-000000000000")
public interface ContainerPeer extends ComponentPeer {
    @objid ("4bcfaf18-a684-438a-96c7-027978c6ad12")
    void beginLayout();

    @objid ("8e892f4c-9dc4-4768-82c6-968b6dc158e9")
    void beginValidate();

    @objid ("f0b326ee-ec49-46c1-b76a-72c90d2d879f")
    void endLayout();

    @objid ("57bc5d6c-f26c-4a46-92df-ecdf3b29d33f")
    void endValidate();

    @objid ("cb205d91-492e-4cbb-b727-d7125bf2369d")
    Insets getInsets();

}

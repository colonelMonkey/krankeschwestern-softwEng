package java.awt.peer;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1a80-0000-000000000000")
public interface DesktopPeer {
    @objid ("44d0c052-4514-48e3-9f75-c68d038974ad")
    void browse(URI p0) throws IOException;

    @objid ("91d93c59-208c-4eb2-b2d2-2dce8519e9d9")
    void edit(File p0) throws IOException;

    @objid ("f5858e31-8a1b-4267-8dde-4e7873d230dc")
    boolean isSupported(Action p0);

    @objid ("3b99b594-f33f-4217-ab6d-fcb3144c10fa")
    void mail(URI p0) throws IOException;

    @objid ("7504369e-6a86-4921-bd86-5503853790bf")
    void open(File p0) throws IOException;

    @objid ("e0d57674-17f8-4c24-80a5-22858861849e")
    void print(File p0) throws IOException;

}

package java.applet;

import java.net.URL;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ed5-0000-000000000000")
public interface AppletStub {
    @objid ("582ffb2f-2230-4834-a5a1-70f1c0d39e22")
    void appletResize(int p0, int p1);

    @objid ("4e72cd6e-455c-443d-81ce-aa373bd8474f")
    AppletContext getAppletContext();

    @objid ("73ee138e-4ff2-435a-b0ef-2796941a258f")
    URL getCodeBase();

    @objid ("e14b376e-5259-43f1-8c28-c39b3cbbdd79")
    URL getDocumentBase();

    @objid ("e3fcd985-e85c-4d70-b248-fe9f647d536f")
    String getParameter(String p0);

    @objid ("749185f1-9c7d-435d-8403-c1d58f7ce622")
    boolean isActive();

}

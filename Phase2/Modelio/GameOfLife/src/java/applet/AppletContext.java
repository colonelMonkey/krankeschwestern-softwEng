package java.applet;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ed6-0000-000000000000")
public interface AppletContext {
    @objid ("cb961334-d597-4f30-9442-eff2ffa92300")
    Applet getApplet(String p0);

    @objid ("2d1453f9-c9bc-4f30-9db1-80646cbbd416")
    Enumeration getApplets();

    @objid ("23b2fdb1-87f7-41cd-b3da-4858bcf857e4")
    AudioClip getAudioClip(URL p0);

    @objid ("638cc97c-a5a3-4a65-94b0-332dcdb6912c")
    Image getImage(URL p0);

    @objid ("fd6a61c9-1a99-4a4e-88d1-02fe88db5b06")
    InputStream getStream(String p0);

    @objid ("4db85255-7984-4f79-9d18-9ecce13d3354")
    Iterator getStreamKeys();

    @objid ("7cef7f22-de2f-493b-a283-c8ec362a6f9c")
    void setStream(String p0, InputStream p1) throws IOException;

    @objid ("543af8ca-8598-46c2-af5b-cd7324a8e4da")
    void showDocument(URL p0);

    @objid ("33ed71ef-e576-40dc-8ff4-bb42bc568fc7")
    void showDocument(URL p0, String p1);

    @objid ("89081030-af72-4f5e-a0bd-c89f8be397ed")
    void showStatus(String p0);

}

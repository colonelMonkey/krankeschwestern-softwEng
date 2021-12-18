package java.rmi.server;

import java.net.MalformedURLException;
import java.net.URL;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d93-0000-000000000000")
public interface LoaderHandler {
    @objid ("06b12e83-3891-4c00-a527-a305e1893c5c")
    Object getSecurityContext(ClassLoader p0);

    @objid ("3c1b7d3f-6d75-4233-a8a8-37086f84a4a7")
    Class loadClass(String p0) throws ClassNotFoundException, MalformedURLException;

    @objid ("f61b0b67-e101-4f72-8b66-bd67966d3187")
    Class loadClass(URL p0, String p1) throws ClassNotFoundException, MalformedURLException;

}

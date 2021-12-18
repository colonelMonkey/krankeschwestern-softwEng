package java.net;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1d98-0000-000000000000")
public interface CookiePolicy {
    @objid ("154363c9-41f1-4766-b318-beb8281d3695")
    boolean shouldAccept(URI p0, HttpCookie p1);

}

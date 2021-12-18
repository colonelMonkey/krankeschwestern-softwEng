package java.net;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1da0-0000-000000000000")
public interface CookieStore {
    @objid ("6e70a56b-7fcd-44df-81b6-65c1cff4e366")
    void add(URI p0, HttpCookie p1);

    @objid ("76a350e9-cc22-470b-bb7d-c676c072029f")
    List get(URI p0);

    @objid ("51569547-e7f1-491f-8d5f-ca8b83e706e3")
    List getCookies();

    @objid ("2f37186c-46a9-4615-9056-691be011ec20")
    List getURIs();

    @objid ("98e43320-861d-45ac-acf8-8caf9ad2a1c4")
    boolean remove(URI p0, HttpCookie p1);

    @objid ("bbf565bd-6c31-4ee8-b8c6-a1e154d31a45")
    boolean removeAll();

}

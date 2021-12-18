package java.text;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2dd2-0000-000000000000")
public interface AttributedCharacterIterator extends CharacterIterator {
    @objid ("178a46c1-55fa-4edf-a77a-437633b2c175")
    Set getAllAttributeKeys();

    @objid ("630e55f0-5226-45ec-a073-f99683da39e5")
    Object getAttribute(Attribute p0);

    @objid ("dc4d306f-4d9c-490d-a800-75c95cf0dd09")
    Map getAttributes();

    @objid ("5cfb64c8-60b0-411a-a2e3-f7cdda05ca12")
    int getRunLimit(Set p0);

    @objid ("fb9addde-ac81-4a79-a8aa-0358647edff4")
    int getRunLimit(Attribute p0);

    @objid ("51bc57cf-e60b-4366-b5f0-9c4a20966df7")
    int getRunLimit();

    @objid ("f31ac96a-e4ba-44db-b07d-62ae2603f046")
    int getRunStart();

    @objid ("a650897f-e036-460b-b64d-74eda32bb9a3")
    int getRunStart(Set p0);

    @objid ("fbcda315-bee1-4736-82eb-3c1532db8826")
    int getRunStart(Attribute p0);

    @objid ("00d00398-0000-2dd3-0000-000000000000")
    static class Attribute implements Serializable {
    }

}

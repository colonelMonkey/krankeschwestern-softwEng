package java.security.acl;

import java.security.Principal;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2790-0000-000000000000")
public interface Owner {
    @objid ("edc2b721-ea83-4e61-b0b7-4cf1f036cf37")
    boolean addOwner(Principal p0, Principal p1) throws NotOwnerException;

    @objid ("50cfc254-b3e9-45a1-a85a-6285f11ed79b")
    boolean deleteOwner(Principal p0, Principal p1) throws LastOwnerException, NotOwnerException;

    @objid ("743ed156-dab5-4d62-9edc-2a395dec8cca")
    boolean isOwner(Principal p0);

}

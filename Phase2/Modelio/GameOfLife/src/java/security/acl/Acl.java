package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-278e-0000-000000000000")
public interface Acl extends Owner {
    @objid ("aca56038-09a6-4a5e-b3e1-d3f45f22d574")
    boolean addEntry(Principal p0, AclEntry p1) throws NotOwnerException;

    @objid ("3b7a110c-8ff7-4337-8ed8-2ff125447bc4")
    boolean checkPermission(Principal p0, Permission p1);

    @objid ("cdcdd6b9-9955-479c-a9b6-8a8bd35dcbe0")
    Enumeration entries();

    @objid ("1010f76d-6e6c-4d21-9e8c-6efb0c35e155")
    String getName();

    @objid ("75fe8591-462d-4d7d-b4df-9db4f363778c")
    Enumeration getPermissions(Principal p0);

    @objid ("a49d2f1d-1cd4-4238-b613-4925989bab28")
    boolean removeEntry(Principal p0, AclEntry p1) throws NotOwnerException;

    @objid ("1a0834ba-0677-4e55-a6cc-636302af5a5d")
    void setName(Principal p0, String p1) throws NotOwnerException;

    @objid ("05ed501a-3a29-4944-849b-8a272d58dba9")
    String toString();

}

package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2791-0000-000000000000")
public interface Group extends Principal {
    @objid ("c769120a-73f4-430f-849d-6639798dd65a")
    boolean addMember(Principal p0);

    @objid ("48d6db42-5cbe-4f35-959c-51eb35ded22c")
    boolean isMember(Principal p0);

    @objid ("20d0fd4c-7ee7-4568-8590-4086a32b7fa6")
    Enumeration members();

    @objid ("a4d538c1-d976-4c3b-8c96-1ed3128a1ce9")
    boolean removeMember(Principal p0);

}

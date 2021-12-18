package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2792-0000-000000000000")
public interface AclEntry extends Cloneable {
    @objid ("62c2b6c5-d403-4a16-b64f-7d944640266a")
    boolean addPermission(Permission p0);

    @objid ("7fd4c905-8080-4123-a560-19614dbf91cc")
    boolean checkPermission(Permission p0);

    @objid ("623c29c6-9d48-48fc-86c7-d35d7ca26ba8")
    Object clone();

    @objid ("711633cd-6fa3-491e-ba3b-5c4852c249e0")
    Principal getPrincipal();

    @objid ("62788645-7483-4006-b31b-ee82e6cdcd81")
    boolean isNegative();

    @objid ("054a8205-c7d3-40fd-b4dd-8ea86827cd2c")
    Enumeration permissions();

    @objid ("8d82bc19-6ec7-408d-a971-3548736b3808")
    boolean removePermission(Permission p0);

    @objid ("6e907d80-d2d8-4f26-8584-8e3f988299bf")
    void setNegativePermissions();

    @objid ("81a14785-ff4d-4a99-9985-f3af0738958b")
    boolean setPrincipal(Principal p0);

    @objid ("98787a88-4d8a-4d4e-abf2-872e92829321")
    String toString();

}

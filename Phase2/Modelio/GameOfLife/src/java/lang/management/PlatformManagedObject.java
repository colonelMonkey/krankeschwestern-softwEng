package java.lang.management;

import javax.management.ObjectName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-a0b9-0000-000000000000")
public interface PlatformManagedObject {
    @objid ("83ebe641-637e-47aa-bf46-02023a800b0c")
    ObjectName getObjectName();

}

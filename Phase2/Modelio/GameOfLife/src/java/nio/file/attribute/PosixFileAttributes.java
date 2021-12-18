package java.nio.file.attribute;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-0f86-0000-000000000000")
public interface PosixFileAttributes extends BasicFileAttributes {
    @objid ("735b2e5a-e8dc-4bb8-8f7f-a899e5e995fe")
    GroupPrincipal group();

    @objid ("1c3fbd6f-f819-4f51-a4fd-fd21174fec60")
    UserPrincipal owner();

    @objid ("e3c4e805-21ff-4783-9a5e-2b616fea8ac7")
    Set permissions();

}

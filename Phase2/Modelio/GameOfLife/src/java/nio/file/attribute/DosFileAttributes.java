package java.nio.file.attribute;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-45fc-0000-000000000000")
public interface DosFileAttributes extends BasicFileAttributes {
    @objid ("91b972f6-50b1-4d74-88a3-53e697e03434")
    boolean isArchive();

    @objid ("859b1de6-e53d-4c9c-be05-bc2be597be33")
    boolean isHidden();

    @objid ("dcd06ec2-db32-49be-ad59-d318017ed669")
    boolean isReadOnly();

    @objid ("4d06cc5d-cdee-46fa-b94b-62929a6fbffe")
    boolean isSystem();

}

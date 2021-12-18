package java.nio.file.attribute;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-0e88-0000-000000000000")
public interface BasicFileAttributes {
    @objid ("ebfc0865-f29d-4267-894e-887412eeafa8")
    FileTime creationTime();

    @objid ("008e6ade-bbe2-418f-b9e8-90dc7461ec6d")
    Object fileKey();

    @objid ("26212544-e26a-4a8b-8308-dde198fd9ce7")
    boolean isDirectory();

    @objid ("70fd4fa6-b46d-4475-a50a-de0d40e3673a")
    boolean isOther();

    @objid ("831c3188-73e2-4b23-854a-b97eb62ca7fe")
    boolean isRegularFile();

    @objid ("013094e6-fe43-4352-8836-8aec031cd452")
    boolean isSymbolicLink();

    @objid ("bf674904-2c18-4dd3-993d-1e79f146c542")
    FileTime lastAccessTime();

    @objid ("7267b1a9-c643-4418-9969-ddad5c737b6a")
    FileTime lastModifiedTime();

    @objid ("d244177b-024e-4d34-ad1f-49ff9933f63a")
    long size();

}

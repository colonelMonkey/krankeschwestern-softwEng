package java.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-417c-0000-000000000000")
public interface UserDefinedFileAttributeView extends FileAttributeView {
    @objid ("a90da6cc-f795-464a-a5e5-d14d235006ac")
    void delete(String p0) throws IOException;

    @objid ("328e09a1-3ee6-4aa9-8349-fa14b95843eb")
    List list() throws IOException;

    @objid ("5a07b1f7-c097-4bab-adb5-b4d0096090c5")
    String name();

    @objid ("05082b14-3765-4b51-a106-f9f606b9d09d")
    int read(String p0, ByteBuffer p1) throws IOException;

    @objid ("01225899-6286-4cf5-8acf-84770ddfe81a")
    int size(String p0) throws IOException;

    @objid ("06dbcae1-df38-40a9-a065-e276546cd2cc")
    int write(String p0, ByteBuffer p1) throws IOException;

}

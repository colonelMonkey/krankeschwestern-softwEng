package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29cc-0000-000000000000")
public interface GatheringByteChannel extends WritableByteChannel {
    @objid ("2c07d360-1ae7-4e35-92ee-598e7082ef6b")
    long write(List<ByteBuffer> p0, int p1, int p2) throws IOException;

    @objid ("cae94605-0f3b-4693-a7e5-b4b50e6e36a6")
    long write(List<ByteBuffer> p0) throws IOException;

}

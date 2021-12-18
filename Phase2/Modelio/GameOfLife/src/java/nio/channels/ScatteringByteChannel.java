package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29cf-0000-000000000000")
public interface ScatteringByteChannel extends ReadableByteChannel {
    @objid ("0f935d4d-9664-4ce1-afe4-18c895f37cf0")
    long read(List<ByteBuffer> p0, int p1, int p2) throws IOException;

    @objid ("7c608cd3-2836-4908-be1a-341d1c3f4d8a")
    long read(List<ByteBuffer> p0) throws IOException;

}

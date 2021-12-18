package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29e0-0000-000000000000")
public interface ReadableByteChannel extends Channel {
    @objid ("58834f25-e518-49e0-a967-3b64bb9d5e25")
    int read(ByteBuffer p0) throws IOException;

}

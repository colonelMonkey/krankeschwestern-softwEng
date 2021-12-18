package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29cb-0000-000000000000")
public interface WritableByteChannel extends Channel {
    @objid ("c0c1dfe4-4ee0-4269-b1d9-43ea9e812970")
    int write(ByteBuffer p0) throws IOException;

}

package java.nio.channels;

import java.nio.ByteBuffer;
import java.util.concurrent.Future;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-1682-0000-000000000000")
public interface AsynchronousByteChannel extends AsynchronousChannel {
    @objid ("cd561a23-15fc-4240-82e3-65ee8a721fe9")
    Future read(ByteBuffer p0);

    @objid ("70e553fc-9caa-447c-abe5-ebb84e6aee55")
    void read(ByteBuffer p0, Object p1, CompletionHandler p2);

    @objid ("3e53f8cd-8a89-4854-8ee5-3c8e57138970")
    Future write(ByteBuffer p0);

    @objid ("9652f05e-b1e9-4dd3-a1ba-b9a64599edec")
    void write(ByteBuffer p0, Object p1, CompletionHandler p2);

}

package java.nio.channels;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-16ff-0000-000000000000")
public interface AsynchronousChannel extends Channel {
    @objid ("2625c1b0-3768-4d95-8956-3239f8052aaf")
    void close() throws IOException;

}

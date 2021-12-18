package java.nio.channels;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29d6-0000-000000000000")
public interface InterruptibleChannel extends Channel {
    @objid ("a3a958a8-af49-4b75-8f6c-923f3c182ab5")
    void close() throws IOException;

}

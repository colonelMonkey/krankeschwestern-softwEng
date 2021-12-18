package java.lang;

import java.io.IOException;
import java.nio.CharBuffer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b87-0000-000000000000")
public interface Readable {
    @objid ("9b7590c9-47e2-451a-a2cd-bf32df55f343")
    int read(CharBuffer p0) throws IOException;

}

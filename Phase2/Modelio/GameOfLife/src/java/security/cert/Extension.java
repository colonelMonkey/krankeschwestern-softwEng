package java.security.cert;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0000-7084-0000-000000000000")
public interface Extension {
    @objid ("df0c13e2-7fe7-4f6f-984b-de9c83d6e14a")
    void encode(OutputStream p0) throws IOException;

    @objid ("8e9fb019-1748-4d54-bcd0-b01765f1bb69")
    String getId();

    @objid ("b3ec6c74-73b3-4238-a78a-643b813e7d6b")
    List<Byte> getValue();

    @objid ("4e6a6617-5cd9-4852-8f3b-69dcea60929e")
    boolean isCritical();

}

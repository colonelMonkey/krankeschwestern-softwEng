package java.lang.instrument;

import java.security.ProtectionDomain;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b0c-0000-000000000000")
public interface ClassFileTransformer {
    @objid ("36357c2f-e253-4ab1-abcd-b5c0c930ab50")
    List<Byte> transform(ClassLoader p0, String p1, Class p2, ProtectionDomain p3, List<Byte> p4) throws IllegalClassFormatException;

}

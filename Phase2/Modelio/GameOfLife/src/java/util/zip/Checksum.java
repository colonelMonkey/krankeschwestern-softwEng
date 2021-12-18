package java.util.zip;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b9e-0000-000000000000")
public interface Checksum {
    @objid ("93f8802c-240a-4151-ab10-b404d8d8f3dc")
    long getValue();

    @objid ("517f2716-da91-4fa7-abe1-bdde3f9fb32b")
    void reset();

    @objid ("203bc2d6-e336-4fad-aa9c-81ccf72418c9")
    void update(int p0);

    @objid ("b1fb669f-6b65-414c-b26e-6cb7313ca84c")
    void update(List<Byte> p0, int p1, int p2);

}

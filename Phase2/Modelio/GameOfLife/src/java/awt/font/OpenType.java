package java.awt.font;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2885-0000-000000000000")
public interface OpenType {
    @objid ("58b1ba72-13d2-4bf5-89e2-50f5cd0346eb")
    List<Byte> getFontTable(String p0, int p1, int p2);

    @objid ("55fb6dc5-cc6d-47f7-a6ab-55411005177a")
    List<Byte> getFontTable(int p0, int p1, int p2);

    @objid ("54baa61a-cde7-4628-9025-51ed0e879cc5")
    List<Byte> getFontTable(String p0);

    @objid ("3b9512af-6817-4529-9884-c673b60be194")
    List<Byte> getFontTable(int p0);

    @objid ("184ea250-3284-4eaa-b53d-1c084c473d74")
    int getFontTableSize(String p0);

    @objid ("21b963ae-829e-4e94-a459-67b950705945")
    int getFontTableSize(int p0);

    @objid ("b4449b85-a3c0-4cb3-a509-2e4cec7b08f7")
    int getVersion();

}

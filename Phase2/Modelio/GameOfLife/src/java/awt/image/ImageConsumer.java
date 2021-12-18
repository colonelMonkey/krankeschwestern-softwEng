package java.awt.image;

import java.util.Hashtable;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2831-0000-000000000000")
public interface ImageConsumer {
    @objid ("f4c9c145-0585-4f58-9086-b288ab35f29c")
    void imageComplete(int p0);

    @objid ("d5138c71-8bc9-48fb-b873-e8351b3eade1")
    void setColorModel(ColorModel p0);

    @objid ("414bd6a2-58c6-421e-bc50-12575f891c8b")
    void setDimensions(int p0, int p1);

    @objid ("fa6a70e7-c010-4ba7-bce3-e81066341fe7")
    void setHints(int p0);

    @objid ("172c89ee-7af1-4b57-931b-5541b9ff3839")
    void setPixels(int p0, int p1, int p2, int p3, ColorModel p4, List<Byte> p5, int p6, int p7);

    @objid ("0fbdcd7b-8308-4236-9f46-6fea7e8c2e9b")
    void setPixels(int p0, int p1, int p2, int p3, ColorModel p4, List<Integer> p5, int p6, int p7);

    @objid ("9d4c043f-856c-4498-a6f2-2bd30f66d1d4")
    void setProperties(Hashtable p0);

}

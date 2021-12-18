package java.awt.font;

import java.awt.Font;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2886-0000-000000000000")
public interface MultipleMaster {
    @objid ("ab7d517b-ead5-4e70-9f1c-5385ce71b849")
    Font deriveMMFont(List<Float> p0, float p1, float p2, float p3, float p4);

    @objid ("feabc4c9-93d3-4c96-afbf-ad1e0a0ab5fd")
    Font deriveMMFont(List<Float> p0);

    @objid ("ad6f4ba1-25b5-4914-8081-f8618c83a674")
    List<Float> getDesignAxisDefaults();

    @objid ("e462ecab-ec8a-4a55-b737-1976987e2fa6")
    List<String> getDesignAxisNames();

    @objid ("8a6a075b-2337-46dc-8f27-eb913101c3ab")
    List<Float> getDesignAxisRanges();

    @objid ("0f49a6fb-3852-4dee-bcbc-1d250eccf430")
    int getNumDesignAxes();

}

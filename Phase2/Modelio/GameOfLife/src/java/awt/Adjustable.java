package java.awt;

import java.awt.event.AdjustmentListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2957-0000-000000000000")
public interface Adjustable {
    @objid ("d0841062-48b2-4256-9273-02a09da8ece4")
    void addAdjustmentListener(AdjustmentListener p0);

    @objid ("f3a7a303-41f8-424c-a4de-5ca1c2e4f9dd")
    int getBlockIncrement();

    @objid ("a9120e9a-b15c-4630-8835-453a15e7be8b")
    int getMaximum();

    @objid ("ac7f4df4-1896-4756-a29f-02db95e5da3e")
    int getMinimum();

    @objid ("d3ed3ad2-9149-49cc-bebb-b57a9709b52f")
    int getOrientation();

    @objid ("093cd810-180e-4e42-b003-5b585c2cc3d9")
    int getUnitIncrement();

    @objid ("dcf94c18-7a80-439a-8d8a-bcca2df0a436")
    int getValue();

    @objid ("0e940e99-a2b7-4979-b19e-a8d1d5946dab")
    int getVisibleAmount();

    @objid ("8e542dac-abe9-456d-8901-b6a39c51045d")
    void removeAdjustmentListener(AdjustmentListener p0);

    @objid ("9c6aa21a-2ea2-4edb-a16a-c3d55610274e")
    void setBlockIncrement(int p0);

    @objid ("0f3ac5e9-14e7-44ba-b888-e67f7ca4f4a3")
    void setMaximum(int p0);

    @objid ("461afe61-cb24-4e4b-b1ae-0489bd1d82ca")
    void setMinimum(int p0);

    @objid ("5a7582ec-115b-43fa-9afb-a1eaf4ac78a2")
    void setUnitIncrement(int p0);

    @objid ("db440b79-6540-49e3-a8b1-a06f5f23145e")
    void setValue(int p0);

    @objid ("5354a805-c349-4e6d-94d8-f358023c9221")
    void setVisibleAmount(int p0);

}

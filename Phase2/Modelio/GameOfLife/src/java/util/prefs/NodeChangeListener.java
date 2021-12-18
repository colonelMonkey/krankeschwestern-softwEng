package java.util.prefs;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c3a-0000-000000000000")
public interface NodeChangeListener extends EventListener {
    @objid ("02a8d74a-ee4f-43b5-921d-f2a3398574ff")
    void childAdded(NodeChangeEvent p0);

    @objid ("8a63e5f6-7fe1-40d1-933b-a576bdd6e9fd")
    void childRemoved(NodeChangeEvent p0);

}

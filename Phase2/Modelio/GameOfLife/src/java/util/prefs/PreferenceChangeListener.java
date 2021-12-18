package java.util.prefs;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c3b-0000-000000000000")
public interface PreferenceChangeListener extends EventListener {
    @objid ("178ff387-89fb-4071-a841-61482a5d6e40")
    void preferenceChange(PreferenceChangeEvent p0);

}

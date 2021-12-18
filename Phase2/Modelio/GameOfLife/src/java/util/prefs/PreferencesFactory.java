package java.util.prefs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c37-0000-000000000000")
public interface PreferencesFactory {
    @objid ("cb2bac23-06e6-4251-a19c-366468862d16")
    Preferences systemRoot();

    @objid ("8e33b876-fa53-4cd7-929e-c36106a7a29c")
    Preferences userRoot();

}

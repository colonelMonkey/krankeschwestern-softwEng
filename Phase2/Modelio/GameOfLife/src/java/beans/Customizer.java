package java.beans;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2aa1-0000-000000000000")
public interface Customizer {
    @objid ("8f2cf35b-c705-44e4-a4b8-40de0f269a42")
    void addPropertyChangeListener(PropertyChangeListener p0);

    @objid ("35147f06-76c2-404d-8b8d-af4354f619e6")
    void removePropertyChangeListener(PropertyChangeListener p0);

    @objid ("2563bbc9-bb8f-45ca-8f98-2e3cd7670382")
    void setObject(Object p0);

}

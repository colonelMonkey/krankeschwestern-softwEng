package javax.swing;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-243e-0000-000000000000")
public interface Action extends ActionListener {
    @objid ("e4379f69-b361-4ef0-9260-ca0ed29c91e6")
    void addPropertyChangeListener(PropertyChangeListener p0);

    @objid ("f118b3a7-f9d6-4168-94c5-54e0770af320")
    Object getValue(String p0);

    @objid ("9201a428-fe4c-40b5-90f6-ebb9863f0435")
    boolean isEnabled();

    @objid ("8171279d-34f6-4116-8419-bbf9fef7ce5c")
    void putValue(String p0, Object p1);

    @objid ("48f4df20-4bdf-45bb-b554-446fb47998eb")
    void removePropertyChangeListener(PropertyChangeListener p0);

    @objid ("e7d41e1c-70de-443f-8b87-10bbfe2188a3")
    void setEnabled(boolean p0);

}

package javax.swing;

import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-243b-0000-000000000000")
public interface SpinnerModel {
    @objid ("d103840b-416a-4bb8-96dc-8c03b9805bd1")
    void addChangeListener(ChangeListener p0);

    @objid ("99e99456-7ffa-4af7-99c2-3b29cbf72939")
    Object getNextValue();

    @objid ("edf01c43-5fee-4406-97ac-038a9b8b095d")
    Object getPreviousValue();

    @objid ("7ad4616a-4f54-4958-baeb-46a7fe737586")
    Object getValue();

    @objid ("fbbfa3eb-611d-4c98-bc58-c86c708752c2")
    void removeChangeListener(ChangeListener p0);

    @objid ("e7cb7532-8e19-486c-9b7f-b668936afe9f")
    void setValue(Object p0);

}

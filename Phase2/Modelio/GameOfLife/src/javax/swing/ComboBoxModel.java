package javax.swing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2345-0000-000000000000")
public interface ComboBoxModel extends ListModel {
    @objid ("f0133073-cda4-49bb-b3ea-19d305d7f9ac")
    Object getSelectedItem();

    @objid ("b027180a-e739-435c-9466-880eaa092d87")
    void setSelectedItem(Object p0);

}

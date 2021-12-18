package java.awt;

import java.awt.event.ItemListener;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29b0-0000-000000000000")
public interface ItemSelectable {
    @objid ("e90a59ec-f0c0-4576-9b47-cf471f8f75bd")
    void addItemListener(ItemListener p0);

    @objid ("ceefcc57-0fa8-4fa4-af28-0219b54cd6f4")
    List<Object> getSelectedObjects();

    @objid ("998eaf76-b5e6-4405-b92f-5af5104b534c")
    void removeItemListener(ItemListener p0);

}

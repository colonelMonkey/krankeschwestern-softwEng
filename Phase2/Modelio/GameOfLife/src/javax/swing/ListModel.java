package javax.swing;

import javax.swing.event.ListDataListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23ac-0000-000000000000")
public interface ListModel {
    @objid ("9769ef48-a571-4801-bedc-b4bb84e7f83b")
    void addListDataListener(ListDataListener p0);

    @objid ("b1bb8c2f-3f71-485d-9c54-6c97d0f8d02e")
    Object getElementAt(int p0);

    @objid ("6b3ad868-ad19-4b41-93eb-77c777bddb09")
    int getSize();

    @objid ("65138dad-8f2a-458c-b0a2-4421ef93281a")
    void removeListDataListener(ListDataListener p0);

}

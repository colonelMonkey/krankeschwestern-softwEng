package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-236f-0000-000000000000")
public interface ListDataListener extends EventListener {
    @objid ("2c8d8ca4-34e9-4309-af8f-0974c1f061da")
    void contentsChanged(ListDataEvent p0);

    @objid ("47416593-bdae-495d-8b3b-b6791f3a2c34")
    void intervalAdded(ListDataEvent p0);

    @objid ("4ffb565e-e735-4ee2-8c91-1b900f445e1d")
    void intervalRemoved(ListDataEvent p0);

}

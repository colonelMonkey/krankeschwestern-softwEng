package javax.swing.undo;

import java.util.Hashtable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2350-0000-000000000000")
public interface StateEditable {
    @objid ("e56274b8-2f5e-422c-9889-0c6d5e160fd7")
    void restoreState(Hashtable p0);

    @objid ("f4ccd250-439d-45dc-9e4c-994ce84c083a")
    void storeState(Hashtable p0);

}

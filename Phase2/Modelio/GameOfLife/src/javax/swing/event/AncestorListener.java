package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-237f-0000-000000000000")
public interface AncestorListener extends EventListener {
    @objid ("cc2b56dd-6169-469f-8ab2-c80278afaaa9")
    void ancestorAdded(AncestorEvent p0);

    @objid ("ec3febf7-ed5a-450a-a74c-f4885269ad3a")
    void ancestorMoved(AncestorEvent p0);

    @objid ("82046fe6-c487-4335-a838-588ff97d6076")
    void ancestorRemoved(AncestorEvent p0);

}

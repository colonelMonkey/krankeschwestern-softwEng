package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2365-0000-000000000000")
public interface DocumentListener extends EventListener {
    @objid ("133a6e79-6b92-495e-a548-e14586f2b6c3")
    void changedUpdate(DocumentEvent p0);

    @objid ("5aaed2ef-25d5-43d2-a198-0f7ba6671a89")
    void insertUpdate(DocumentEvent p0);

    @objid ("474ec53e-2d24-446f-9192-b3cf841d64b1")
    void removeUpdate(DocumentEvent p0);

}

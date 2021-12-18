package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-286f-0000-000000000000")
public interface InputMethodListener extends EventListener {
    @objid ("ee014186-b4a3-4fd5-852e-e99c605e0cf6")
    void caretPositionChanged(InputMethodEvent p0);

    @objid ("06417661-8c3f-40d8-be4b-f9b7e7d8720b")
    void inputMethodTextChanged(InputMethodEvent p0);

}

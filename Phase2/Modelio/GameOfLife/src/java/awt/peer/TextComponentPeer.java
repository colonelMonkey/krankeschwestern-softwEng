package java.awt.peer;

import java.awt.im.InputMethodRequests;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28e0-0000-000000000000")
public interface TextComponentPeer extends ComponentPeer {
    @objid ("97a47733-58aa-4ac8-82cd-b6f44b456095")
    int getCaretPosition();

    @objid ("5810900d-48f4-476d-a9d4-103996fa7655")
    InputMethodRequests getInputMethodRequests();

    @objid ("37edcb3c-de70-4a74-aea3-6d7e93f984a8")
    int getSelectionEnd();

    @objid ("90ad66cd-d70c-4fad-b0c5-64fce702c911")
    int getSelectionStart();

    @objid ("774a63f9-5c9d-4d02-b90b-2457c3c757de")
    String getText();

    @objid ("a2ec4e2e-955a-48cf-9355-425a403a5ee9")
    void select(int p0, int p1);

    @objid ("05373d68-3b7c-4386-b91f-788a674eaba8")
    void setCaretPosition(int p0);

    @objid ("d67e2380-9aa7-413c-a229-12b2bf5531d4")
    void setEditable(boolean p0);

    @objid ("704c97c2-fd6e-4216-903a-f425be32fa3e")
    void setText(String p0);

}

package java.awt.peer;

import java.awt.Dialog;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28ee-0000-000000000000")
public interface WindowPeer extends ContainerPeer {
    @objid ("7d5ccffb-15d1-4f25-a747-d51c582d8460")
    void repositionSecurityWarning();

    @objid ("afb99344-23ed-42e1-a546-d017d06e6e49")
    void setModalBlocked(Dialog p0, boolean p1);

    @objid ("9639ab2b-23b5-44bd-8f6b-af71166f8032")
    void setOpacity(float p0);

    @objid ("f2350aeb-8c45-4ad1-8fcc-4025eff0ac57")
    void setOpaque(boolean p0);

    @objid ("5d463389-8a60-4d49-ab87-86255ad9a57f")
    void toBack();

    @objid ("e5c397e6-37b9-4035-b50a-a4683dca15d2")
    void toFront();

    @objid ("88828020-9e7f-4aaf-b6d3-0049d705c86d")
    void updateAlwaysOnTopState();

    @objid ("c994f7ab-bbd5-4e98-a26c-889abb5bc0b0")
    void updateFocusableWindowState();

    @objid ("1fc78940-6642-418f-9d5f-f28701fd8b38")
    void updateIconImages();

    @objid ("d0099f2b-d29d-40a1-ba07-351b392cbe54")
    void updateMinimumSize();

    @objid ("bc4d827d-f56f-4ef0-b834-2183877d7102")
    void updateWindow();

}

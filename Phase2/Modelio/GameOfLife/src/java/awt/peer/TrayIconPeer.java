package java.awt.peer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1a7f-0000-000000000000")
public interface TrayIconPeer {
    @objid ("590ad54f-81a7-4adf-a589-ed3bdfbaf2c9")
    void displayMessage(String p0, String p1, String p2);

    @objid ("1b4827e1-cd8e-41b6-8348-7b3374a9a5d7")
    void dispose();

    @objid ("97479050-563f-491c-acc9-3596463e26a4")
    void setToolTip(String p0);

    @objid ("00ca1fb3-c31d-4065-b510-b3748cad6088")
    void showPopupMenu(int p0, int p1);

    @objid ("2c7830d4-8bc3-4829-83a4-840b75480fd7")
    void updateImage();

}

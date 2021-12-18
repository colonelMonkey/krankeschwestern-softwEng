package javax.swing;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2459-0000-000000000000")
public interface MenuElement {
    @objid ("5ff034e2-4edf-4e7e-8075-ae7b073a505f")
    Component getComponent();

    @objid ("a959c40f-7b0d-4c80-9c19-b4f0d57138df")
    List<MenuElement> getSubElements();

    @objid ("260a29de-1787-499d-b977-177774b11fc0")
    void menuSelectionChanged(boolean p0);

    @objid ("09146d8d-9ffc-4d96-9106-52b4071d3213")
    void processKeyEvent(KeyEvent p0, List<MenuElement> p1, MenuSelectionManager p2);

    @objid ("4504a5e0-ef72-4836-bcce-bd58a873b36c")
    void processMouseEvent(MouseEvent p0, List<MenuElement> p1, MenuSelectionManager p2);

}

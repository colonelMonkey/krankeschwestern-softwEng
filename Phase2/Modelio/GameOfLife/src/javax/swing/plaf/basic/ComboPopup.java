package javax.swing.plaf.basic;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2200-0000-000000000000")
public interface ComboPopup {
    @objid ("f6ea51e9-df2a-49f0-8781-88f98dc4f63c")
    KeyListener getKeyListener();

    @objid ("78b20700-ff06-4913-86ad-ab43e03bb07b")
    JList getList();

    @objid ("622cd33e-3c05-4595-97e9-b04ccaa3dac1")
    MouseListener getMouseListener();

    @objid ("78184235-f00a-4c68-9f81-4e835ac2f457")
    MouseMotionListener getMouseMotionListener();

    @objid ("8bf73e5d-905a-4a33-860f-0056164d0ad0")
    void hide();

    @objid ("d870ba2d-aff2-4252-a1f1-4855c77690af")
    boolean isVisible();

    @objid ("c794fae5-163a-4f41-8c62-169c8c5e9600")
    void show();

    @objid ("42d713c1-a4b6-4219-a273-cb980e4ecd2a")
    void uninstallingUI();

}

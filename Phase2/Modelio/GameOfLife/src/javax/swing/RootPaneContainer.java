package javax.swing;

import java.awt.Component;
import java.awt.Container;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-242b-0000-000000000000")
public interface RootPaneContainer {
    @objid ("4bbb8467-862c-4500-92f2-954d3bbdd495")
    Container getContentPane();

    @objid ("9d586f67-f41e-43fd-80cf-2a905eaca14e")
    Component getGlassPane();

    @objid ("b76be2b3-b911-4d02-88dd-794adfb8e27e")
    JLayeredPane getLayeredPane();

    @objid ("c370d9be-4fcd-49bf-ba71-a99f37ec14af")
    JRootPane getRootPane();

    @objid ("a81e41e2-5a8a-4d73-8e0f-1592b78ec161")
    void setContentPane(Container p0);

    @objid ("0dc604c9-bd0a-4870-be98-3c14e6b1e17b")
    void setGlassPane(Component p0);

    @objid ("da54b745-b373-4494-8ace-90a3bbdbbf9c")
    void setLayeredPane(JLayeredPane p0);

}

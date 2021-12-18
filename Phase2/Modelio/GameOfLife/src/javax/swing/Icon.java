package javax.swing;

import java.awt.Component;
import java.awt.Graphics;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2410-0000-000000000000")
public interface Icon {
    @objid ("bd0e267f-5092-4180-b7ae-25a10d8602b7")
    int getIconHeight();

    @objid ("47b90d51-e192-40cf-baee-cb163222ca30")
    int getIconWidth();

    @objid ("faf01961-c2e2-4696-b262-02a36654b200")
    void paintIcon(Component p0, Graphics p1, int p2, int p3);

}

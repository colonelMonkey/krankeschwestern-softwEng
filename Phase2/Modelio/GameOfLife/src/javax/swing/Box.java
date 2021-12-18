package javax.swing;

import javax.accessibility.Accessible;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-24b0-0000-000000000000")
public class Box extends JComponent implements Accessible {
    @objid ("00d00398-0000-24b2-0000-000000000000")
    public static class Filler extends JComponent implements Accessible {
        @objid ("6d3fdb61-72da-4abe-8cb2-5833d129e1a0")
        protected class AccessibleBoxFiller extends AccessibleAWTComponent {
        }

    }

    @objid ("3239287a-49f9-4a5a-8303-ae85c70b0630")
    protected class AccessibleBox extends AccessibleAWTContainer {
    }

}

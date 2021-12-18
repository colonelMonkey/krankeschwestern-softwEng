package javax.swing;

import java.awt.LayoutManager2;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1882-0000-000000000000")
public class GroupLayout implements LayoutManager2 {
    @objid ("01ec0d38-0000-188b-0000-000000000000")
    public abstract class Group {
    }

    @objid ("01ec0d38-0000-188d-0000-000000000000")
    public class ParallelGroup extends Group {
    }

    @objid ("01ec0d38-0000-188f-0000-000000000000")
    public class SequentialGroup extends Group {
    }

    @objid ("ee0a5b44-cdde-42bb-9109-377948e00bb9")
    public enum Alignment {
        ;
    }

}

package javax.swing.text;

import java.io.Serializable;
import javax.swing.undo.AbstractUndoableEdit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-202c-0000-000000000000")
public class DefaultStyledDocument extends AbstractDocument implements StyledDocument {
    @objid ("00d00398-0000-202d-0000-000000000000")
    public static class AttributeUndoableEdit extends AbstractUndoableEdit {
    }

    @objid ("00d00398-0000-202f-0000-000000000000")
    public class ElementBuffer implements Serializable {
    }

    @objid ("00d00398-0000-2031-0000-000000000000")
    public static class ElementSpec {
    }

    @objid ("e85b52bc-0e50-401d-a163-94c9d1a56ff7")
    protected class SectionElement extends BranchElement {
    }

}

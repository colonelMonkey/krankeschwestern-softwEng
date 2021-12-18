package javax.swing;

import javax.accessibility.AccessibleHyperlink;
import javax.accessibility.AccessibleHypertext;
import javax.swing.text.JTextComponent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-241c-0000-000000000000")
public class JEditorPane extends JTextComponent {
    @objid ("2074775f-c2b7-43f1-9426-ebf82928fa1c")
    protected class AccessibleJEditorPane extends AccessibleJTextComponent {
    }

    @objid ("ecc778e7-cbf5-4f6f-bc33-539d1dbe2b86")
    protected class AccessibleJEditorPaneHTML extends AccessibleJEditorPane {
    }

    @objid ("898e769d-3373-42e3-901f-b5f4ff10bf58")
    protected class JEditorPaneAccessibleHypertextSupport extends AccessibleJEditorPane implements AccessibleHypertext {
        @objid ("72bb7b0a-cbbd-4d20-a04b-11f0dbd9a132")
        public class HTMLLink extends AccessibleHyperlink {
        }

    }

}

package javax.swing.text.html;

import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-1f7e-0000-000000000000")
public class HTMLDocument extends DefaultStyledDocument {
    @objid ("00d00398-0000-1f7f-0000-000000000000")
    public class BlockElement extends BranchElement {
    }

    @objid ("00d00398-0000-1f81-0000-000000000000")
    public class HTMLReader extends ParserCallback {
        @objid ("00d00398-0000-1f85-0000-000000000000")
        public class BlockAction extends TagAction {
        }

        @objid ("00d00398-0000-1f86-0000-000000000000")
        public class CharacterAction extends TagAction {
        }

        @objid ("00d00398-0000-1f88-0000-000000000000")
        public class FormAction extends SpecialAction {
        }

        @objid ("00d00398-0000-1f8b-0000-000000000000")
        public class HiddenAction extends TagAction {
        }

        @objid ("00d00398-0000-1f8c-0000-000000000000")
        public class IsindexAction extends TagAction {
        }

        @objid ("00d00398-0000-1f91-0000-000000000000")
        public class ParagraphAction extends BlockAction {
        }

        @objid ("00d00398-0000-1f92-0000-000000000000")
        public class PreAction extends BlockAction {
        }

        @objid ("00d00398-0000-1f93-0000-000000000000")
        public class SpecialAction extends TagAction {
        }

        @objid ("00d00398-0000-1f95-0000-000000000000")
        public class TagAction {
        }

    }

    @objid ("00d00398-0000-1f97-0000-000000000000")
    public static abstract class Iterator {
    }

    @objid ("00d00398-0000-1f99-0000-000000000000")
    public class RunElement extends LeafElement {
    }

}

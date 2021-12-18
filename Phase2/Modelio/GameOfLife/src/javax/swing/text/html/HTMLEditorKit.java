package javax.swing.text.html;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-1f32-0000-000000000000")
public class HTMLEditorKit extends StyledEditorKit implements Accessible {
    @objid ("00d00398-0000-1f34-0000-000000000000")
    public static class HTMLFactory implements ViewFactory {
    }

    @objid ("00d00398-0000-1f36-0000-000000000000")
    public static abstract class HTMLTextAction extends StyledTextAction {
    }

    @objid ("00d00398-0000-1f38-0000-000000000000")
    public static class InsertHTMLTextAction extends HTMLTextAction {
    }

    @objid ("00d00398-0000-1f39-0000-000000000000")
    public static class LinkController extends MouseAdapter implements MouseMotionListener, Serializable {
    }

    @objid ("00d00398-0000-1f3c-0000-000000000000")
    public static abstract class Parser {
    }

    @objid ("00d00398-0000-1f3d-0000-000000000000")
    public static class ParserCallback {
    }

}

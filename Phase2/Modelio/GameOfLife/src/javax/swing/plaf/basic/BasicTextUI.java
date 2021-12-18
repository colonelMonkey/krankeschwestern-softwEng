package javax.swing.plaf.basic;

import javax.swing.plaf.TextUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.ViewFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-21be-0000-000000000000")
public abstract class BasicTextUI extends TextUI implements ViewFactory {
    @objid ("00d00398-0000-21bf-0000-000000000000")
    public static class BasicCaret extends DefaultCaret implements UIResource {
    }

    @objid ("00d00398-0000-21c0-0000-000000000000")
    public static class BasicHighlighter extends DefaultHighlighter implements UIResource {
    }

}

package java.awt;

import java.awt.event.TextListener;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleText;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-297f-0000-000000000000")
public class TextComponent extends Component implements Accessible {
    @objid ("b47aa12b-f907-4b11-847f-180bce163c23")
    protected class AccessibleAWTTextComponent extends AccessibleAWTComponent implements AccessibleText, TextListener {
    }

}

package javax.swing.text;

import javax.swing.text.AttributeSet.CharacterAttribute;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.text.AttributeSet.ParagraphAttribute;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-1ffb-0000-000000000000")
public class StyleConstants {
    @objid ("00d00398-0000-1ffc-0000-000000000000")
    public static class CharacterConstants extends StyleConstants implements CharacterAttribute {
    }

    @objid ("00d00398-0000-1ffd-0000-000000000000")
    public static class ColorConstants extends StyleConstants implements ColorAttribute, CharacterAttribute {
    }

    @objid ("00d00398-0000-1ffe-0000-000000000000")
    public static class FontConstants extends StyleConstants implements FontAttribute, CharacterAttribute {
    }

    @objid ("00d00398-0000-1fff-0000-000000000000")
    public static class ParagraphConstants extends StyleConstants implements ParagraphAttribute {
    }

}

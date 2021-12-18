package java.awt.im.spi;

import java.awt.AWTException;
import java.awt.Image;
import java.util.List;
import java.util.Locale;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2931-0000-000000000000")
public interface InputMethodDescriptor {
    @objid ("7039a70a-fdb1-4718-be12-829af2cdca40")
    InputMethod createInputMethod() throws Exception;

    @objid ("b60ce0ed-e734-4408-8c6c-6511dad542b8")
    List<Locale> getAvailableLocales() throws AWTException;

    @objid ("dfa9e10a-c08b-493f-90cc-ff73eeacab2f")
    String getInputMethodDisplayName(Locale p0, Locale p1);

    @objid ("83bd4c18-43ad-4f0b-9cfa-d56849a50bc0")
    Image getInputMethodIcon(Locale p0);

    @objid ("ba49fb92-cc04-45fb-92e9-f00dfdfaa4b4")
    boolean hasDynamicLocaleList();

}

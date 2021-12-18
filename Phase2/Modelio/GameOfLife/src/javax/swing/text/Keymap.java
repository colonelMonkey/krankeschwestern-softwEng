package javax.swing.text;

import java.util.List;
import javax.swing.Action;
import javax.swing.KeyStroke;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2058-0000-000000000000")
public interface Keymap {
    @objid ("b6eedb51-e979-4f57-9255-711491be57d8")
    void addActionForKeyStroke(KeyStroke p0, Action p1);

    @objid ("9f03e653-551c-4655-ad66-25c694347e9c")
    Action getAction(KeyStroke p0);

    @objid ("01b81bde-d972-472b-b322-a9efd2aa1ca7")
    List<Action> getBoundActions();

    @objid ("386e270d-5ebd-4474-903f-badc9abbb1ce")
    List<KeyStroke> getBoundKeyStrokes();

    @objid ("3571e2a8-2b0b-4b83-81b6-a275b34bfada")
    Action getDefaultAction();

    @objid ("7d7a33c2-6d86-4e3c-bbd4-fb7a5953b7f0")
    List<KeyStroke> getKeyStrokesForAction(Action p0);

    @objid ("e1ae6b06-e1ee-4117-a3a8-29cb1e658841")
    String getName();

    @objid ("849a466b-155a-4754-ac9b-69be33020a9b")
    Keymap getResolveParent();

    @objid ("3c5e9d9f-fb39-4cc7-8d0b-34ade3a44496")
    boolean isLocallyDefined(KeyStroke p0);

    @objid ("7e0c8b6a-7f60-400a-ac82-cb781c744336")
    void removeBindings();

    @objid ("48b800f7-7adb-40a5-8a4e-fd4b9c58ee84")
    void removeKeyStrokeBinding(KeyStroke p0);

    @objid ("293a9b32-6be8-419d-b60b-8bb4ea49a1ea")
    void setDefaultAction(Action p0);

    @objid ("1187b546-f302-4e70-9e73-8c1ab643d83f")
    void setResolveParent(Keymap p0);

}

package javax.swing;

import java.util.Hashtable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2401-0000-000000000000")
public class UIDefaults extends Hashtable {
    @objid ("00d00398-0000-2402-0000-000000000000")
    public interface ActiveValue {
        @objid ("fcaeb7e4-da91-45c4-a64b-246ff13e1c2c")
        Object createValue(UIDefaults p0);

    }

    @objid ("00d00398-0000-2403-0000-000000000000")
    public static class LazyInputMap implements LazyValue {
    }

    @objid ("00d00398-0000-2404-0000-000000000000")
    public interface LazyValue {
        @objid ("602e13f8-e8f3-4031-a4cf-685f57fba49a")
        Object createValue(UIDefaults p0);

    }

    @objid ("00d00398-0000-2405-0000-000000000000")
    public static class ProxyLazyValue implements LazyValue {
    }

}

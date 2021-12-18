package java.util;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d07-0000-000000000000")
public abstract class AbstractMap implements Map {
    @objid ("01ec0d38-0000-1bfd-0000-000000000000")
    public static class SimpleEntry implements Entry, Serializable {
    }

    @objid ("01ec0d38-0000-1bfe-0000-000000000000")
    public static class SimpleImmutableEntry implements Entry, Serializable {
    }

}

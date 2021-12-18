package java.util;

import java.util.function.Consumer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2cf3-0000-000000000000")
public interface Iterator {
    @objid ("b4127894-3847-4663-a05c-fabac1d1d375")
    void forEachRemaining(Consumer p0);

    @objid ("ab43c191-2fd5-4ecf-8159-b5a33b32b844")
    boolean hasNext();

    @objid ("4acaf7da-ac32-41ec-8044-7a101207b182")
    Object next();

    @objid ("02238b63-7640-48d2-a3aa-4aba86256cb1")
    void remove();

}

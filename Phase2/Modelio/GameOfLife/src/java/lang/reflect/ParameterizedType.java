package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ac8-0000-000000000000")
public interface ParameterizedType extends Type {
    @objid ("4070cc83-93f9-4795-bd31-3d928a0905fa")
    List<Type> getActualTypeArguments();

    @objid ("ed8abe98-3ac2-495d-9f3b-3733ac71d2ff")
    Type getOwnerType();

    @objid ("5c3a4c72-1264-42e9-afe8-4f2e4bf6f079")
    Type getRawType();

}

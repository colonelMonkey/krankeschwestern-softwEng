package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f1a158e3-bdfc-4836-94db-77ea4746740f")
public interface AnnotatedParameterizedType extends AnnotatedType {
    @objid ("4ed1fa7a-c7aa-4036-b1f4-fcd1bd6d2c0c")
    List<AnnotatedType> getAnnotatedActualTypeArguments();

}

package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ac5-0000-000000000000")
public interface GenericDeclaration extends AnnotatedElement {
    @objid ("8d32a08e-569e-41c5-8996-ba1f764e2550")
    List<TypeVariable> getTypeParameters();

}

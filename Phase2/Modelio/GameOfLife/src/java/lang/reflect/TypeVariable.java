package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ad3-0000-000000000000")
public interface TypeVariable extends Type, AnnotatedElement {
    @objid ("dc3635da-8701-4811-b4dd-4e9520ed35a5")
    List<AnnotatedType> getAnnotatedBounds();

    @objid ("727a0361-2da1-4243-81a0-76c1dcd11519")
    List<Type> getBounds();

    @objid ("438f2477-73b8-4f41-8f2b-a919ce8b953d")
    GenericDeclaration getGenericDeclaration();

    @objid ("0a0fd0e6-b610-49d8-a1a6-7dbb19562cb5")
    String getName();

}

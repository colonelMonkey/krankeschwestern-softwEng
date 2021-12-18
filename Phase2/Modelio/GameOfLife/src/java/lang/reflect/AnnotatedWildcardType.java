package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0af94ec4-a64d-4e5d-b00c-446425463d66")
public interface AnnotatedWildcardType extends AnnotatedType {
    @objid ("19f8fc29-95cf-4f66-b3db-6ea6c15b1c37")
    List<AnnotatedType> getAnnotatedLowerBounds();

    @objid ("4ab95f9f-5188-46e7-9ad8-f87e6d7820f3")
    List<AnnotatedType> getAnnotatedUpperBounds();

}

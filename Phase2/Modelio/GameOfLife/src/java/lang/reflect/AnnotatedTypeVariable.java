package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("85598551-ffce-4914-b3cc-3ba13386f212")
public interface AnnotatedTypeVariable extends AnnotatedType {
    @objid ("c0a6d232-e102-4a55-a1f7-5795bda79e9a")
    List<AnnotatedType> getAnnotatedBounds();

}

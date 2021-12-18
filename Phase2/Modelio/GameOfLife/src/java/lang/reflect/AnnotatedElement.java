package java.lang.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ad2-0000-000000000000")
public interface AnnotatedElement {
    @objid ("226f79eb-b02e-490e-9270-add7b920a214")
    Annotation getAnnotation(Class p0);

    @objid ("bcdb074e-595c-4a6b-baaa-8a6a3839c0a6")
    List<Annotation> getAnnotations();

    @objid ("6746310a-e204-41d0-be45-2c7b3df07697")
    List<Annotation> getAnnotationsByType(Class p0);

    @objid ("1dd0467a-668d-4f06-b447-8807c651b3f4")
    Annotation getDeclaredAnnotation(Class p0);

    @objid ("16c00554-0e76-4a7d-91ce-62b615768224")
    List<Annotation> getDeclaredAnnotations();

    @objid ("3d5be477-8d1f-45ff-a73d-dbc36baa812d")
    List<Annotation> getDeclaredAnnotationsByType(Class p0);

    @objid ("2b30a429-482a-426b-9566-4ec28c913b91")
    boolean isAnnotationPresent(Class p0);

    @objid ("2e022379-47f4-4b3b-878f-49841285fd26")
    Annotation lambda$getDeclaredAnnotationsByType$0(Annotation p0, Annotation p1);

}

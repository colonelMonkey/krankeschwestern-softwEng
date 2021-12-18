package java.lang.invoke;

import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Member;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("28e53de6-c3ec-4501-bc26-c57a44b144bb")
public interface MethodHandleInfo {
    @objid ("cfd3f7b8-e0d4-464d-adac-0236001584ed")
    Class getDeclaringClass();

    @objid ("33bb4c7f-6282-4de4-9654-3a1033482544")
    MethodType getMethodType();

    @objid ("0aafa386-95a6-4c97-a025-7dfc5c171c85")
    int getModifiers();

    @objid ("0f5c4a47-74ea-40ef-a721-bcb24ee79452")
    String getName();

    @objid ("7a95afa9-4413-4f19-9e33-2d79e24d23e3")
    int getReferenceKind();

    @objid ("c22e3076-2f10-4489-8e72-5319b5fd4886")
    boolean isVarArgs();

    @objid ("c1c4c5ad-a43b-407a-a351-eed836f343a2")
    String referenceKindToString(int p0);

    @objid ("f11541ae-a3ca-4ddf-8fdb-748354c078b1")
    Member reflectAs(Class p0, Lookup p1);

    @objid ("eb2683e9-a69d-486c-b95a-602956c09be8")
    String toString(int p0, Class p1, String p2, MethodType p3);

}

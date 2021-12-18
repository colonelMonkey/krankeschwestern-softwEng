package java.lang.instrument;

import java.util.List;
import java.util.jar.JarFile;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b0b-0000-000000000000")
public interface Instrumentation {
    @objid ("b3e3e118-0f4d-4fb5-b9f9-671f673e2e93")
    void addTransformer(ClassFileTransformer p0, boolean p1);

    @objid ("30d30df5-e991-479c-b238-0452d716b7c1")
    void addTransformer(ClassFileTransformer p0);

    @objid ("5258461f-39e5-422e-bd1a-cb88f7f9d8b9")
    void appendToBootstrapClassLoaderSearch(JarFile p0);

    @objid ("696ddb26-9790-48b1-990b-71e53db44ff5")
    void appendToSystemClassLoaderSearch(JarFile p0);

    @objid ("2c9c2ca6-6d2d-4ae4-817f-5c3801c29c89")
    List<Class> getAllLoadedClasses();

    @objid ("0916fcaa-b146-4294-a953-44b1cbf06974")
    List<Class> getInitiatedClasses(ClassLoader p0);

    @objid ("82514a6c-d204-4502-add0-90ac5982d2b5")
    long getObjectSize(Object p0);

    @objid ("4e2168d0-dd4d-4dcf-a398-d0577f058703")
    boolean isModifiableClass(Class p0);

    @objid ("105827d4-fb9d-4020-90a6-cfa1516e75d6")
    boolean isNativeMethodPrefixSupported();

    @objid ("8793fa62-2162-4d3c-a7f7-905c8f7f70a3")
    boolean isRedefineClassesSupported();

    @objid ("ae4b907d-2d5d-447c-beb3-9d74ac2c396e")
    boolean isRetransformClassesSupported();

    @objid ("4d5e98d5-b204-431d-884a-73d82006c850")
    void redefineClasses(List<ClassDefinition> p0) throws ClassNotFoundException, UnmodifiableClassException;

    @objid ("8a5cffac-1955-49b5-9611-32f602cfe723")
    boolean removeTransformer(ClassFileTransformer p0);

    @objid ("093cc668-593e-4c9f-a7d5-e040c17d721c")
    void retransformClasses(List<Class> p0) throws UnmodifiableClassException;

    @objid ("ba67c1d1-7b46-4923-865d-90245f220e78")
    void setNativeMethodPrefix(ClassFileTransformer p0, String p1);

}

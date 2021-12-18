package java.lang.reflect;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bd5d5527-7efb-471e-b199-ca0571963d53")
public interface AnnotatedArrayType extends AnnotatedType {
    @objid ("244de00b-f771-41cc-91b4-79aa164672f1")
    AnnotatedType getAnnotatedGenericComponentType();

}

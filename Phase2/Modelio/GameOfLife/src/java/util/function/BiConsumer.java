package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f02fd459-9f4a-40d4-b98b-9c9022a4c757")
public interface BiConsumer {
    @objid ("bce13229-9edc-4bc2-a1d0-cd69b3975519")
    void accept(Object p0, Object p1);

    @objid ("63684e3e-f952-4691-bc1a-3548bbd304b6")
    BiConsumer andThen(BiConsumer p0);

    @objid ("c1fb6f29-367e-4932-87d4-549fbcb5aaf5")
    void lambda$andThen$0(BiConsumer p0, Object p1, Object p2);

}

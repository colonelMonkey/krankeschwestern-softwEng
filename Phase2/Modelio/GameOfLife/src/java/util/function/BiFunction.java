package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aaf52f88-6c99-4c01-9928-2082136b747e")
public interface BiFunction {
    @objid ("e58b91cf-296a-4f7d-b629-23367a7a7f86")
    BiFunction andThen(Function p0);

    @objid ("f811f5fa-c7f5-4c7e-b327-64062ff08aeb")
    Object apply(Object p0, Object p1);

    @objid ("e751b7e1-c61c-4781-a6dc-eeed40b26efb")
    Object lambda$andThen$0(Function p0, Object p1, Object p2);

}

package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3d488f07-5dd4-4288-bef1-f72c41d1dc06")
public interface DoublePredicate {
    @objid ("62bfbe82-9dde-4de1-99af-92185c33db84")
    DoublePredicate and(DoublePredicate p0);

    @objid ("7b05b0d0-bf73-4c5e-b0d1-7df8fd9b67a6")
    DoublePredicate negate();

    @objid ("fd8e7a22-5dba-4261-98b8-960f91c69141")
    DoublePredicate or(DoublePredicate p0);

    @objid ("93f28f8d-c18d-43e3-906f-44d5a822616e")
    boolean test(double p0);

    @objid ("348ca924-6912-498f-af73-6359e9db2d1a")
    boolean lambda$and$0(DoublePredicate p0, double p1);

    @objid ("4a967443-2f1d-4880-a335-b22c1aac64a2")
    boolean lambda$negate$1(double p0);

    @objid ("6e3de175-da26-44af-9c83-3a8de2d281d8")
    boolean lambda$or$2(DoublePredicate p0, double p1);

}

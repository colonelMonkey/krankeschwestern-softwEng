package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2a3314ef-9993-4939-b72e-4558b682a5fe")
public interface BiPredicate {
    @objid ("9e388c35-e386-42ee-97d3-f408d0d48d9b")
    BiPredicate and(BiPredicate p0);

    @objid ("54f15328-0760-4aae-8159-b455c3a12067")
    BiPredicate negate();

    @objid ("8bdb9581-793a-41ed-b887-8aad9026c926")
    BiPredicate or(BiPredicate p0);

    @objid ("c2cfe81d-3983-4a27-86bc-9f7335bc1dfa")
    boolean test(Object p0, Object p1);

    @objid ("0c1a26dd-8668-4d28-8825-06ecec78818c")
    boolean lambda$and$0(BiPredicate p0, Object p1, Object p2);

    @objid ("65cff110-67b8-4961-afb4-acd43ca86d5d")
    boolean lambda$negate$1(Object p0, Object p1);

    @objid ("c159b053-33ed-4f2b-891a-9fbcb9a127b1")
    boolean lambda$or$2(BiPredicate p0, Object p1, Object p2);

}

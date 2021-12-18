package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2f38615c-8f9e-4d2d-9aec-5bb97a328a59")
public interface Predicate {
    @objid ("18eb5641-3e76-433d-a90d-d849fbde40b9")
    Predicate and(Predicate p0);

    @objid ("f0abeabc-5ef6-40e3-80da-365442aefe72")
    Predicate isEqual(Object p0);

    @objid ("334c858a-66b9-47ed-83d6-c984918bb23c")
    Predicate negate();

    @objid ("6ff05d4a-1d87-4ed2-b40b-626371152c21")
    Predicate or(Predicate p0);

    @objid ("414b4928-f9b3-4ec5-8dad-ba5dc1534b14")
    boolean test(Object p0);

    @objid ("c872a3e3-e03f-403d-91ea-c2b54ff8994b")
    boolean lambda$and$0(Predicate p0, Object p1);

    @objid ("d6ae50af-84d0-4dcd-9b23-c5372db9c4fa")
    boolean lambda$negate$1(Object p0);

    @objid ("bba7aed7-86b7-437e-b4d7-ab534f5f65e9")
    boolean lambda$or$2(Predicate p0, Object p1);

    @objid ("eee2d16b-9c37-4b49-a852-e1d8c4e5f10f")
    boolean lambda$isEqual$3(Object p0, Object p1);

}

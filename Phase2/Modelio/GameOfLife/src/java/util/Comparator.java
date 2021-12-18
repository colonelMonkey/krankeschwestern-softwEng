package java.util;

import java.lang.invoke.SerializedLambda;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d6c-0000-000000000000")
public interface Comparator {
    @objid ("a9127c76-a8a4-4833-9b36-ddafd3f82364")
    Object $deserializeLambda$(SerializedLambda p0);

    @objid ("3653f7d5-05d6-4306-9b74-fb5ef7d03b97")
    int compare(Object p0, Object p1);

    @objid ("1a83584a-56fe-42d6-8e87-aaad35406fca")
    Comparator comparing(Function p0, Comparator p1);

    @objid ("8319ab96-3c02-42f0-b46a-191fba9ac47f")
    Comparator comparing(Function p0);

    @objid ("5196e473-3e36-4ee3-ba83-87acbcfbac2e")
    Comparator comparingDouble(ToDoubleFunction p0);

    @objid ("ca5afff1-3e0a-4c75-91ca-29e5b4e8a0d4")
    Comparator comparingInt(ToIntFunction p0);

    @objid ("ec000c45-27d1-4412-9989-5b451af4a7ff")
    Comparator comparingLong(ToLongFunction p0);

    @objid ("a8aa34c3-6d94-4055-b7e7-823aec1db6f9")
    boolean equals(Object p0);

    @objid ("3f90f768-2a96-4e6a-8d9c-c40a2eaba5b1")
    int lambda$comparing$77a9974f$1(Function p0, Object p1, Object p2);

    @objid ("8bb8486e-5e8f-42bc-98a4-1aac12ed273d")
    int lambda$comparing$ea9a8b3a$1(Comparator p0, Function p1, Object p2, Object p3);

    @objid ("ae68795c-3513-421c-a8df-8c48a8910627")
    int lambda$comparingDouble$8dcf42ea$1(ToDoubleFunction p0, Object p1, Object p2);

    @objid ("67c7a83e-a0a4-4ab9-8f6a-81f8b2d393ce")
    int lambda$comparingInt$7b0bb60$1(ToIntFunction p0, Object p1, Object p2);

    @objid ("573f48b9-8f76-4767-8e5a-cf30c1ee68ed")
    int lambda$comparingLong$6043328a$1(ToLongFunction p0, Object p1, Object p2);

    @objid ("b0d0f16a-fce7-49ab-9ac8-861f950df2a6")
    int lambda$thenComparing$36697e65$1(Comparator p0, Object p1, Object p2);

    @objid ("d8b0ba57-393b-4ab7-8460-4a81759f2b03")
    Comparator naturalOrder();

    @objid ("19917420-4f09-4d84-984f-c2257831ad7c")
    Comparator nullsFirst(Comparator p0);

    @objid ("575ce074-a9b3-4385-80c0-627f3b144a0d")
    Comparator nullsLast(Comparator p0);

    @objid ("f4af93e0-fcd0-41a2-98d9-261a83d5bd11")
    Comparator reverseOrder();

    @objid ("6c43b67d-0be7-4713-942c-9515a71f0f31")
    Comparator reversed();

    @objid ("dbf81cdb-b498-433d-b94e-77faeab57e73")
    Comparator thenComparing(Function p0);

    @objid ("c048a45e-c329-42d0-b53e-c6fe57e17012")
    Comparator thenComparing(Comparator p0);

    @objid ("d01eabfe-15e3-4d9a-a203-ff83b87a9a3a")
    Comparator thenComparing(Function p0, Comparator p1);

    @objid ("135dbbaa-c36a-4733-8881-1e6235870200")
    Comparator thenComparingDouble(ToDoubleFunction p0);

    @objid ("78ed8862-9426-452c-a547-5b62a4afdac8")
    Comparator thenComparingInt(ToIntFunction p0);

    @objid ("01f2e26d-9702-484b-ac64-50b94b709fbe")
    Comparator thenComparingLong(ToLongFunction p0);

}

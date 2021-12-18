package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("573639b4-2f6f-4451-a578-66a771675306")
public interface IntPredicate {
    @objid ("cb9a3385-3dec-4651-8097-5e3a59e6025d")
    IntPredicate and(IntPredicate p0);

    @objid ("6cfcbc12-81bc-48ec-b0c0-03d3192f3322")
    IntPredicate negate();

    @objid ("8b7d8510-63bf-4aec-a28b-448e65139e90")
    IntPredicate or(IntPredicate p0);

    @objid ("ccac80e6-fa99-4d04-b8f3-67c35990b910")
    boolean test(int p0);

    @objid ("a55ab460-c88f-4b8e-b1fe-06fc9f51bda5")
    boolean lambda$and$0(IntPredicate p0, int p1);

    @objid ("dd2ae431-99f9-4853-956b-3c763f3740fb")
    boolean lambda$negate$1(int p0);

    @objid ("80c48d7e-b9f3-495e-b47f-bc67aa522041")
    boolean lambda$or$2(IntPredicate p0, int p1);

}

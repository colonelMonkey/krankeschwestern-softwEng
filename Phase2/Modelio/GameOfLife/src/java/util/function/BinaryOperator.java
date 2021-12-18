package java.util.function;

import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4fda5f33-0cdf-4d96-93b1-40a128b28f6a")
public interface BinaryOperator extends BiFunction {
    @objid ("05988abf-49c0-47cb-944d-1e0cbda21103")
    BinaryOperator maxBy(Comparator p0);

    @objid ("22ee81d5-8488-4d37-a0ba-5ff7dcad8ae4")
    BinaryOperator minBy(Comparator p0);

    @objid ("e7d885db-9725-4b05-9a67-82585c5d85e8")
    Object lambda$maxBy$1(Comparator p0, Object p1, Object p2);

    @objid ("2dfd4b3b-bc16-4a13-9b1a-ccb56cb7af02")
    Object lambda$minBy$0(Comparator p0, Object p1, Object p2);

}

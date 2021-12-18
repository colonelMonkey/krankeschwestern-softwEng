package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a6f07264-a9b9-4281-bc62-26dc79e373da")
public interface DoubleUnaryOperator {
    @objid ("a3faace8-3ef1-42d5-9238-03e182f9090c")
    DoubleUnaryOperator andThen(DoubleUnaryOperator p0);

    @objid ("ea293c04-fb48-4fb3-964f-3fb69f43edb2")
    double applyAsDouble(double p0);

    @objid ("08ca4884-470e-4a70-b352-09c07d80690d")
    DoubleUnaryOperator compose(DoubleUnaryOperator p0);

    @objid ("7970f81c-49a0-4ebc-9248-eb5f653c3aee")
    DoubleUnaryOperator identity();

    @objid ("e2720efe-b13c-4ed9-a096-f2f223837ed5")
    double lambda$andThen$1(DoubleUnaryOperator p0, double p1);

    @objid ("e1481db0-8d9c-4938-8f43-4200037ff562")
    double lambda$compose$0(DoubleUnaryOperator p0, double p1);

    @objid ("cf6dc4e8-9140-4306-80ce-09230d1819fa")
    double lambda$identity$2(double p0);

}

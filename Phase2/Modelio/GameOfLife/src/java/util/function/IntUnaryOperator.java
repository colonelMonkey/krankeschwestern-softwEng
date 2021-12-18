package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("99e10627-8b21-4249-85c5-01e9e4c63873")
public interface IntUnaryOperator {
    @objid ("bcd7a30f-dcc8-48b4-a9de-7d03800075fa")
    IntUnaryOperator andThen(IntUnaryOperator p0);

    @objid ("fbe82447-d071-4825-bb27-54753c09340f")
    int applyAsInt(int p0);

    @objid ("14e8cb61-514c-45b4-aee7-1aea6df85278")
    IntUnaryOperator compose(IntUnaryOperator p0);

    @objid ("54a25b5f-5f7f-4c41-9a38-d9d856d60a62")
    IntUnaryOperator identity();

    @objid ("50c5c3db-a4e3-48e3-9154-8fb61225fa69")
    int lambda$andThen$1(IntUnaryOperator p0, int p1);

    @objid ("2ff5825c-d24e-4c04-bc66-4ff01bfa42db")
    int lambda$compose$0(IntUnaryOperator p0, int p1);

    @objid ("0ed7659b-dd52-4f95-80d2-3cf6fb5e8e5d")
    int lambda$identity$2(int p0);

}

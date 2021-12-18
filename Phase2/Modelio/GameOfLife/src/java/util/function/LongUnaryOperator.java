package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c0403ee-e43e-464f-a91e-776b8b086d6d")
public interface LongUnaryOperator {
    @objid ("e2a10033-0fef-4d8d-9aaf-17a8abab2109")
    LongUnaryOperator andThen(LongUnaryOperator p0);

    @objid ("6de65efe-196e-4cd8-8451-f0c8dd77e46d")
    long applyAsLong(long p0);

    @objid ("95b5d628-5076-42ca-93c6-cb30f1639613")
    LongUnaryOperator compose(LongUnaryOperator p0);

    @objid ("8df7d792-8a25-4975-8f5f-d263211a42f6")
    LongUnaryOperator identity();

    @objid ("5cfbdfeb-5bd3-4225-9491-0bc27e6cb32a")
    long lambda$andThen$1(LongUnaryOperator p0, long p1);

    @objid ("e326beb5-0a0a-4a57-813c-6ea924b6789b")
    long lambda$compose$0(LongUnaryOperator p0, long p1);

    @objid ("11844a82-04bc-4890-a0bf-fb3535a11941")
    long lambda$identity$2(long p0);

}

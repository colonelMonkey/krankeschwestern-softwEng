package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6c3689ac-7a53-4f43-a9c4-b3dcb11f9375")
public interface Function {
    @objid ("84ff63b2-443f-4122-a043-4fc2decb33a2")
    Function andThen(Function p0);

    @objid ("b86dfc3f-63cd-4b0e-b3a8-c868cfeacd86")
    Object apply(Object p0);

    @objid ("0e281614-d75a-4814-8698-b774fbdbbcbe")
    Function compose(Function p0);

    @objid ("8285de70-a84e-4067-ae63-d8116f20a383")
    Function identity();

    @objid ("123c40a5-2538-4c3f-ad36-05e3b9dc8538")
    Object lambda$andThen$1(Function p0, Object p1);

    @objid ("9e575351-cfdf-45c6-94ef-54d187c8e274")
    Object lambda$compose$0(Function p0, Object p1);

    @objid ("d381553e-da2f-477b-9faf-1807e3e45818")
    Object lambda$identity$2(Object p0);

}

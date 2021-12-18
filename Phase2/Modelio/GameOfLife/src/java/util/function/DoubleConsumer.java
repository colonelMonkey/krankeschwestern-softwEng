package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("57cb761b-b247-436b-a1e2-6e9788a0255c")
public interface DoubleConsumer {
    @objid ("fc4f9f6c-0efe-433a-a597-e589cd141d77")
    void accept(double p0);

    @objid ("a538821d-4502-43e7-b1c6-cd25b28bc974")
    DoubleConsumer andThen(DoubleConsumer p0);

    @objid ("c1fa6039-598a-4375-a3fe-43eb3a2420a3")
    void lambda$andThen$0(DoubleConsumer p0, double p1);

}

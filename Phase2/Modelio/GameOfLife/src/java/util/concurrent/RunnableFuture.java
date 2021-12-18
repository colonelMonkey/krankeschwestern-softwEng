package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1b56-0000-000000000000")
public interface RunnableFuture extends Runnable, Future {
    @objid ("0fa7591a-619f-45f6-91d9-28fae7d60610")
    void run();

}

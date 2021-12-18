package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2bc9-0000-000000000000")
public interface Lock {
    @objid ("8450047a-ea42-4338-8ca6-5425682fc121")
    void lock();

    @objid ("81630910-5ac7-4535-bf03-555f9189f591")
    void lockInterruptibly() throws InterruptedException;

    @objid ("bf680da0-4ded-4873-80ce-aa0e513081a4")
    Condition newCondition();

    @objid ("330c871a-108c-4650-9dbb-09453259430e")
    boolean tryLock();

    @objid ("16cbf09a-8ce1-45f1-9c1b-9cd68bd3efb3")
    boolean tryLock(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("ff9b0b80-198e-460c-8dfa-713e08fb9b7a")
    void unlock();

}

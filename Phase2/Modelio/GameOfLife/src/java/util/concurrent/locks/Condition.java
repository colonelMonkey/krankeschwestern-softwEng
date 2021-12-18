package java.util.concurrent.locks;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2bbd-0000-000000000000")
public interface Condition {
    @objid ("c4584c03-17ac-4b07-92c2-b8ae0a8231c7")
    void await() throws InterruptedException;

    @objid ("30c770c7-b3a0-4f0b-91ed-09e9f7ac7b14")
    boolean await(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("3801f41f-63c1-4e33-b347-223814bdc8d5")
    long awaitNanos(long p0) throws InterruptedException;

    @objid ("86767731-573d-4634-96da-784b351ff2d9")
    void awaitUninterruptibly();

    @objid ("2ce209ff-09be-48ee-95f6-b66b5f78d6ed")
    boolean awaitUntil(Date p0) throws InterruptedException;

    @objid ("792cc6a4-56dc-4294-bb09-53198bad953d")
    void signal();

    @objid ("7802f203-f7b9-4568-9a0c-9aae32318c1f")
    void signalAll();

}

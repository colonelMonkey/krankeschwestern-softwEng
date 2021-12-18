package java.util.concurrent;

import java.util.Collection;
import java.util.Queue;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2be6-0000-000000000000")
public interface BlockingQueue extends Queue {
    @objid ("b561a864-e6d1-4964-af97-72987a956773")
    boolean add(Object p0);

    @objid ("fd689959-7876-4022-8192-6ab03b8a8e8e")
    boolean contains(Object p0);

    @objid ("cce1321f-f43e-4590-8434-7d9a544f2216")
    int drainTo(Collection p0);

    @objid ("bf349fee-688f-4760-b232-98278c0480a4")
    int drainTo(Collection p0, int p1);

    @objid ("a9178722-a5c2-4014-ab83-dac44fabec93")
    boolean offer(Object p0, long p1, TimeUnit p2) throws InterruptedException;

    @objid ("01cefc34-edef-4cc4-8609-7f11d7631b57")
    boolean offer(Object p0);

    @objid ("ac07d93e-b6bb-4876-ae5e-34fafd42c011")
    Object poll(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("71195bab-7564-44b8-83cf-19529848241e")
    void put(Object p0) throws InterruptedException;

    @objid ("c8e35414-5586-4df9-9d0a-77ca1fc0c92e")
    int remainingCapacity();

    @objid ("17a861ec-0a03-4fbd-bc02-a5fe4e9b6d20")
    boolean remove(Object p0);

    @objid ("6683575f-fc1e-4b22-a6fa-af5c22645870")
    Object take() throws InterruptedException;

}

package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2be9-0000-000000000000")
public interface ScheduledExecutorService extends ExecutorService {
    @objid ("8b5d037a-868f-4f14-9551-c0825410219c")
    ScheduledFuture schedule(Runnable p0, long p1, TimeUnit p2);

    @objid ("6fdff26c-2a41-4ee3-b862-14404b7fc134")
    ScheduledFuture schedule(Callable p0, long p1, TimeUnit p2);

    @objid ("b6c75928-548a-4480-af0f-da384dd067d2")
    ScheduledFuture scheduleAtFixedRate(Runnable p0, long p1, long p2, TimeUnit p3);

    @objid ("c98d2185-44b1-4d5a-a11b-86415d59f2d2")
    ScheduledFuture scheduleWithFixedDelay(Runnable p0, long p1, long p2, TimeUnit p3);

}

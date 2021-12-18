package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c0f-0000-000000000000")
public interface CompletionService {
    @objid ("edae98ad-4ec0-4da9-842b-2309fc26284a")
    Future poll(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("46341eab-dd99-4ca2-a9f1-1a148f02b8af")
    Future poll();

    @objid ("57bbbbec-7c78-408a-9280-8d04dc890c59")
    Future submit(Runnable p0, Object p1);

    @objid ("f885146e-3f29-4c68-a6f8-daeef700e12a")
    Future submit(Callable p0);

    @objid ("fa08755c-de09-4090-89b4-057a916b03b1")
    Future take() throws InterruptedException;

}

package java.util.concurrent;

import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c1c-0000-000000000000")
public interface ExecutorService extends Executor {
    @objid ("b382c26d-49b5-4ba4-b3ce-302f23134596")
    boolean awaitTermination(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("b7a11096-382e-4e48-9f4a-713ce5f199b4")
    List invokeAll(Collection p0, long p1, TimeUnit p2) throws InterruptedException;

    @objid ("174bf14a-d72f-48b1-9d02-fa9ca29166c9")
    List invokeAll(Collection p0) throws InterruptedException;

    @objid ("48ff3658-e674-48fb-9eb6-64e6257ec427")
    Object invokeAny(Collection p0) throws ExecutionException, InterruptedException;

    @objid ("9707df98-365c-4529-9d10-a2bf66d1310a")
    Object invokeAny(Collection p0, long p1, TimeUnit p2) throws ExecutionException, InterruptedException, TimeoutException;

    @objid ("437f0696-f9dc-4d02-b983-987ea27b5bee")
    boolean isShutdown();

    @objid ("34dc8b55-03a5-4414-9f1d-c599f651dcde")
    boolean isTerminated();

    @objid ("9581dd9a-f56d-40d8-aea4-644e77468732")
    void shutdown();

    @objid ("481504e9-58fe-409a-88a7-790c4893d1fc")
    List shutdownNow();

    @objid ("301ee44d-df85-43fa-a271-218c8366d2bf")
    Future submit(Callable p0);

    @objid ("27135e55-a5b2-4154-b80c-6540d9b52e79")
    Future submit(Runnable p0, Object p1);

    @objid ("01abdce5-dade-4a33-9c59-b9b39b81fd99")
    Future submit(Runnable p0);

}

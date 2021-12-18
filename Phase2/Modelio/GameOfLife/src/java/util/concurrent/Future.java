package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ba5-0000-000000000000")
public interface Future {
    @objid ("7beca399-799c-4e25-90b3-bc274332951f")
    boolean cancel(boolean p0);

    @objid ("82f41c26-1838-4ab8-b476-55b2c274c820")
    Object get(long p0, TimeUnit p1) throws ExecutionException, InterruptedException, TimeoutException;

    @objid ("24886d24-2a00-4639-9e1c-a39d98981051")
    Object get() throws ExecutionException, InterruptedException;

    @objid ("e8f51e88-5d0e-42eb-a6e8-ef945b12c369")
    boolean isCancelled();

    @objid ("8704bacd-ab93-4851-9dbb-041288c3dca2")
    boolean isDone();

}

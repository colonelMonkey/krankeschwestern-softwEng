package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0006-a682-0000-000000000000")
public class ForkJoinPool extends AbstractExecutorService {
    @objid ("2580001c-0006-b0cf-0000-000000000000")
    public interface ForkJoinWorkerThreadFactory {
        @objid ("fce6a68d-d4f7-4518-961a-780e84d39b24")
        ForkJoinWorkerThread newThread(ForkJoinPool p0);

    }

    @objid ("2580001c-0006-b0e7-0000-000000000000")
    public interface ManagedBlocker {
        @objid ("48f74777-7974-4de2-9e01-f3c185416cde")
        boolean block() throws InterruptedException;

        @objid ("5dd35e8c-6fee-4649-8d3e-76a3d8ab44ef")
        boolean isReleasable();

    }

}

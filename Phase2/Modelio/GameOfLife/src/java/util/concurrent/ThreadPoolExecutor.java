package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2bec-0000-000000000000")
public class ThreadPoolExecutor extends AbstractExecutorService {
    @objid ("00d00398-0000-2bed-0000-000000000000")
    public static class AbortPolicy implements RejectedExecutionHandler {
    }

    @objid ("00d00398-0000-2bee-0000-000000000000")
    public static class CallerRunsPolicy implements RejectedExecutionHandler {
    }

    @objid ("00d00398-0000-2bef-0000-000000000000")
    public static class DiscardOldestPolicy implements RejectedExecutionHandler {
    }

    @objid ("00d00398-0000-2bf0-0000-000000000000")
    public static class DiscardPolicy implements RejectedExecutionHandler {
    }

}

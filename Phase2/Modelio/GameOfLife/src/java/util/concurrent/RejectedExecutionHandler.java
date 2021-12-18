package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2bfd-0000-000000000000")
public interface RejectedExecutionHandler {
    @objid ("adad30c3-3cfb-4cc1-8d15-d66a6aacd35b")
    void rejectedExecution(Runnable p0, ThreadPoolExecutor p1);

}

package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1b20-0000-000000000000")
public interface RunnableScheduledFuture extends RunnableFuture, ScheduledFuture {
    @objid ("942b39e5-21fb-4521-8f0b-df25811287c6")
    boolean isPeriodic();

}

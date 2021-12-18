package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c08-0000-000000000000")
public interface Delayed extends Comparable {
    @objid ("e3a05fa0-9565-43dc-8992-c427efcf3382")
    long getDelay(TimeUnit p0);

}

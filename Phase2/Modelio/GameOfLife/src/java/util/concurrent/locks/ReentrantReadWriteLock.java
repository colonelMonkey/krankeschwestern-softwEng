package java.util.concurrent.locks;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2bc2-0000-000000000000")
public class ReentrantReadWriteLock implements ReadWriteLock, Serializable {
    @objid ("00d00398-0000-2bc5-0000-000000000000")
    public static class ReadLock implements Lock, Serializable {
    }

    @objid ("00d00398-0000-2bc7-0000-000000000000")
    public static class WriteLock implements Lock, Serializable {
    }

}

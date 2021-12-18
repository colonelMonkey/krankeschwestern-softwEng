package java.lang;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b51-0000-000000000000")
public class Thread implements Runnable {
    @objid ("00d00398-0000-2b53-0000-000000000000")
    public interface UncaughtExceptionHandler {
        @objid ("1f8a70b6-983c-49ea-9aef-fcae6a0b88a7")
        void uncaughtException(Thread p0, Throwable p1);

    }

    @objid ("8e6ec97a-7ba7-46bb-8e6e-d01e6270ed6e")
    public enum State {
        ;
    }

}

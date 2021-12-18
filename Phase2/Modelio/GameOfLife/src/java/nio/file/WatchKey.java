package java.nio.file;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-4599-0000-000000000000")
public interface WatchKey {
    @objid ("cca6a9b6-c8e2-431e-9e75-26b355a45a7b")
    void cancel();

    @objid ("5389816e-187f-4ccd-ae37-7b6aa1e50a86")
    boolean isValid();

    @objid ("7ad053b4-76f6-40e9-a77b-39ab3a1ba727")
    List pollEvents();

    @objid ("81a1ac92-40d0-4660-92f1-876e301576a0")
    boolean reset();

    @objid ("12db030e-eaaa-410a-8695-98703f5a4e1e")
    Watchable watchable();

}

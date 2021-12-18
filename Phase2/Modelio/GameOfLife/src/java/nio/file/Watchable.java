package java.nio.file;

import java.io.IOException;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-14a0-0000-000000000000")
public interface Watchable {
    @objid ("075c40bb-6061-4527-8a10-8e46c15ba097")
    WatchKey register(WatchService p0, List<Kind> p1, List<Modifier> p2) throws IOException;

    @objid ("a9704e93-ab61-4513-9671-14bf1e920e97")
    WatchKey register(WatchService p0, List<Kind> p1) throws IOException;

}

package java.lang.management;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0001-2434-0000-000000000000")
public interface PlatformLoggingMXBean extends PlatformManagedObject {
    @objid ("302f516b-f02d-49cf-8053-e86b3ad765b0")
    String getLoggerLevel(String p0);

    @objid ("392db6fe-93cb-4a8b-b852-1be80780345c")
    List getLoggerNames();

    @objid ("dcddc3b0-58ab-415f-b467-935de7fcef9c")
    String getParentLoggerName(String p0);

    @objid ("2ff04cf3-455d-4b56-9d2a-09dbf5e26296")
    void setLoggerLevel(String p0, String p1);

}

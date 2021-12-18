package java.util.logging;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2cb4-0000-000000000000")
public interface LoggingMXBean {
    @objid ("438c909c-cfa2-43a7-b7a1-0001ba40076b")
    String getLoggerLevel(String p0);

    @objid ("b50c9f5b-6f92-488f-821f-e6f6723b3c9e")
    List getLoggerNames();

    @objid ("a2b44a95-d7c6-4933-83e1-e3b08fd084c1")
    String getParentLoggerName(String p0);

    @objid ("12766a6a-88fb-4dd3-9aa4-3504c6d440c1")
    void setLoggerLevel(String p0, String p1);

}

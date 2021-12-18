package java.util.regex;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2c93-0000-000000000000")
public interface MatchResult {
    @objid ("54ee8a2d-ee41-4322-9759-912b2218ea38")
    int end();

    @objid ("df0d94f9-e6c8-4e9e-b095-e8068a088954")
    int end(int p0);

    @objid ("907d3496-60b9-4254-8367-dd8b69d1b70c")
    String group();

    @objid ("9bbb4f71-28ef-4987-9385-474337cfdd76")
    String group(int p0);

    @objid ("1b580f8d-51fa-4111-9317-b09c3fc2b352")
    int groupCount();

    @objid ("6d8cea6a-b634-462c-96da-008d32d495d3")
    int start(int p0);

    @objid ("ed2e21e3-4abf-4fa2-ba50-194db12c2b4e")
    int start();

}

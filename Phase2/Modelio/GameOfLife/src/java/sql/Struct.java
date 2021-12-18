package java.sql;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e87-0000-000000000000")
public interface Struct {
    @objid ("b87e53c1-2b73-4a79-8432-2346128eec71")
    List<Object> getAttributes() throws SQLException;

    @objid ("e810954b-8b46-4833-909b-9a36c45bf760")
    List<Object> getAttributes(Map p0) throws SQLException;

    @objid ("31605b53-8061-45cd-8475-e5c54ef09520")
    String getSQLTypeName() throws SQLException;

}

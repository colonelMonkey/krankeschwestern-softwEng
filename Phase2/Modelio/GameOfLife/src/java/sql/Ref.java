package java.sql;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e74-0000-000000000000")
public interface Ref {
    @objid ("d41653e1-477b-4419-8d83-08d29ded610d")
    String getBaseTypeName() throws SQLException;

    @objid ("8191f874-052d-48aa-9cc2-cee73707e1d0")
    Object getObject() throws SQLException;

    @objid ("d6b69ea7-9cc8-4abc-8a85-2d078d1bc2b6")
    Object getObject(Map p0) throws SQLException;

    @objid ("458fc27b-a935-49ce-8020-5476abbe37b3")
    void setObject(Object p0) throws SQLException;

}

package java.sql;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e8a-0000-000000000000")
public interface SQLData {
    @objid ("4fed84c6-5db7-4f05-897b-816fafc1f045")
    String getSQLTypeName() throws SQLException;

    @objid ("bc22f97b-9323-4e2c-81b6-8399b002776a")
    void readSQL(SQLInput p0, String p1) throws SQLException;

    @objid ("9fd5008e-40fc-4787-a8d6-f19517b74b0c")
    void writeSQL(SQLOutput p0) throws SQLException;

}

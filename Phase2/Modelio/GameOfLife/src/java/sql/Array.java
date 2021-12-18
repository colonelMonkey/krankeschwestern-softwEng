package java.sql;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e81-0000-000000000000")
public interface Array {
    @objid ("7559789d-03ce-4d19-840c-93c507655f3b")
    void free() throws SQLException;

    @objid ("16513a2f-0911-4607-be0b-62df86dfb5ee")
    Object getArray(long p0, int p1) throws SQLException;

    @objid ("e4b52523-d3ae-4a40-bf00-e913154ce69b")
    Object getArray(Map p0) throws SQLException;

    @objid ("f9722252-e96e-4c60-a2ab-85b928b76bbd")
    Object getArray() throws SQLException;

    @objid ("0e752d14-f215-4b31-b788-df449f7ff37d")
    Object getArray(long p0, int p1, Map p2) throws SQLException;

    @objid ("da6cac03-09f3-4102-9e82-6de1f594be83")
    int getBaseType() throws SQLException;

    @objid ("bb156b9a-ede0-46bc-a5bf-2e34dc40550d")
    String getBaseTypeName() throws SQLException;

    @objid ("a2d85f0c-b938-49d5-af6d-dbae8c87645c")
    ResultSet getResultSet(long p0, int p1, Map p2) throws SQLException;

    @objid ("81e549bf-c898-49f5-bd0f-ab36ad068076")
    ResultSet getResultSet(long p0, int p1) throws SQLException;

    @objid ("945d544b-84dd-4427-a974-564b2b2330de")
    ResultSet getResultSet(Map p0) throws SQLException;

    @objid ("08126f2f-bebc-4498-a860-2d4a1e0c22a8")
    ResultSet getResultSet() throws SQLException;

}

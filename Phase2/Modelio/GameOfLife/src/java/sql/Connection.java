package java.sql;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e79-0000-000000000000")
public interface Connection extends Wrapper, AutoCloseable {
    @objid ("0002c565-8175-47c5-bf45-e3fccca07219")
    void abort(Executor p0) throws SQLException;

    @objid ("0eafeffe-b075-4f1e-8a42-0bddb01e76d6")
    void clearWarnings() throws SQLException;

    @objid ("b0834644-438d-4cc8-85e3-36b57c3088b9")
    void close() throws SQLException;

    @objid ("2bd63828-4f8a-48fa-bf17-f2b486775e46")
    void commit() throws SQLException;

    @objid ("a8287ae4-4856-4ab2-abfa-30fe4ee6050b")
    Array createArrayOf(String p0, List<Object> p1) throws SQLException;

    @objid ("5fdee112-39fc-4b73-87a5-248138e8c76f")
    Blob createBlob() throws SQLException;

    @objid ("27b8226f-3c5f-40d7-be7f-dabda7642aa1")
    Clob createClob() throws SQLException;

    @objid ("736271e1-a8e5-4bee-957b-0fe0a0fbb3f9")
    NClob createNClob() throws SQLException;

    @objid ("3939a926-d282-454e-875b-15dd97c7a1c5")
    SQLXML createSQLXML() throws SQLException;

    @objid ("3e49acb3-16c8-476f-ac9d-4cc05510c168")
    Statement createStatement() throws SQLException;

    @objid ("9dd10150-2f06-435c-80b4-d69163b328c8")
    Statement createStatement(int p0, int p1, int p2) throws SQLException;

    @objid ("7aedeeb9-e378-4431-a672-17379b3b1c1e")
    Statement createStatement(int p0, int p1) throws SQLException;

    @objid ("86561629-7d99-4e2a-af2b-d8cc57965bea")
    Struct createStruct(String p0, List<Object> p1) throws SQLException;

    @objid ("8ac1d489-f2a8-4df1-9c94-dd1b66b27b15")
    boolean getAutoCommit() throws SQLException;

    @objid ("8f409e8a-9d6b-451c-9b06-385a335972d9")
    String getCatalog() throws SQLException;

    @objid ("c7e5ecba-dafd-4d01-8cfa-e644d9657f70")
    String getClientInfo(String p0) throws SQLException;

    @objid ("496eff5e-eb6f-4f42-a2d5-275a9b848a27")
    Properties getClientInfo() throws SQLException;

    @objid ("6698f69d-bc87-4eb3-bc8d-8fd346c8f7d2")
    int getHoldability() throws SQLException;

    @objid ("5553062d-2332-4509-9e5d-fa6b7b71e377")
    DatabaseMetaData getMetaData() throws SQLException;

    @objid ("bd1a74fd-05bc-49d3-aa49-f18b6c8f7561")
    int getNetworkTimeout() throws SQLException;

    @objid ("de248716-900b-4f1e-ad45-d566f66a6697")
    String getSchema() throws SQLException;

    @objid ("e73aeb59-f136-4546-b8d4-1da33770e82b")
    int getTransactionIsolation() throws SQLException;

    @objid ("50418c86-08f0-4386-9cfe-293e361aab83")
    Map getTypeMap() throws SQLException;

    @objid ("1068757e-b1b2-4336-a0c6-f64a7646b7cb")
    SQLWarning getWarnings() throws SQLException;

    @objid ("14e5177e-c16c-4a6c-964f-3f82d37b23b7")
    boolean isClosed() throws SQLException;

    @objid ("a39d0e20-1880-4b30-b5ff-861067a86566")
    boolean isReadOnly() throws SQLException;

    @objid ("705f96db-504f-4e30-a5a1-e39b638c4835")
    boolean isValid(int p0) throws SQLException;

    @objid ("38a57777-1cae-42ca-bc27-6702780a97b5")
    String nativeSQL(String p0) throws SQLException;

    @objid ("5f56f76e-e573-4826-ac35-f78bd679eaf6")
    CallableStatement prepareCall(String p0, int p1, int p2) throws SQLException;

    @objid ("eb946ff0-bdfc-4bef-9e79-61c76e3b49ef")
    CallableStatement prepareCall(String p0, int p1, int p2, int p3) throws SQLException;

    @objid ("e01465a4-df81-4acd-ad8a-4c7fe5c4e3d4")
    CallableStatement prepareCall(String p0) throws SQLException;

    @objid ("6ef18c6b-bbf1-403d-90f2-963d789d4f55")
    PreparedStatement prepareStatement(String p0) throws SQLException;

    @objid ("42acaa99-0d58-4655-b463-4895c1e72e5f")
    PreparedStatement prepareStatement(String p0, List<Integer> p1) throws SQLException;

    @objid ("1c737070-d533-43bd-b48d-064f10ff25d5")
    PreparedStatement prepareStatement(String p0, int p1) throws SQLException;

    @objid ("6bbc5712-2b76-42ef-b65d-6caf349bfe3c")
    PreparedStatement prepareStatement(String p0, List<String> p1) throws SQLException;

    @objid ("32964e66-bbe4-462f-9a8d-909e1bc019da")
    PreparedStatement prepareStatement(String p0, int p1, int p2, int p3) throws SQLException;

    @objid ("550e4baa-6d1c-4e12-8f56-a44aaacc8339")
    PreparedStatement prepareStatement(String p0, int p1, int p2) throws SQLException;

    @objid ("b4d13653-d31e-4e95-8d01-d5ce4331a107")
    void releaseSavepoint(Savepoint p0) throws SQLException;

    @objid ("fada9e50-3291-4beb-b634-6c56771b569a")
    void rollback() throws SQLException;

    @objid ("5c02f0ba-c779-41bb-83d3-dbdd4bd06d52")
    void rollback(Savepoint p0) throws SQLException;

    @objid ("86554b15-f0dc-4aa7-a66c-083ffbb1e5b4")
    void setAutoCommit(boolean p0) throws SQLException;

    @objid ("fc5798a4-0b04-4ee4-9fa6-b292016646b4")
    void setCatalog(String p0) throws SQLException;

    @objid ("2bc11d26-a632-461d-a346-27f02cad1a5c")
    void setClientInfo(String p0, String p1) throws SQLClientInfoException;

    @objid ("680018f0-da65-4cd0-a9d5-c5f34edbef25")
    void setClientInfo(Properties p0) throws SQLClientInfoException;

    @objid ("eb503b71-69b3-4e79-a0fb-6a44257b47b4")
    void setHoldability(int p0) throws SQLException;

    @objid ("ddc54399-b9f8-486b-8287-d2c5ce13d636")
    void setNetworkTimeout(Executor p0, int p1) throws SQLException;

    @objid ("6d13dec7-8303-4fc3-a0f5-34981dbde431")
    void setReadOnly(boolean p0) throws SQLException;

    @objid ("48b35bf9-fded-4a1f-8e4a-b110080e4b38")
    Savepoint setSavepoint(String p0) throws SQLException;

    @objid ("3d7951a4-b7a7-41c5-b353-9e13b717dd19")
    Savepoint setSavepoint() throws SQLException;

    @objid ("e5cd2846-f888-4dd6-968f-b7d32c03fd1f")
    void setSchema(String p0) throws SQLException;

    @objid ("4e712609-7b80-4787-8ffb-da3250bbd6ca")
    void setTransactionIsolation(int p0) throws SQLException;

    @objid ("b626d88f-618a-48b7-9d1f-bfc1e7fa560f")
    void setTypeMap(Map p0) throws SQLException;

}

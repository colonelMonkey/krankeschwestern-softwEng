package java.sql;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e83-0000-000000000000")
public interface Statement extends Wrapper, AutoCloseable {
    @objid ("5d1fee98-9342-40ac-8a96-0a2ce4f6a2e6")
    void addBatch(String p0) throws SQLException;

    @objid ("d185b1c7-4cd0-449f-8ac8-8fb1652062ee")
    void cancel() throws SQLException;

    @objid ("4ed6f25e-ef55-4ef2-b7bb-14c8bbfdbf33")
    void clearBatch() throws SQLException;

    @objid ("4ad166de-f51f-4714-a2e2-ebc27324b81c")
    void clearWarnings() throws SQLException;

    @objid ("11a7af1b-f9ff-4928-a26d-734fd97a468c")
    void close() throws SQLException;

    @objid ("86035d06-bebe-491a-b5a3-199d58963f97")
    void closeOnCompletion() throws SQLException;

    @objid ("29b3134c-14e5-4fe1-991a-8ef7c601ce38")
    boolean execute(String p0, int p1) throws SQLException;

    @objid ("13cc3937-4c0a-4430-9d0c-0866c5029c38")
    boolean execute(String p0, List<String> p1) throws SQLException;

    @objid ("98b6282d-6f8f-4b38-a7b7-2a5e1b3dd909")
    boolean execute(String p0, List<Integer> p1) throws SQLException;

    @objid ("e4761a5e-d1ce-416c-8738-36d23899788b")
    boolean execute(String p0) throws SQLException;

    @objid ("874504e7-575f-4c9c-ab73-82ccad4610d1")
    List<Integer> executeBatch() throws SQLException;

    @objid ("196569b7-3d67-4806-af11-2a2b29d3c405")
    List<Long> executeLargeBatch() throws SQLException;

    @objid ("0866d25c-7fec-454a-aad3-c62d281b154c")
    long executeLargeUpdate(String p0) throws SQLException;

    @objid ("b5980a44-d93d-4dbc-a2a1-b0111d602f2b")
    long executeLargeUpdate(String p0, List<Integer> p1) throws SQLException;

    @objid ("7f9916e9-10a7-40b0-8ca7-0cbdd6850f1f")
    long executeLargeUpdate(String p0, List<String> p1) throws SQLException;

    @objid ("f227f2d5-39d8-4319-ac3e-3e2867755953")
    long executeLargeUpdate(String p0, int p1) throws SQLException;

    @objid ("faecf3bf-d380-4454-b653-931b998a3d05")
    ResultSet executeQuery(String p0) throws SQLException;

    @objid ("d0828e6f-9bc2-43a5-8d85-b1abe05c5cdc")
    int executeUpdate(String p0) throws SQLException;

    @objid ("29889b6e-1d6c-49fc-ab31-e8fd4bd7cf18")
    int executeUpdate(String p0, List<String> p1) throws SQLException;

    @objid ("a4b0f49a-0f01-41c4-afb8-505ec8bfd05a")
    int executeUpdate(String p0, List<Integer> p1) throws SQLException;

    @objid ("df69687f-94d2-4950-9f5f-fc57a684d7d6")
    int executeUpdate(String p0, int p1) throws SQLException;

    @objid ("39acd1c5-0ffa-4338-9087-af2333dd97fe")
    Connection getConnection() throws SQLException;

    @objid ("64dedc80-fb7f-4b10-9b59-bbc3f379ba71")
    int getFetchDirection() throws SQLException;

    @objid ("b284df7b-17e8-4bd1-822a-8ac1ed901184")
    int getFetchSize() throws SQLException;

    @objid ("1551c00c-6167-4905-b327-875455e47034")
    ResultSet getGeneratedKeys() throws SQLException;

    @objid ("2be97b03-0b70-492d-a5b2-b1ec88770962")
    long getLargeMaxRows() throws SQLException;

    @objid ("bebada9e-7b63-4a58-987f-4c5065c3408f")
    long getLargeUpdateCount() throws SQLException;

    @objid ("5ac5776d-021a-4abc-864d-33732947c7f0")
    int getMaxFieldSize() throws SQLException;

    @objid ("80af8c33-c868-45df-b558-00f68c5f3412")
    int getMaxRows() throws SQLException;

    @objid ("e1fcb79d-7bff-4eb8-86f0-45cbcd6c4aae")
    boolean getMoreResults() throws SQLException;

    @objid ("dcb88636-8b8a-44a2-887c-7cb216bae243")
    boolean getMoreResults(int p0) throws SQLException;

    @objid ("85687b5f-32c6-44b9-a24d-d9b0573609f4")
    int getQueryTimeout() throws SQLException;

    @objid ("37ebdcdc-c346-41be-ab1f-36df4ff51276")
    ResultSet getResultSet() throws SQLException;

    @objid ("8bd325c1-4882-4afe-a5d3-cb3a1864266a")
    int getResultSetConcurrency() throws SQLException;

    @objid ("70445156-254e-46c3-add9-9b380160db31")
    int getResultSetHoldability() throws SQLException;

    @objid ("24d7136c-ceb5-461d-a20c-515f76b9bcee")
    int getResultSetType() throws SQLException;

    @objid ("6bc9416d-e755-4add-8b5d-4c8fb652abc6")
    int getUpdateCount() throws SQLException;

    @objid ("7de110d4-8c7f-46c1-bbc5-272b9492ac33")
    SQLWarning getWarnings() throws SQLException;

    @objid ("deea08be-6d12-4986-8040-c469b981bd51")
    boolean isCloseOnCompletion() throws SQLException;

    @objid ("2508723e-6acd-418a-b7b9-c1c6cfce5bb8")
    boolean isClosed() throws SQLException;

    @objid ("025ae60d-9873-4b13-9685-a7ac75d11c6e")
    boolean isPoolable() throws SQLException;

    @objid ("953d6652-da7a-4dcd-80be-507087243e75")
    void setCursorName(String p0) throws SQLException;

    @objid ("716dea5e-5d7d-41e7-afb6-e6ead88d4d44")
    void setEscapeProcessing(boolean p0) throws SQLException;

    @objid ("92dd36a9-2302-4cd9-b35c-be4743f543e5")
    void setFetchDirection(int p0) throws SQLException;

    @objid ("5f9b165d-9b6b-42a1-8b00-e284082efdd2")
    void setFetchSize(int p0) throws SQLException;

    @objid ("9cb4d0a5-675f-4101-9298-c8a75cab262f")
    void setLargeMaxRows(long p0) throws SQLException;

    @objid ("f9e040ed-539d-43fd-8020-162f3ba3487f")
    void setMaxFieldSize(int p0) throws SQLException;

    @objid ("85e4fc7c-f252-4d25-841f-8e9fd4c1e5de")
    void setMaxRows(int p0) throws SQLException;

    @objid ("18e5dc5e-ff6b-4b4e-aa61-442e51f6d1f4")
    void setPoolable(boolean p0) throws SQLException;

    @objid ("7ae2c359-fde1-4de7-b91e-f281168dadc5")
    void setQueryTimeout(int p0) throws SQLException;

}

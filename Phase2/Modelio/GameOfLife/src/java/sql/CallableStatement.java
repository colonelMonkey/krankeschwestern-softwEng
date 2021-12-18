package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e7a-0000-000000000000")
public interface CallableStatement extends PreparedStatement {
    @objid ("f66db261-680f-4841-8ed8-f7fa2cf8d816")
    Array getArray(String p0) throws SQLException;

    @objid ("b49866ad-ccc7-4158-8893-967a43a44aae")
    Array getArray(int p0) throws SQLException;

    @objid ("172f1847-dbb0-4ed5-845f-2ec93b0b9513")
    BigDecimal getBigDecimal(int p0) throws SQLException;

    @objid ("9b6965f0-9880-41ab-847c-2aa2dd34ffbf")
    BigDecimal getBigDecimal(int p0, int p1) throws SQLException;

    @objid ("fc537f7e-5a73-4a65-bada-b6882ae065d1")
    BigDecimal getBigDecimal(String p0) throws SQLException;

    @objid ("06540fe3-0d55-4108-9913-becf23acd44b")
    Blob getBlob(int p0) throws SQLException;

    @objid ("1ca472fc-7840-4ecc-972b-f22466fc1fb5")
    Blob getBlob(String p0) throws SQLException;

    @objid ("ad00a854-2c41-4a78-90ab-84282e92aecf")
    boolean getBoolean(int p0) throws SQLException;

    @objid ("ec7a96e6-1787-48f0-b4e2-55bab8dcb9d0")
    boolean getBoolean(String p0) throws SQLException;

    @objid ("8d6f3be1-aeb1-4917-82d4-94af1aeda4af")
    byte getByte(String p0) throws SQLException;

    @objid ("3224bce2-8092-4dc1-9fa4-994e4e84fb7f")
    byte getByte(int p0) throws SQLException;

    @objid ("53546cb2-c455-4873-b952-bbdd4d35d34e")
    List<Byte> getBytes(String p0) throws SQLException;

    @objid ("09941c9f-db94-4b79-b699-b73416862f4d")
    List<Byte> getBytes(int p0) throws SQLException;

    @objid ("59705078-030d-441d-b29e-e648ce43dc5c")
    Reader getCharacterStream(String p0) throws SQLException;

    @objid ("a8b12fb3-b3aa-43d8-bb26-52b7af3641c3")
    Reader getCharacterStream(int p0) throws SQLException;

    @objid ("e453cfb7-8797-440e-bbc6-770399aa0846")
    Clob getClob(int p0) throws SQLException;

    @objid ("b8e0f7f9-089c-4467-9644-55683d9f4b3f")
    Clob getClob(String p0) throws SQLException;

    @objid ("ee007c1e-2abf-4dda-86ef-ff171c461ae3")
    Date getDate(String p0, Calendar p1) throws SQLException;

    @objid ("0b52326a-7575-4809-a8de-0a72dfa47617")
    Date getDate(String p0) throws SQLException;

    @objid ("9c25c526-40fd-469e-87d2-0bf8fc236eb6")
    Date getDate(int p0) throws SQLException;

    @objid ("3f203c13-08ac-4479-9574-13e122757c18")
    Date getDate(int p0, Calendar p1) throws SQLException;

    @objid ("4e6f100b-8195-4fdf-acaf-42749333e17f")
    double getDouble(int p0) throws SQLException;

    @objid ("6ced7ab7-99e5-460d-9c75-5d0a8c709a34")
    double getDouble(String p0) throws SQLException;

    @objid ("71fceceb-9d21-42d6-9fcc-251b1acdcf7b")
    float getFloat(int p0) throws SQLException;

    @objid ("5d80e2e6-b031-4d37-b489-a2a60fe542eb")
    float getFloat(String p0) throws SQLException;

    @objid ("f4f5805a-7867-49e1-8785-9bd7791df121")
    int getInt(int p0) throws SQLException;

    @objid ("3ed6e8d4-d5c7-48c4-8db9-72e3d70fef33")
    int getInt(String p0) throws SQLException;

    @objid ("a160368e-9eda-41c4-9d43-1df4908879e9")
    long getLong(String p0) throws SQLException;

    @objid ("85f7d77a-ef3c-484c-9896-8188e9d53c3c")
    long getLong(int p0) throws SQLException;

    @objid ("b9d2bb4c-cca7-4ebe-b856-f270af44cefc")
    Reader getNCharacterStream(int p0) throws SQLException;

    @objid ("7f139590-5189-44fd-8bee-61df950e02e8")
    Reader getNCharacterStream(String p0) throws SQLException;

    @objid ("2a68877c-8810-44f5-932b-777e0b002c04")
    NClob getNClob(String p0) throws SQLException;

    @objid ("adeb59dd-f6fb-44d1-9408-af5d4da18997")
    NClob getNClob(int p0) throws SQLException;

    @objid ("29e0e949-50b3-4b42-801c-fc4e78fc1eca")
    String getNString(int p0) throws SQLException;

    @objid ("f0a035be-6f9e-49dc-bbab-fa27269ecc1a")
    String getNString(String p0) throws SQLException;

    @objid ("fc15a26c-9f90-450c-aad3-b82f5964f455")
    Object getObject(int p0, Map p1) throws SQLException;

    @objid ("9358d073-68a2-421a-8060-3d9b3c42f42d")
    Object getObject(int p0, Class p1) throws SQLException;

    @objid ("1eea978a-b286-4c02-8370-0b9c4250cd63")
    Object getObject(String p0) throws SQLException;

    @objid ("29523cbf-ce84-47e5-9d1a-e4cd6366a9d3")
    Object getObject(int p0) throws SQLException;

    @objid ("3c193e77-93fc-4315-b579-7444f0d28d9b")
    Object getObject(String p0, Class p1) throws SQLException;

    @objid ("dbb769a3-38c5-4f37-bd5c-aa7ca7ab7770")
    Object getObject(String p0, Map p1) throws SQLException;

    @objid ("a4413bb3-699c-4c08-8e0f-2164798f4413")
    Ref getRef(int p0) throws SQLException;

    @objid ("1ea318b5-55e6-4c04-9253-6338bebaced6")
    Ref getRef(String p0) throws SQLException;

    @objid ("4b97a924-4da9-49ed-9734-45693e1d5192")
    RowId getRowId(String p0) throws SQLException;

    @objid ("1ddbf2eb-93fa-46a4-8c07-30daa88539df")
    RowId getRowId(int p0) throws SQLException;

    @objid ("1544dc58-53f5-454e-af66-2eb4070b5153")
    SQLXML getSQLXML(String p0) throws SQLException;

    @objid ("86a8c633-32f7-4a31-b124-b63f7335ad6c")
    SQLXML getSQLXML(int p0) throws SQLException;

    @objid ("6b27d388-f364-4e11-b29f-1b857ba78ba5")
    short getShort(String p0) throws SQLException;

    @objid ("6d3ccf00-a08f-48fe-b9aa-8c0bf780071a")
    short getShort(int p0) throws SQLException;

    @objid ("c67fd5e2-aa82-4002-91d4-899b671e1527")
    String getString(String p0) throws SQLException;

    @objid ("979ba78a-85ef-41aa-abd8-41721628b1e2")
    String getString(int p0) throws SQLException;

    @objid ("4f6c8fd1-e07d-4cea-931f-6d686da9f284")
    Time getTime(int p0, Calendar p1) throws SQLException;

    @objid ("74be28e1-b811-4633-aadf-b1b0f292026c")
    Time getTime(int p0) throws SQLException;

    @objid ("174a6ce0-e435-46b2-83d2-e6f2a520106e")
    Time getTime(String p0) throws SQLException;

    @objid ("2c6d8b34-51a2-430f-8dad-4d74f5e26968")
    Time getTime(String p0, Calendar p1) throws SQLException;

    @objid ("8119de9e-b65a-47a1-9691-4a4026d6c5a7")
    Timestamp getTimestamp(int p0) throws SQLException;

    @objid ("d297d640-8261-4bbc-adea-b2aeee63531a")
    Timestamp getTimestamp(String p0, Calendar p1) throws SQLException;

    @objid ("22fa9146-dc67-4be4-a516-763c7a7179f8")
    Timestamp getTimestamp(String p0) throws SQLException;

    @objid ("61edaa63-4ee6-449d-bcd0-f0745cae461f")
    Timestamp getTimestamp(int p0, Calendar p1) throws SQLException;

    @objid ("c3c13d6e-6ab4-4b0d-ae4d-136bb63a596f")
    URL getURL(String p0) throws SQLException;

    @objid ("ea3a6cb2-8767-4119-a7ac-cf9d795d7016")
    URL getURL(int p0) throws SQLException;

    @objid ("171c7bd8-675b-4361-8405-19c6dc2d34c2")
    void registerOutParameter(int p0, SQLType p1) throws SQLException;

    @objid ("fe6d329c-d5c7-4d0d-8fdf-1f3bdbc034f3")
    void registerOutParameter(String p0, SQLType p1, String p2) throws SQLException;

    @objid ("8d2898aa-c562-40b8-a326-e319182eee95")
    void registerOutParameter(String p0, SQLType p1) throws SQLException;

    @objid ("117e546e-4699-48ad-b919-05ff14418ab3")
    void registerOutParameter(int p0, SQLType p1, int p2) throws SQLException;

    @objid ("eb645cfd-c5da-4774-a6f7-49ee6fa461e0")
    void registerOutParameter(String p0, SQLType p1, int p2) throws SQLException;

    @objid ("9eabeffe-fde1-41f1-852b-22c6a970ed3c")
    void registerOutParameter(int p0, SQLType p1, String p2) throws SQLException;

    @objid ("0c861cd4-5eea-4edb-8b31-4b66b3dad268")
    void registerOutParameter(int p0, int p1, String p2) throws SQLException;

    @objid ("0fbac796-c635-43d7-8b1b-21d0310bfb0f")
    void registerOutParameter(String p0, int p1) throws SQLException;

    @objid ("e0c8eda4-860a-4a4c-9c29-5dcd69684ea9")
    void registerOutParameter(String p0, int p1, int p2) throws SQLException;

    @objid ("5adf1331-53d3-4d53-a7f5-a61d56171e30")
    void registerOutParameter(String p0, int p1, String p2) throws SQLException;

    @objid ("f83ba4c5-f840-4322-bacc-bbadd4e6b262")
    void registerOutParameter(int p0, int p1, int p2) throws SQLException;

    @objid ("3212be13-5313-43da-8039-d2e55b6d5469")
    void registerOutParameter(int p0, int p1) throws SQLException;

    @objid ("d1b8d894-721b-43c8-916c-db7c3c46be6c")
    void setAsciiStream(String p0, InputStream p1) throws SQLException;

    @objid ("6790feff-ad63-409f-94b3-6aa14a0e1b6d")
    void setAsciiStream(String p0, InputStream p1, int p2) throws SQLException;

    @objid ("42e657a7-07dd-442d-8015-4da581e56cfd")
    void setAsciiStream(String p0, InputStream p1, long p2) throws SQLException;

    @objid ("822e99cc-11ef-49ed-b3c4-758c04722f5a")
    void setBigDecimal(String p0, BigDecimal p1) throws SQLException;

    @objid ("5045db86-f25a-4e68-9223-bbf73cdd277f")
    void setBinaryStream(String p0, InputStream p1, int p2) throws SQLException;

    @objid ("8149c424-bc10-42fc-8309-c5e80b0e5561")
    void setBinaryStream(String p0, InputStream p1) throws SQLException;

    @objid ("89ccebc6-0c33-471c-b013-3391aa3d48d8")
    void setBinaryStream(String p0, InputStream p1, long p2) throws SQLException;

    @objid ("c5ad6cf6-b0b1-47c2-bb23-a4352eaff04a")
    void setBlob(String p0, InputStream p1, long p2) throws SQLException;

    @objid ("0fe206ec-bfb0-43f2-a6bc-8481e5bf537e")
    void setBlob(String p0, Blob p1) throws SQLException;

    @objid ("7dd6f3ce-3491-4110-a88c-8039d94cc185")
    void setBlob(String p0, InputStream p1) throws SQLException;

    @objid ("c5d88da4-c62c-40d4-910b-a2bf1e21eac7")
    void setBoolean(String p0, boolean p1) throws SQLException;

    @objid ("b713e619-3a59-4868-81de-a27fa39cf426")
    void setByte(String p0, byte p1) throws SQLException;

    @objid ("e96c39fd-708b-45d1-9f5f-4fd5f4a6c22e")
    void setBytes(String p0, List<Byte> p1) throws SQLException;

    @objid ("57c84b26-07bb-473e-ac62-a62d01c13e79")
    void setCharacterStream(String p0, Reader p1, int p2) throws SQLException;

    @objid ("e113e795-28b4-41b0-a90c-219dcb3e3012")
    void setCharacterStream(String p0, Reader p1, long p2) throws SQLException;

    @objid ("baae8c1a-65e1-4ab8-b5eb-de483d8d3ff8")
    void setCharacterStream(String p0, Reader p1) throws SQLException;

    @objid ("c7e43858-0025-45be-867e-047b1a2a0a1e")
    void setClob(String p0, Reader p1) throws SQLException;

    @objid ("f73b0fb4-7bbd-449f-8b65-601ee3e79861")
    void setClob(String p0, Reader p1, long p2) throws SQLException;

    @objid ("375c0f22-9718-4a0f-832f-bde25d65a1c3")
    void setClob(String p0, Clob p1) throws SQLException;

    @objid ("1927fa8a-0e5b-4e31-9b42-b09934bc9764")
    void setDate(String p0, Date p1) throws SQLException;

    @objid ("ff025c0a-937a-4d78-99e9-111a2fa24ffd")
    void setDate(String p0, Date p1, Calendar p2) throws SQLException;

    @objid ("7364fe8d-8028-45ac-b1eb-0c69fcb55b69")
    void setDouble(String p0, double p1) throws SQLException;

    @objid ("f4be3506-ebd7-4a78-9abe-9d41693864c8")
    void setFloat(String p0, float p1) throws SQLException;

    @objid ("3bb5c547-a0f5-4255-8cdb-0ce2e5137a24")
    void setInt(String p0, int p1) throws SQLException;

    @objid ("f697d412-eba0-4b2c-840a-04431c52f0f3")
    void setLong(String p0, long p1) throws SQLException;

    @objid ("8c4dfa9b-de1b-4490-8703-55b949a3ccdc")
    void setNCharacterStream(String p0, Reader p1) throws SQLException;

    @objid ("30617293-7eab-4fdb-a11a-364538bfbffa")
    void setNCharacterStream(String p0, Reader p1, long p2) throws SQLException;

    @objid ("dd1f43f6-2496-45ec-a39a-88a62dff0158")
    void setNClob(String p0, NClob p1) throws SQLException;

    @objid ("9a18743f-9681-4ae9-b8e7-04af0933b7cf")
    void setNClob(String p0, Reader p1, long p2) throws SQLException;

    @objid ("6dd4fd09-f62b-45ea-aa30-3c5fdcabffa2")
    void setNClob(String p0, Reader p1) throws SQLException;

    @objid ("0ec2f397-e5ae-4881-9cbc-0d99cb369d73")
    void setNString(String p0, String p1) throws SQLException;

    @objid ("3576b69b-8630-4cff-9ccc-5afed71691b9")
    void setNull(String p0, int p1) throws SQLException;

    @objid ("f3aef0e6-108c-46c9-8af5-8afa0acad23e")
    void setNull(String p0, int p1, String p2) throws SQLException;

    @objid ("858c1ee7-64eb-498f-8292-253610e1e809")
    void setObject(String p0, Object p1, int p2) throws SQLException;

    @objid ("2b89f42d-cfc9-40c9-a553-832efb28b299")
    void setObject(String p0, Object p1, SQLType p2) throws SQLException;

    @objid ("3227ab7b-f33d-4b5b-8eca-b6b3cdc39301")
    void setObject(String p0, Object p1, SQLType p2, int p3) throws SQLException;

    @objid ("422825b9-331f-46b0-922c-f3bd6f7d5ceb")
    void setObject(String p0, Object p1) throws SQLException;

    @objid ("e12272d8-cbd6-4221-a75b-e967b00693fa")
    void setObject(String p0, Object p1, int p2, int p3) throws SQLException;

    @objid ("c6ef2bb5-de7b-4352-9fa5-99fe7329043d")
    void setRowId(String p0, RowId p1) throws SQLException;

    @objid ("76ba8fc3-7339-419b-b6c1-7677ff70fc18")
    void setSQLXML(String p0, SQLXML p1) throws SQLException;

    @objid ("afaaaafa-08c0-409c-88cc-de4db89161ae")
    void setShort(String p0, short p1) throws SQLException;

    @objid ("df0e7549-a47b-4204-b23b-8f6fd24d4694")
    void setString(String p0, String p1) throws SQLException;

    @objid ("473a9551-cc34-4ebc-a986-0a3a211b5d46")
    void setTime(String p0, Time p1) throws SQLException;

    @objid ("85d9fb12-14b7-48aa-8db5-77ebb53c2b3e")
    void setTime(String p0, Time p1, Calendar p2) throws SQLException;

    @objid ("45823e93-0bdc-4db3-99d8-6ea4871a2ee5")
    void setTimestamp(String p0, Timestamp p1) throws SQLException;

    @objid ("452b387a-3400-4519-b8a6-8a98edfd81f9")
    void setTimestamp(String p0, Timestamp p1, Calendar p2) throws SQLException;

    @objid ("417a6edd-b2c1-4eb0-8f9e-45d575e85ec8")
    void setURL(String p0, URL p1) throws SQLException;

    @objid ("b54e4b02-8576-4cf4-8ccf-eebbee7f2943")
    boolean wasNull() throws SQLException;

}

package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e72-0000-000000000000")
public interface PreparedStatement extends Statement {
    @objid ("85ab88f6-a8fa-4dd0-97d1-a4e76136c2f1")
    void addBatch() throws SQLException;

    @objid ("0cc71113-0bc0-4150-93b7-76f6a67c32cc")
    void clearParameters() throws SQLException;

    @objid ("3b6efc31-ebfd-4469-be78-ee3425625f31")
    boolean execute() throws SQLException;

    @objid ("768e778f-351e-4f60-b918-d4ee9f31f173")
    long executeLargeUpdate() throws SQLException;

    @objid ("22dbe9ea-624e-457a-8fd8-35069dd3576b")
    ResultSet executeQuery() throws SQLException;

    @objid ("beee2089-b023-4be4-8a93-70703f642beb")
    int executeUpdate() throws SQLException;

    @objid ("51c27a55-773b-42a1-b57b-9ca406d91c21")
    ResultSetMetaData getMetaData() throws SQLException;

    @objid ("aa796e71-9830-4af1-a325-5454ac63f03b")
    ParameterMetaData getParameterMetaData() throws SQLException;

    @objid ("3d6f8425-f6b4-48a6-819d-3d019c8e1274")
    void setArray(int p0, Array p1) throws SQLException;

    @objid ("25172b92-3885-4216-b29d-45e8e64e5356")
    void setAsciiStream(int p0, InputStream p1) throws SQLException;

    @objid ("41d02b87-1e31-43c7-bf49-103f9021451d")
    void setAsciiStream(int p0, InputStream p1, long p2) throws SQLException;

    @objid ("67335ff9-6679-44f7-a3a8-c7edc1326a07")
    void setAsciiStream(int p0, InputStream p1, int p2) throws SQLException;

    @objid ("a4492b25-26d3-4e66-8a32-5b9a415e859c")
    void setBigDecimal(int p0, BigDecimal p1) throws SQLException;

    @objid ("46b8c737-c253-41df-9c67-a736db4a087d")
    void setBinaryStream(int p0, InputStream p1, long p2) throws SQLException;

    @objid ("4567d84c-0f60-42f6-8007-1f6a3947db39")
    void setBinaryStream(int p0, InputStream p1, int p2) throws SQLException;

    @objid ("5df25d93-e7fd-41f4-aed5-837469463cfb")
    void setBinaryStream(int p0, InputStream p1) throws SQLException;

    @objid ("4d866246-787e-400d-b6f3-9e2df00f3c75")
    void setBlob(int p0, InputStream p1) throws SQLException;

    @objid ("a65e693e-56fc-4f92-9df1-23f24991b6db")
    void setBlob(int p0, InputStream p1, long p2) throws SQLException;

    @objid ("f4d90741-5f3d-403c-b7fa-7ad8fb23b21e")
    void setBlob(int p0, Blob p1) throws SQLException;

    @objid ("812d097a-b2e4-48d0-add4-80c1f26e5887")
    void setBoolean(int p0, boolean p1) throws SQLException;

    @objid ("9b5b1c42-703b-4d5a-be8f-ff2cfb968994")
    void setByte(int p0, byte p1) throws SQLException;

    @objid ("82c27f1b-e717-4fba-b160-1ab3d2c26449")
    void setBytes(int p0, List<Byte> p1) throws SQLException;

    @objid ("14665c67-a94f-4af5-98bb-bacac47eff7a")
    void setCharacterStream(int p0, Reader p1, int p2) throws SQLException;

    @objid ("5594d335-574a-46cb-8d9a-c23d657b0dca")
    void setCharacterStream(int p0, Reader p1) throws SQLException;

    @objid ("32170382-ce6e-4ac8-b5b4-9928e9ae4b78")
    void setCharacterStream(int p0, Reader p1, long p2) throws SQLException;

    @objid ("33c9cf20-5e3a-4c44-8bc1-cea34b8b3f3f")
    void setClob(int p0, Reader p1, long p2) throws SQLException;

    @objid ("9ede5a1c-d429-4de0-8365-f699c3bb25b9")
    void setClob(int p0, Clob p1) throws SQLException;

    @objid ("e52b0645-e333-42cc-b0fb-1becd46f2162")
    void setClob(int p0, Reader p1) throws SQLException;

    @objid ("81fef2aa-591c-4dce-aa78-517a47e74c99")
    void setDate(int p0, Date p1) throws SQLException;

    @objid ("0596727e-34cf-4980-a9a1-95d778e91c76")
    void setDate(int p0, Date p1, Calendar p2) throws SQLException;

    @objid ("6c1d3eb5-23b6-459f-aca8-c71d2f30ede8")
    void setDouble(int p0, double p1) throws SQLException;

    @objid ("06e98285-a317-41bf-ba47-4ffefeaa8798")
    void setFloat(int p0, float p1) throws SQLException;

    @objid ("e1b306b5-cf03-46c5-98ef-47aab79a2a30")
    void setInt(int p0, int p1) throws SQLException;

    @objid ("4fe89efc-decf-4104-a119-60e8a960e063")
    void setLong(int p0, long p1) throws SQLException;

    @objid ("7262dbd5-194e-4aa7-a76b-8a0a341da321")
    void setNCharacterStream(int p0, Reader p1) throws SQLException;

    @objid ("a7cf8eb8-4d74-4533-a385-045c8fdedbc8")
    void setNCharacterStream(int p0, Reader p1, long p2) throws SQLException;

    @objid ("5ed33e33-f234-439f-90e8-9d8e626518d0")
    void setNClob(int p0, NClob p1) throws SQLException;

    @objid ("f806ef90-6feb-41bd-9cc7-72d2538d917a")
    void setNClob(int p0, Reader p1) throws SQLException;

    @objid ("880affb7-0a71-4bfa-bb50-705581cbc146")
    void setNClob(int p0, Reader p1, long p2) throws SQLException;

    @objid ("8294a8eb-76d9-418d-845a-22774b7a15f3")
    void setNString(int p0, String p1) throws SQLException;

    @objid ("f986b74c-7d55-4e80-9925-2d9c47ca8950")
    void setNull(int p0, int p1) throws SQLException;

    @objid ("71ed2a6b-c2c2-477e-bf51-0fcb62d4066f")
    void setNull(int p0, int p1, String p2) throws SQLException;

    @objid ("40406072-2c30-487f-9613-6b9d30598de6")
    void setObject(int p0, Object p1, SQLType p2, int p3) throws SQLException;

    @objid ("68586fa1-231a-465a-a0ee-2e84f453065a")
    void setObject(int p0, Object p1, int p2) throws SQLException;

    @objid ("cdd07ead-2681-497c-9875-3ef26a4e1906")
    void setObject(int p0, Object p1, int p2, int p3) throws SQLException;

    @objid ("8c72b267-fa93-40e2-8b0e-ccde422f8bfa")
    void setObject(int p0, Object p1) throws SQLException;

    @objid ("90fe7f82-a79c-4a2b-9eca-66a147184822")
    void setObject(int p0, Object p1, SQLType p2) throws SQLException;

    @objid ("cd17adb5-17df-45b8-8902-88268a9fb3ac")
    void setRef(int p0, Ref p1) throws SQLException;

    @objid ("54d2019f-3a0e-431b-b7c5-162e15f69c38")
    void setRowId(int p0, RowId p1) throws SQLException;

    @objid ("92ad453e-13f7-4a90-9121-537cbecf7332")
    void setSQLXML(int p0, SQLXML p1) throws SQLException;

    @objid ("80ef54b8-d849-41f0-8eab-48f7579b4604")
    void setShort(int p0, short p1) throws SQLException;

    @objid ("5b4125c2-f6e0-4608-aa0a-988cc6b207b0")
    void setString(int p0, String p1) throws SQLException;

    @objid ("231d1842-2a50-4f2d-b378-ed08df8d20d7")
    void setTime(int p0, Time p1) throws SQLException;

    @objid ("1a20b43a-bf82-498b-9d0e-9ca1c4204bb0")
    void setTime(int p0, Time p1, Calendar p2) throws SQLException;

    @objid ("c9c13a64-2677-47d5-919f-cb6aad4d351f")
    void setTimestamp(int p0, Timestamp p1) throws SQLException;

    @objid ("03089f99-3fbb-4aaa-8cd5-97ddb7dcdd31")
    void setTimestamp(int p0, Timestamp p1, Calendar p2) throws SQLException;

    @objid ("f910af22-38fe-49ec-a47d-ab619bcea406")
    void setURL(int p0, URL p1) throws SQLException;

    @objid ("9ef385e2-b9cb-4965-a61c-f398e13c10c3")
    void setUnicodeStream(int p0, InputStream p1, int p2) throws SQLException;

}

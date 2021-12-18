package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e75-0000-000000000000")
public interface SQLInput {
    @objid ("95c8b8a4-0507-42d0-a67c-14dcc0c3a796")
    Array readArray() throws SQLException;

    @objid ("1e3acbce-9fb6-401a-876a-2d95f2836aad")
    InputStream readAsciiStream() throws SQLException;

    @objid ("36cad6df-3a0e-4154-a7cb-1d19586c4113")
    BigDecimal readBigDecimal() throws SQLException;

    @objid ("44ef5939-cc46-4744-8168-5afcd140ce59")
    InputStream readBinaryStream() throws SQLException;

    @objid ("7a8d5377-cd3b-450d-ac3f-d35e40f6a691")
    Blob readBlob() throws SQLException;

    @objid ("b10836d4-e60e-401e-8d8b-3457dbe3ddcf")
    boolean readBoolean() throws SQLException;

    @objid ("7826ed3a-bb10-4ce8-8bae-51f106642b44")
    byte readByte() throws SQLException;

    @objid ("a49d95d2-3cd3-4838-baa2-291b2d544ddd")
    List<Byte> readBytes() throws SQLException;

    @objid ("459a20a9-7ff4-4b00-9cf7-474af0354cc1")
    Reader readCharacterStream() throws SQLException;

    @objid ("fef45b05-fdab-4163-8b8f-239e54f86655")
    Clob readClob() throws SQLException;

    @objid ("e196a046-5c3e-49bf-b2fb-345e8bd43d6d")
    Date readDate() throws SQLException;

    @objid ("dd6cad4c-011d-4c5e-a55b-bfce2489de3d")
    double readDouble() throws SQLException;

    @objid ("0f87704a-cb6d-4048-8514-b96a092f3335")
    float readFloat() throws SQLException;

    @objid ("97228ca3-62b1-4096-8c46-612fc7d80e32")
    int readInt() throws SQLException;

    @objid ("3790d2e7-a75e-472f-aad6-9812b31755e4")
    long readLong() throws SQLException;

    @objid ("aa298af5-6cfc-4b14-8822-8f692ee1a510")
    NClob readNClob() throws SQLException;

    @objid ("922501f8-493e-4413-bd6c-267016b30752")
    String readNString() throws SQLException;

    @objid ("fd8cc609-ff65-4ffa-8afd-9ff5d2a6ffca")
    Object readObject(Class p0) throws SQLException;

    @objid ("8dc55ddb-1618-41bf-9e54-fb9366603b26")
    Object readObject() throws SQLException;

    @objid ("5179c6a1-2588-4ed2-806a-8bf2e54cadde")
    Ref readRef() throws SQLException;

    @objid ("61605f60-1b4a-42ee-bc20-39a36f8c5461")
    RowId readRowId() throws SQLException;

    @objid ("57d3b00f-a483-48b2-8020-ef5b8b432c8e")
    SQLXML readSQLXML() throws SQLException;

    @objid ("a7a23c0d-cc98-4ef7-a1ac-8a82b279f3d6")
    short readShort() throws SQLException;

    @objid ("a371829f-6d35-45de-b4d6-e931989dab0c")
    String readString() throws SQLException;

    @objid ("11b8c20f-aa90-40f6-a4be-448031f8624a")
    Time readTime() throws SQLException;

    @objid ("b39a384d-bc9e-464c-96d8-14865fe77de0")
    Timestamp readTimestamp() throws SQLException;

    @objid ("95e27f61-07f4-4915-adbf-7b239788aaa6")
    URL readURL() throws SQLException;

    @objid ("81b6399e-14f8-4b81-8687-e7b85c494d68")
    boolean wasNull() throws SQLException;

}

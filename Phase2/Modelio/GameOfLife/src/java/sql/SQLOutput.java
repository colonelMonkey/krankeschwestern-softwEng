package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e78-0000-000000000000")
public interface SQLOutput {
    @objid ("c7dbb986-cc30-48e6-9537-230ad103e57d")
    void writeArray(Array p0) throws SQLException;

    @objid ("6368de18-cbd9-4a48-9914-aca4443eb456")
    void writeAsciiStream(InputStream p0) throws SQLException;

    @objid ("1bb5cb05-8d18-4cc2-87a1-8fb071b1d2c3")
    void writeBigDecimal(BigDecimal p0) throws SQLException;

    @objid ("48519b33-32b0-4560-be73-6a5253c5e1ca")
    void writeBinaryStream(InputStream p0) throws SQLException;

    @objid ("9ec08e28-7a2e-45b8-8334-6248446e74cf")
    void writeBlob(Blob p0) throws SQLException;

    @objid ("5a6d66ff-11ba-4942-a42d-ea1405884297")
    void writeBoolean(boolean p0) throws SQLException;

    @objid ("c2129ac8-f7a0-49ac-8ca8-1ef3897576c7")
    void writeByte(byte p0) throws SQLException;

    @objid ("60102786-3a69-4929-a610-cf29ce02f437")
    void writeBytes(List<Byte> p0) throws SQLException;

    @objid ("204092ad-4fb3-490d-984c-46bc825afe67")
    void writeCharacterStream(Reader p0) throws SQLException;

    @objid ("1845ba2f-50f3-4380-8233-c3dbe70a4127")
    void writeClob(Clob p0) throws SQLException;

    @objid ("dbd0eee3-6f72-4573-8ee9-32267675d372")
    void writeDate(Date p0) throws SQLException;

    @objid ("1e0edb41-96e1-436a-b4cd-f1a0ea366d85")
    void writeDouble(double p0) throws SQLException;

    @objid ("d79a285e-6ba4-442e-b2d0-c1407098b804")
    void writeFloat(float p0) throws SQLException;

    @objid ("b81bc037-f076-4940-9a5c-4f732a6f062c")
    void writeInt(int p0) throws SQLException;

    @objid ("b96f4ba1-f803-4974-8701-ce85c5f6d66a")
    void writeLong(long p0) throws SQLException;

    @objid ("c063d09b-bb50-4e9a-9aba-266e8b72a7a3")
    void writeNClob(NClob p0) throws SQLException;

    @objid ("e057a07e-dd8a-4cbe-b198-7c5810d82b94")
    void writeNString(String p0) throws SQLException;

    @objid ("19d653e3-9cb4-4535-b3fd-04d45ba707b6")
    void writeObject(Object p0, SQLType p1) throws SQLException;

    @objid ("49ca365e-d2ad-48ea-954f-8481163e4703")
    void writeObject(SQLData p0) throws SQLException;

    @objid ("17802f57-db21-46c7-b92e-f22d2a220df4")
    void writeRef(Ref p0) throws SQLException;

    @objid ("fc8f72c0-99ea-4402-bba7-37f3216b8ffa")
    void writeRowId(RowId p0) throws SQLException;

    @objid ("627625d1-84e7-4559-b083-e3894b29d818")
    void writeSQLXML(SQLXML p0) throws SQLException;

    @objid ("d1d45d32-c8e3-40cd-8007-42af3b902c91")
    void writeShort(short p0) throws SQLException;

    @objid ("5cd98eba-4120-443f-8636-85ca29a963de")
    void writeString(String p0) throws SQLException;

    @objid ("47d555d2-54fc-46e8-b5fc-f5a073b57dd5")
    void writeStruct(Struct p0) throws SQLException;

    @objid ("167fd14b-9b31-42ef-a153-b168b483cc40")
    void writeTime(Time p0) throws SQLException;

    @objid ("f5849b12-8e5b-45af-8b4b-1f01f626f0f4")
    void writeTimestamp(Timestamp p0) throws SQLException;

    @objid ("0c9be394-9d40-481f-8da2-bf71d4dd73e5")
    void writeURL(URL p0) throws SQLException;

}

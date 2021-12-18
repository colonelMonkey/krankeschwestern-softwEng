package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e82-0000-000000000000")
public interface ResultSet extends Wrapper, AutoCloseable {
    @objid ("c3160260-1d78-4b64-9cbb-39f8df199f20")
    boolean absolute(int p0) throws SQLException;

    @objid ("3e00c08f-6471-4aa2-a906-b05a205d25db")
    void afterLast() throws SQLException;

    @objid ("dafc9183-4489-4f53-98d4-a7da668b6f1a")
    void beforeFirst() throws SQLException;

    @objid ("d9066056-ae3d-444b-b614-0c14059771a4")
    void cancelRowUpdates() throws SQLException;

    @objid ("fba84bb3-801b-4593-a0c4-6c4e7e883900")
    void clearWarnings() throws SQLException;

    @objid ("a277921b-a770-44e1-ac8e-5f79fbfaf0b2")
    void close() throws SQLException;

    @objid ("e6870517-eb0f-41a6-9c2b-6c75c53d1532")
    void deleteRow() throws SQLException;

    @objid ("6e157b4d-8d97-4ad8-a89d-eb398a7db045")
    int findColumn(String p0) throws SQLException;

    @objid ("ee3fe162-c9b5-49cd-8ab1-18b9346e9fa7")
    boolean first() throws SQLException;

    @objid ("7750be04-4b80-4141-b0d3-1296acd0280d")
    Array getArray(int p0) throws SQLException;

    @objid ("9ed1a81e-bd37-4bfe-a300-ed3a41bc091e")
    Array getArray(String p0) throws SQLException;

    @objid ("90cdc85f-fa2e-401b-b809-5bf3f8b42289")
    InputStream getAsciiStream(int p0) throws SQLException;

    @objid ("964081ed-f2a0-4368-ac69-dca7271eb236")
    InputStream getAsciiStream(String p0) throws SQLException;

    @objid ("d89facba-c6e2-4a9f-854e-ab8bf5fb2bea")
    BigDecimal getBigDecimal(String p0) throws SQLException;

    @objid ("d5c5c386-527c-4252-af62-9af9c505ba08")
    BigDecimal getBigDecimal(int p0, int p1) throws SQLException;

    @objid ("452c1ab5-ba7a-4580-a9b9-b073a72408a7")
    BigDecimal getBigDecimal(String p0, int p1) throws SQLException;

    @objid ("6f33f4bc-9b03-4608-bb00-efc1e35000b8")
    BigDecimal getBigDecimal(int p0) throws SQLException;

    @objid ("7e67e5be-7d62-46b0-a801-a3769c82225b")
    InputStream getBinaryStream(int p0) throws SQLException;

    @objid ("a5185e86-697c-481e-9c52-e17c0c58df9c")
    InputStream getBinaryStream(String p0) throws SQLException;

    @objid ("c8e49e1b-adf4-44f8-94c4-83e96783a5ab")
    Blob getBlob(String p0) throws SQLException;

    @objid ("5ba2077c-ffb6-4c66-ae4a-6e14623bbeb1")
    Blob getBlob(int p0) throws SQLException;

    @objid ("92965054-4d29-44b6-bafc-69d15ec5791a")
    boolean getBoolean(int p0) throws SQLException;

    @objid ("7e7329e0-5720-4187-a5bb-53913e39a01f")
    boolean getBoolean(String p0) throws SQLException;

    @objid ("f5fa1876-1c0a-4dea-a708-535becce712f")
    byte getByte(String p0) throws SQLException;

    @objid ("b63d89d0-8eb3-49ea-9637-fec484b3803b")
    byte getByte(int p0) throws SQLException;

    @objid ("08db9ee2-34b9-4ceb-ab6c-090976803651")
    List<Byte> getBytes(int p0) throws SQLException;

    @objid ("7fbdf24e-0483-42d0-8815-f07926cf1e6e")
    List<Byte> getBytes(String p0) throws SQLException;

    @objid ("3e78c5e7-261b-4cc0-b1de-3b4fd601aede")
    Reader getCharacterStream(String p0) throws SQLException;

    @objid ("d5711bd3-1b41-4e67-bfe9-d89304e0ae65")
    Reader getCharacterStream(int p0) throws SQLException;

    @objid ("1dd79993-20de-4be7-b4fa-bca319bd8d1b")
    Clob getClob(String p0) throws SQLException;

    @objid ("8852ddda-3f4e-406a-9a67-6998fcb88a97")
    Clob getClob(int p0) throws SQLException;

    @objid ("9194947c-7c00-48db-9fc8-898686141a72")
    int getConcurrency() throws SQLException;

    @objid ("503b75fa-aa20-4acc-9c27-b23865b8b69a")
    String getCursorName() throws SQLException;

    @objid ("8f054ea6-02e8-4e22-90de-48a7522732ac")
    Date getDate(String p0) throws SQLException;

    @objid ("aa3ccd7a-581d-4dd0-b39c-8904b586b50a")
    Date getDate(String p0, Calendar p1) throws SQLException;

    @objid ("38df9fae-b149-40ae-9506-d3269b6a2b8a")
    Date getDate(int p0) throws SQLException;

    @objid ("590281dc-45dd-4503-9932-f2cad7edbb34")
    Date getDate(int p0, Calendar p1) throws SQLException;

    @objid ("37b58a87-1a02-4c82-ab6c-d075924b261c")
    double getDouble(String p0) throws SQLException;

    @objid ("5b8ddc37-4a12-40b8-8b4e-bc9c8b9cd0bc")
    double getDouble(int p0) throws SQLException;

    @objid ("ca260bda-8c83-4e54-ae97-a129d0cf1ffe")
    int getFetchDirection() throws SQLException;

    @objid ("386a9dd9-36b2-4d1e-b411-a21f65aa93b9")
    int getFetchSize() throws SQLException;

    @objid ("5305dba4-7989-4a7c-af69-5881b1309520")
    float getFloat(String p0) throws SQLException;

    @objid ("e56de1c6-efde-40bf-aaad-8ed9f121947c")
    float getFloat(int p0) throws SQLException;

    @objid ("9d08ad5f-948c-419c-8f51-a123fecb6bbb")
    int getHoldability() throws SQLException;

    @objid ("bf34a68b-b188-4f2f-8346-f6fc8428269e")
    int getInt(int p0) throws SQLException;

    @objid ("e5ca3e9b-2421-4710-8a44-9c8f98923a9c")
    int getInt(String p0) throws SQLException;

    @objid ("51ccb91c-0286-41f3-a286-e1c5b996f702")
    long getLong(String p0) throws SQLException;

    @objid ("00b696c6-4f40-422b-9f16-acab7e1dfa2b")
    long getLong(int p0) throws SQLException;

    @objid ("5f5bc3cd-2fc6-47db-bac8-c253f52a2216")
    ResultSetMetaData getMetaData() throws SQLException;

    @objid ("065f9e31-7ed4-487e-bab4-fc69ead730b9")
    Reader getNCharacterStream(int p0) throws SQLException;

    @objid ("275c2601-243f-4ad5-a713-f6c87702bd29")
    Reader getNCharacterStream(String p0) throws SQLException;

    @objid ("0daabfdb-3b20-42c2-9bba-cb563c83dac2")
    NClob getNClob(String p0) throws SQLException;

    @objid ("01a8dca5-fd54-419c-8d67-10e1c91fe06b")
    NClob getNClob(int p0) throws SQLException;

    @objid ("cf41bbfd-0037-4eb0-a9cc-8c5c8f970389")
    String getNString(int p0) throws SQLException;

    @objid ("1384646e-5183-45bc-8a14-c7ea5ab61b8d")
    String getNString(String p0) throws SQLException;

    @objid ("f68cecdc-39c9-4ba1-a437-9b5aa3a24632")
    Object getObject(int p0, Map p1) throws SQLException;

    @objid ("a143be83-8d76-41ca-83dc-1a10806afec5")
    Object getObject(String p0) throws SQLException;

    @objid ("c2e503c3-6b38-42f6-8014-3e8d7ec7a1de")
    Object getObject(int p0) throws SQLException;

    @objid ("3f3b1b34-6a15-4560-8379-4c348fabdcc1")
    Object getObject(String p0, Map p1) throws SQLException;

    @objid ("0c479540-acc1-407f-9c94-cccb7462a45b")
    Object getObject(int p0, Class p1) throws SQLException;

    @objid ("fa3fb52b-9d72-4c73-a806-3d0064544d72")
    Object getObject(String p0, Class p1) throws SQLException;

    @objid ("a59a90ca-ca05-4cbd-97e1-548cb4c2f83c")
    Ref getRef(String p0) throws SQLException;

    @objid ("07564694-8c5c-468d-9cf8-bef7a23fde07")
    Ref getRef(int p0) throws SQLException;

    @objid ("9fe697b5-be28-4f05-a76f-4f5c7ee14a67")
    int getRow() throws SQLException;

    @objid ("e850e2db-1902-4fd1-8217-e7d54c0e4175")
    RowId getRowId(String p0) throws SQLException;

    @objid ("a9a84afd-670e-4c30-b032-b6b246acce8a")
    RowId getRowId(int p0) throws SQLException;

    @objid ("441dcb4f-0570-4acd-acc1-d68118ad69f9")
    SQLXML getSQLXML(int p0) throws SQLException;

    @objid ("c0c08c49-d363-4e46-ab47-6d141f8587fb")
    SQLXML getSQLXML(String p0) throws SQLException;

    @objid ("1f1320b0-ec9a-4dd6-96df-2ace4603c891")
    short getShort(int p0) throws SQLException;

    @objid ("987879a6-324a-4440-bf01-9e84094affa3")
    short getShort(String p0) throws SQLException;

    @objid ("691bb56c-80d6-410b-8868-6981293f076f")
    Statement getStatement() throws SQLException;

    @objid ("15e3fa6a-9efe-49dc-9fde-e86d68ebd7dd")
    String getString(String p0) throws SQLException;

    @objid ("fd215f51-0cbd-4b65-b930-ee08688c16fe")
    String getString(int p0) throws SQLException;

    @objid ("d56901ac-9a77-4a40-a187-ecff1de507ab")
    Time getTime(int p0, Calendar p1) throws SQLException;

    @objid ("d1055039-b67a-43b6-a9ae-4056079b5063")
    Time getTime(String p0, Calendar p1) throws SQLException;

    @objid ("45c7dc6e-6c71-4069-a4be-d1c27c053765")
    Time getTime(String p0) throws SQLException;

    @objid ("53018507-1fe1-44ca-be85-8c7c8418eb26")
    Time getTime(int p0) throws SQLException;

    @objid ("762a5b69-8910-44ae-955c-5780cc76c788")
    Timestamp getTimestamp(int p0) throws SQLException;

    @objid ("59aac367-e707-4778-9667-0d7b42ae1d5d")
    Timestamp getTimestamp(String p0) throws SQLException;

    @objid ("a83b1ecc-5770-42da-bd14-c803960db230")
    Timestamp getTimestamp(String p0, Calendar p1) throws SQLException;

    @objid ("d64cd967-7677-45d3-8762-9e86cf3d442a")
    Timestamp getTimestamp(int p0, Calendar p1) throws SQLException;

    @objid ("b811f477-9845-42fe-b3bb-3b2a49f8a415")
    int getType() throws SQLException;

    @objid ("ae282b4c-f9ed-4650-b361-1b21a1c5487d")
    URL getURL(String p0) throws SQLException;

    @objid ("a263b34e-e19f-493d-987e-5d00e5f98d13")
    URL getURL(int p0) throws SQLException;

    @objid ("7ca790e1-f574-424e-9d80-06af36791c30")
    InputStream getUnicodeStream(int p0) throws SQLException;

    @objid ("39ce8988-59f2-4582-b759-d98a6c6b07ea")
    InputStream getUnicodeStream(String p0) throws SQLException;

    @objid ("321f484b-a665-40d0-8420-8de2b7cccfa2")
    SQLWarning getWarnings() throws SQLException;

    @objid ("53d6534e-f1c9-4631-93a3-11f3f74ccc2b")
    void insertRow() throws SQLException;

    @objid ("846174df-ae6e-41bd-9f21-0b6c388c8e10")
    boolean isAfterLast() throws SQLException;

    @objid ("bdf5bed4-a07b-4e19-b70a-e61da01201e5")
    boolean isBeforeFirst() throws SQLException;

    @objid ("5bb379ba-9678-44d5-9f4d-a01c9883c8e2")
    boolean isClosed() throws SQLException;

    @objid ("3adde0e8-71bf-487e-98d3-795b41dc5b34")
    boolean isFirst() throws SQLException;

    @objid ("4fd60d0a-99f6-4977-87f8-d10341b326c7")
    boolean isLast() throws SQLException;

    @objid ("638eca41-8b83-4975-a55f-45dbc49c3d3a")
    boolean last() throws SQLException;

    @objid ("b2856ec5-2961-490d-aba4-a96ae83164bf")
    void moveToCurrentRow() throws SQLException;

    @objid ("34fcd016-f653-4ebd-9002-d55d3f987be2")
    void moveToInsertRow() throws SQLException;

    @objid ("1482a223-d358-4ce0-8fe6-e53d334549d3")
    boolean next() throws SQLException;

    @objid ("2cc0fceb-7ec4-45a9-aac5-4ddd6f0d6134")
    boolean previous() throws SQLException;

    @objid ("4b1b0de5-565d-4624-baaa-9f32de9c43f3")
    void refreshRow() throws SQLException;

    @objid ("59a35233-0a18-4683-b7b1-caedce707acb")
    boolean relative(int p0) throws SQLException;

    @objid ("db0b2314-26bf-48b2-94f6-886f83c1d728")
    boolean rowDeleted() throws SQLException;

    @objid ("f5d22bec-0ffb-44b0-b372-f22693edc336")
    boolean rowInserted() throws SQLException;

    @objid ("a98c049d-e733-43ba-95ec-b048f7a0570c")
    boolean rowUpdated() throws SQLException;

    @objid ("8da995d3-9769-4e19-aa8a-355bb8d92cd8")
    void setFetchDirection(int p0) throws SQLException;

    @objid ("107c8e12-6e12-47ea-8bea-6787a1ce484d")
    void setFetchSize(int p0) throws SQLException;

    @objid ("690f25cb-9a3b-42cc-95aa-66bccefb8164")
    void updateArray(int p0, Array p1) throws SQLException;

    @objid ("4059ee24-ccdc-475d-90ec-e59dd04e156d")
    void updateArray(String p0, Array p1) throws SQLException;

    @objid ("fc5ac15b-410d-47d8-93c1-831d1dd8364c")
    void updateAsciiStream(String p0, InputStream p1, int p2) throws SQLException;

    @objid ("4478afd7-d0b2-4412-a69a-dcfb4f038fcf")
    void updateAsciiStream(int p0, InputStream p1) throws SQLException;

    @objid ("5b3394ee-8351-4e2a-8f8b-f6942ab528fe")
    void updateAsciiStream(int p0, InputStream p1, long p2) throws SQLException;

    @objid ("400789c4-0388-4ca1-96ef-99076764e000")
    void updateAsciiStream(String p0, InputStream p1) throws SQLException;

    @objid ("b2a0078e-7070-4839-8779-ce035cba9ef5")
    void updateAsciiStream(int p0, InputStream p1, int p2) throws SQLException;

    @objid ("ee4cdb6b-4778-4079-8ee8-1a68ab5b4c99")
    void updateAsciiStream(String p0, InputStream p1, long p2) throws SQLException;

    @objid ("e2310823-ca39-4015-8f0b-7c9f1d63525b")
    void updateBigDecimal(String p0, BigDecimal p1) throws SQLException;

    @objid ("a2405717-dad9-4530-863a-b93874a8b446")
    void updateBigDecimal(int p0, BigDecimal p1) throws SQLException;

    @objid ("192b7dd2-cd80-49b2-b19a-5d5ed8bc4c61")
    void updateBinaryStream(int p0, InputStream p1) throws SQLException;

    @objid ("0e2e1188-e634-4027-aeb1-46fde67a1bb0")
    void updateBinaryStream(String p0, InputStream p1, int p2) throws SQLException;

    @objid ("720dfe9d-cf9d-4332-be2f-b25c01a18036")
    void updateBinaryStream(String p0, InputStream p1, long p2) throws SQLException;

    @objid ("346a00f4-a96d-4928-b571-1e970964dfba")
    void updateBinaryStream(int p0, InputStream p1, long p2) throws SQLException;

    @objid ("27526d0f-ca5d-4057-adf6-35fa3480f8c1")
    void updateBinaryStream(int p0, InputStream p1, int p2) throws SQLException;

    @objid ("4435c716-1306-45a7-9670-52e85e18355f")
    void updateBinaryStream(String p0, InputStream p1) throws SQLException;

    @objid ("85eb2ff5-6daf-46be-bacc-7ae47841944f")
    void updateBlob(String p0, InputStream p1) throws SQLException;

    @objid ("f9140a60-4003-4095-b45f-54761da9a7b5")
    void updateBlob(int p0, InputStream p1, long p2) throws SQLException;

    @objid ("6f27eac6-f27a-40ac-ab53-3b22f429446d")
    void updateBlob(int p0, InputStream p1) throws SQLException;

    @objid ("0791bd71-e45d-40aa-8c4a-b9f69c5c2ff1")
    void updateBlob(String p0, InputStream p1, long p2) throws SQLException;

    @objid ("6a91dd37-3158-4496-a2ca-f9b0eb4a1637")
    void updateBlob(int p0, Blob p1) throws SQLException;

    @objid ("02fe6597-a755-4de1-8967-7aac400b79f9")
    void updateBlob(String p0, Blob p1) throws SQLException;

    @objid ("88f16ae8-e4e3-4c3a-827d-e50a4dddecdd")
    void updateBoolean(String p0, boolean p1) throws SQLException;

    @objid ("4684570b-6601-4be7-a474-8206eddc05f5")
    void updateBoolean(int p0, boolean p1) throws SQLException;

    @objid ("ebbe26ce-f4b3-4a21-ab7b-561b6cdf2c30")
    void updateByte(int p0, byte p1) throws SQLException;

    @objid ("5d967545-ff16-4587-a17d-e4a2dd298808")
    void updateByte(String p0, byte p1) throws SQLException;

    @objid ("5c4dfbd4-9e5f-44de-860e-d249ce3082a5")
    void updateBytes(String p0, List<Byte> p1) throws SQLException;

    @objid ("f55d02d3-0450-46ce-b794-e27fa864fa6a")
    void updateBytes(int p0, List<Byte> p1) throws SQLException;

    @objid ("bf38fe61-3f24-4c3b-9f00-ff4aba8aee04")
    void updateCharacterStream(int p0, Reader p1, long p2) throws SQLException;

    @objid ("741ff5a1-1c57-4882-8560-7ae120815873")
    void updateCharacterStream(int p0, Reader p1, int p2) throws SQLException;

    @objid ("ddf80397-3d11-48d2-b9d4-239c52696e2c")
    void updateCharacterStream(String p0, Reader p1, int p2) throws SQLException;

    @objid ("1cb80ab2-1362-41df-b39d-88bae5c078db")
    void updateCharacterStream(int p0, Reader p1) throws SQLException;

    @objid ("138669c3-a773-454d-a8cf-4deb2f680ff0")
    void updateCharacterStream(String p0, Reader p1) throws SQLException;

    @objid ("42d0c662-519a-4408-ac16-e1b3557c42fd")
    void updateCharacterStream(String p0, Reader p1, long p2) throws SQLException;

    @objid ("c223d661-d759-445b-828e-e9dd5e6d6e38")
    void updateClob(String p0, Reader p1, long p2) throws SQLException;

    @objid ("2bd2e260-91fb-41d5-aa47-226bd86e6c78")
    void updateClob(int p0, Reader p1) throws SQLException;

    @objid ("c73fb31c-ef57-440e-a407-057fe162d4ce")
    void updateClob(int p0, Reader p1, long p2) throws SQLException;

    @objid ("728336b8-414a-4716-8b20-3f2f5e56e7c5")
    void updateClob(int p0, Clob p1) throws SQLException;

    @objid ("1b255a75-01a2-4b8d-91c0-1d3bea0abb57")
    void updateClob(String p0, Clob p1) throws SQLException;

    @objid ("59eb03c8-2b59-490c-bc5e-4183fff69272")
    void updateClob(String p0, Reader p1) throws SQLException;

    @objid ("4bf7623d-ebe5-40ce-ba46-ee40757816e9")
    void updateDate(String p0, Date p1) throws SQLException;

    @objid ("8cfa1f34-5b45-4ef6-b2d6-5f3f9340374e")
    void updateDate(int p0, Date p1) throws SQLException;

    @objid ("717c1ccb-16e3-4c12-8583-77d2ebcefe71")
    void updateDouble(String p0, double p1) throws SQLException;

    @objid ("ed7a889e-4bdc-434b-9ae1-9bf7cfbd2abb")
    void updateDouble(int p0, double p1) throws SQLException;

    @objid ("034308ec-ae61-43c3-b342-9aa7e67a3873")
    void updateFloat(int p0, float p1) throws SQLException;

    @objid ("a87a8748-d63d-4c3e-998c-bae2e3e1af12")
    void updateFloat(String p0, float p1) throws SQLException;

    @objid ("4485d559-e233-4c43-8827-f954a14092f9")
    void updateInt(String p0, int p1) throws SQLException;

    @objid ("1ef9e8d5-5fde-4ed4-8583-abc577b4f78d")
    void updateInt(int p0, int p1) throws SQLException;

    @objid ("c0cce0de-c492-4313-8e5b-f2611bc46ffb")
    void updateLong(int p0, long p1) throws SQLException;

    @objid ("e3e98299-5a04-4c9e-b5fe-6a0b88d7feb6")
    void updateLong(String p0, long p1) throws SQLException;

    @objid ("9f889906-e46a-4041-b262-d76955816c81")
    void updateNCharacterStream(String p0, Reader p1) throws SQLException;

    @objid ("c017a995-4be4-4743-a27b-f119845dda12")
    void updateNCharacterStream(String p0, Reader p1, long p2) throws SQLException;

    @objid ("4389a5d3-a69e-49fc-a290-3238a62b1e4e")
    void updateNCharacterStream(int p0, Reader p1, long p2) throws SQLException;

    @objid ("def724cd-f362-4786-97d8-af84b2ab9878")
    void updateNCharacterStream(int p0, Reader p1) throws SQLException;

    @objid ("2ee71865-1d9f-424a-8377-78c5e671ee18")
    void updateNClob(int p0, Reader p1, long p2) throws SQLException;

    @objid ("67dbcc21-65a5-4188-a3ad-29e4542c73b4")
    void updateNClob(String p0, NClob p1) throws SQLException;

    @objid ("6b4aa4d0-16ca-48df-881b-bacaee028b5d")
    void updateNClob(String p0, Reader p1, long p2) throws SQLException;

    @objid ("77a21402-18c0-4b6c-863f-358c0f6e5cd0")
    void updateNClob(int p0, NClob p1) throws SQLException;

    @objid ("2b3b504f-5538-4a7d-ab62-8e2bf8998af6")
    void updateNClob(int p0, Reader p1) throws SQLException;

    @objid ("48a8cc43-9add-4435-bd48-5b7009a6cbd7")
    void updateNClob(String p0, Reader p1) throws SQLException;

    @objid ("b3451bf3-1a38-472f-a4bf-39a797419a0d")
    void updateNString(String p0, String p1) throws SQLException;

    @objid ("04dc7ce0-13ac-44fd-9996-2a604fad11fe")
    void updateNString(int p0, String p1) throws SQLException;

    @objid ("c99a2634-a087-4e25-a4c8-a8d18cf8b872")
    void updateNull(int p0) throws SQLException;

    @objid ("b6c7e289-c710-42df-bdc3-ae3f352ad3ef")
    void updateNull(String p0) throws SQLException;

    @objid ("6a2eef24-f246-4178-9595-13c41865d0ae")
    void updateObject(int p0, Object p1, SQLType p2) throws SQLException;

    @objid ("a27900ee-8962-46e3-b823-08629b849871")
    void updateObject(String p0, Object p1, SQLType p2, int p3) throws SQLException;

    @objid ("827fec94-9e90-42f1-838e-397c51ca1792")
    void updateObject(int p0, Object p1, SQLType p2, int p3) throws SQLException;

    @objid ("19f161dc-6408-44ed-916d-f86d23206769")
    void updateObject(String p0, Object p1, SQLType p2) throws SQLException;

    @objid ("57c96394-c2fb-4123-acde-7d09a0f53754")
    void updateObject(String p0, Object p1, int p2) throws SQLException;

    @objid ("ee1a190d-4d71-4377-975e-043618769c07")
    void updateObject(int p0, Object p1) throws SQLException;

    @objid ("6c81774c-e2fe-437b-95ba-996ba920b208")
    void updateObject(int p0, Object p1, int p2) throws SQLException;

    @objid ("9c10261c-f9ce-4e74-b441-4906d1765a0a")
    void updateObject(String p0, Object p1) throws SQLException;

    @objid ("b647e7f0-cce0-4594-9c92-22351a9c90a8")
    void updateRef(int p0, Ref p1) throws SQLException;

    @objid ("a11a5982-026d-41d7-9f7b-2411e553071a")
    void updateRef(String p0, Ref p1) throws SQLException;

    @objid ("937f6ffc-9385-4185-9158-3579dc28e112")
    void updateRow() throws SQLException;

    @objid ("6e1abfe3-1784-42b2-8901-b5a78d070abb")
    void updateRowId(int p0, RowId p1) throws SQLException;

    @objid ("023f3405-9a49-4359-a114-16387f42fbb3")
    void updateRowId(String p0, RowId p1) throws SQLException;

    @objid ("7b4355d1-4a2d-4a01-b514-d920103655f9")
    void updateSQLXML(String p0, SQLXML p1) throws SQLException;

    @objid ("2484b065-f4be-4725-81df-dbd90e538fb3")
    void updateSQLXML(int p0, SQLXML p1) throws SQLException;

    @objid ("e4c57006-691d-44c0-a19a-4e7a396a69d5")
    void updateShort(int p0, short p1) throws SQLException;

    @objid ("c7a88817-e84b-49b8-88ed-5c5c4ad10c5a")
    void updateShort(String p0, short p1) throws SQLException;

    @objid ("7b3ce78d-97a8-452b-b799-f8d206a07916")
    void updateString(int p0, String p1) throws SQLException;

    @objid ("afaefc2d-bba3-4cc9-971c-16d486f8951b")
    void updateString(String p0, String p1) throws SQLException;

    @objid ("5b38a912-7aff-4e44-8f48-298e06f54253")
    void updateTime(String p0, Time p1) throws SQLException;

    @objid ("b7961941-bce0-49b4-bbde-b36498cdfef0")
    void updateTime(int p0, Time p1) throws SQLException;

    @objid ("da7754a3-fb8f-4ae5-90c1-35e69ed79655")
    void updateTimestamp(int p0, Timestamp p1) throws SQLException;

    @objid ("9e1f3e37-4b27-418d-8cde-112b932f17ee")
    void updateTimestamp(String p0, Timestamp p1) throws SQLException;

    @objid ("319b5e74-47eb-4671-a1cc-b0e6e5ef78ac")
    boolean wasNull() throws SQLException;

}

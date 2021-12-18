package java.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1d30-0000-000000000000")
public interface SQLXML {
    @objid ("bd9ba90a-52a0-4006-94b6-fd034d8cf738")
    void free() throws SQLException;

    @objid ("0955f1d6-2836-4494-b643-edd27e0fd07b")
    InputStream getBinaryStream() throws SQLException;

    @objid ("03a68d9f-4492-489f-859a-7868df8bb930")
    Reader getCharacterStream() throws SQLException;

    @objid ("4f22713e-b311-4e12-a747-e75a80c60353")
    Source getSource(Class p0) throws SQLException;

    @objid ("54e88a9f-5405-4fa9-8641-c5b215b69c3d")
    String getString() throws SQLException;

    @objid ("7e4cba50-c9fc-4157-8965-6dfc238fb341")
    OutputStream setBinaryStream() throws SQLException;

    @objid ("35d08d43-19a6-42b5-9ed6-f27f675bbf8d")
    Writer setCharacterStream() throws SQLException;

    @objid ("078da795-72d5-4332-8c06-8fc63285f190")
    Result setResult(Class p0) throws SQLException;

    @objid ("f8f9a523-d7c8-4831-89b1-3b77ea607746")
    void setString(String p0) throws SQLException;

}

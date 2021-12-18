package java.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e70-0000-000000000000")
public interface Clob {
    @objid ("a2992f92-ef6a-4872-a909-c2f123f6a2cf")
    void free() throws SQLException;

    @objid ("55ab952e-7300-43dd-8619-5616f78bcf32")
    InputStream getAsciiStream() throws SQLException;

    @objid ("0406757c-aac7-4925-b186-af0f56e079c9")
    Reader getCharacterStream(long p0, long p1) throws SQLException;

    @objid ("50052fd4-7173-4545-a978-53b031ce609d")
    Reader getCharacterStream() throws SQLException;

    @objid ("a0148dd4-1c02-4ddd-83fa-315db79fd68f")
    String getSubString(long p0, int p1) throws SQLException;

    @objid ("a769690d-8aa5-493b-a6c9-f351aec14153")
    long length() throws SQLException;

    @objid ("bb4fa5d7-1a3a-481b-bd0e-bfefd50792c8")
    long position(String p0, long p1) throws SQLException;

    @objid ("dcf45153-07e8-4cf8-b560-d9c79ffd18a4")
    long position(Clob p0, long p1) throws SQLException;

    @objid ("d27e4a50-33c1-4ae9-b4d0-26a589798e09")
    OutputStream setAsciiStream(long p0) throws SQLException;

    @objid ("c8a27ff2-257d-4422-b64c-5a3b42e44838")
    Writer setCharacterStream(long p0) throws SQLException;

    @objid ("833618ad-0ad5-4a46-a753-0a5df739c20f")
    int setString(long p0, String p1, int p2, int p3) throws SQLException;

    @objid ("c384bda7-2447-4a5d-a792-1ca910a3d0e1")
    int setString(long p0, String p1) throws SQLException;

    @objid ("f9027493-71d0-403a-b46c-5b29b3ee19e4")
    void truncate(long p0) throws SQLException;

}

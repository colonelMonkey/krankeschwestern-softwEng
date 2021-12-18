package java.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e7f-0000-000000000000")
public interface Blob {
    @objid ("bf5b9021-51bc-4285-9bb3-18063d69b196")
    void free() throws SQLException;

    @objid ("0ca77956-c4b5-4bf7-9576-8f7a4c57cd71")
    InputStream getBinaryStream(long p0, long p1) throws SQLException;

    @objid ("553f092d-90fb-4456-b425-9a90b5d791af")
    InputStream getBinaryStream() throws SQLException;

    @objid ("fe657b5e-1cd6-4ca2-93b7-66d870deca55")
    List<Byte> getBytes(long p0, int p1) throws SQLException;

    @objid ("8b3a5f6c-2843-4e67-9807-7cac379fc07e")
    long length() throws SQLException;

    @objid ("ae34ae10-65ca-412d-a47b-f43de54a8115")
    long position(List<Byte> p0, long p1) throws SQLException;

    @objid ("44dc007f-78f4-464b-964e-816ab8b967e1")
    long position(Blob p0, long p1) throws SQLException;

    @objid ("e66b645c-4a91-44dc-8520-f485e8cf5752")
    OutputStream setBinaryStream(long p0) throws SQLException;

    @objid ("22967852-70e0-4290-adf2-8a8c90198bc4")
    int setBytes(long p0, List<Byte> p1, int p2, int p3) throws SQLException;

    @objid ("a3be2f36-38e4-422a-b78f-7319148f75eb")
    int setBytes(long p0, List<Byte> p1) throws SQLException;

    @objid ("38a47c1b-71d2-4aee-a90e-22b7a1bc6ccf")
    void truncate(long p0) throws SQLException;

}

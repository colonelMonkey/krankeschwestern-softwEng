package java.io;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e0e-0000-000000000000")
public interface DataInput {
    @objid ("a2cd821c-2f59-4ce8-929f-baf4944467a7")
    boolean readBoolean() throws IOException;

    @objid ("5dae2ec9-f839-4d12-aea4-f9aff484f1e2")
    byte readByte() throws IOException;

    @objid ("70582620-e9b0-43d7-b5f6-664f8a69914c")
    char readChar() throws IOException;

    @objid ("a565013c-c981-4d0f-8a5b-c358948fc0b3")
    double readDouble() throws IOException;

    @objid ("f0399da0-6681-4870-87a2-6f9a4fca0341")
    float readFloat() throws IOException;

    @objid ("75fd3a8b-1942-4014-8303-d35c430ca36a")
    void readFully(List<Byte> p0) throws IOException;

    @objid ("54e5cef2-29fd-4b54-a0b4-98823b17f028")
    void readFully(List<Byte> p0, int p1, int p2) throws IOException;

    @objid ("d0f449cb-b50f-425e-a102-da5af5510674")
    int readInt() throws IOException;

    @objid ("de58d752-bd27-4d0f-a0b7-ddbeb3770937")
    String readLine() throws IOException;

    @objid ("2fa4c7ce-32c8-49ef-9adb-1916698a9508")
    long readLong() throws IOException;

    @objid ("fa58038c-2a63-46a7-bca8-49b924035855")
    short readShort() throws IOException;

    @objid ("c97c4c47-f215-4f09-82ce-d4b87d79dd6f")
    String readUTF() throws IOException;

    @objid ("55fedf7d-5ff7-47a0-86ff-1b42c70db952")
    int readUnsignedByte() throws IOException;

    @objid ("523cc278-a76a-4109-a722-6873cffb2bd1")
    int readUnsignedShort() throws IOException;

    @objid ("51fed7cc-0d95-4ad3-9c8a-2d915fb834f6")
    int skipBytes(int p0) throws IOException;

}

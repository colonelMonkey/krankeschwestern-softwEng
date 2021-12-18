package java.io;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e0d-0000-000000000000")
public interface DataOutput {
    @objid ("d4e1fed8-91ee-4212-a8f3-c5a13fe4a4a9")
    void write(List<Byte> p0, int p1, int p2) throws IOException;

    @objid ("c5467f6f-be50-40f1-9539-7dd67a0b4035")
    void write(List<Byte> p0) throws IOException;

    @objid ("9c023a22-9164-4c50-ade4-ab49717fdef1")
    void write(int p0) throws IOException;

    @objid ("8f613e97-2e21-42f7-a1c8-8d2998aadb7f")
    void writeBoolean(boolean p0) throws IOException;

    @objid ("3af0ea54-a7e4-440c-8232-ba0227bdeb20")
    void writeByte(int p0) throws IOException;

    @objid ("31ea0626-7680-4ccc-bf5f-a844caa6ec34")
    void writeBytes(String p0) throws IOException;

    @objid ("1c8b4039-fa8a-44fb-9ea5-9ea1bfab023b")
    void writeChar(int p0) throws IOException;

    @objid ("0d9f9698-cd8d-4220-8dcb-f505968450f6")
    void writeChars(String p0) throws IOException;

    @objid ("dc73b19a-3520-4076-9cbf-096876f5d8c1")
    void writeDouble(double p0) throws IOException;

    @objid ("a0a9c2c6-f3ae-4033-a0f4-ec4724446a6d")
    void writeFloat(float p0) throws IOException;

    @objid ("d51e3f19-c943-4f04-8fc0-771fd60586c6")
    void writeInt(int p0) throws IOException;

    @objid ("5684feaf-e5a6-4474-93f5-accf94dc6aad")
    void writeLong(long p0) throws IOException;

    @objid ("c0759faa-f36d-4319-b691-bd98eb7e113f")
    void writeShort(int p0) throws IOException;

    @objid ("c422d343-0299-4b36-99b6-5b2543de38c3")
    void writeUTF(String p0) throws IOException;

}

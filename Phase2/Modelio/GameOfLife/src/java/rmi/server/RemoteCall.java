package java.rmi.server;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d90-0000-000000000000")
public interface RemoteCall {
    @objid ("7f2e839a-d370-4519-a9cf-6ab5649a0667")
    void done() throws IOException;

    @objid ("8def336d-0733-4597-97b4-61c527375716")
    void executeCall() throws Exception;

    @objid ("0a23d7c9-820f-42c8-b68e-dada26448d8a")
    ObjectInput getInputStream() throws IOException;

    @objid ("6132d416-186e-4d5e-8e65-4723a7d2ad95")
    ObjectOutput getOutputStream() throws IOException;

    @objid ("2f691945-1aee-4e1b-929a-45067b0bf27b")
    ObjectOutput getResultStream(boolean p0) throws IOException, StreamCorruptedException;

    @objid ("a39132fd-ad42-43ad-9ac4-da24a325f7bb")
    void releaseInputStream() throws IOException;

    @objid ("601a9ce8-177f-4834-be3b-a5a74f2d0d5d")
    void releaseOutputStream() throws IOException;

}

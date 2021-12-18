package java.nio.channels;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-1714-0000-000000000000")
public interface MulticastChannel extends NetworkChannel {
    @objid ("dc92c744-8db4-4a2c-b4b8-a17e9149da42")
    void close() throws IOException;

    @objid ("6981ee77-4f1d-45e9-a2a1-eaf492934ce6")
    MembershipKey join(InetAddress p0, NetworkInterface p1) throws IOException;

    @objid ("05f8df11-03f4-4a1d-acd5-d9170073b06c")
    MembershipKey join(InetAddress p0, NetworkInterface p1, InetAddress p2) throws IOException;

}

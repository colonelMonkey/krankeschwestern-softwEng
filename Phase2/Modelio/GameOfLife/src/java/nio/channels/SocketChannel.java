package java.nio.channels;

import java.nio.channels.spi.AbstractSelectableChannel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29e5-0000-000000000000")
public abstract class SocketChannel extends AbstractSelectableChannel implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, NetworkChannel {
}

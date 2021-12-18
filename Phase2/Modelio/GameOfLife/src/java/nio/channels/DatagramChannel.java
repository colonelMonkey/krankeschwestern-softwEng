package java.nio.channels;

import java.nio.channels.spi.AbstractSelectableChannel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29ce-0000-000000000000")
public abstract class DatagramChannel extends AbstractSelectableChannel implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, MulticastChannel {
}

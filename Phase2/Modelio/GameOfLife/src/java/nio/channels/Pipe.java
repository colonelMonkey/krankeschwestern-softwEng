package java.nio.channels;

import java.nio.channels.spi.AbstractSelectableChannel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29ee-0000-000000000000")
public abstract class Pipe {
    @objid ("00d00398-0000-29ef-0000-000000000000")
    public static abstract class SinkChannel extends AbstractSelectableChannel implements WritableByteChannel, GatheringByteChannel {
    }

    @objid ("00d00398-0000-29f0-0000-000000000000")
    public static abstract class SourceChannel extends AbstractSelectableChannel implements ReadableByteChannel, ScatteringByteChannel {
    }

}

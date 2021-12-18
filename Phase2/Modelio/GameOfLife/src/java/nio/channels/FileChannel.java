package java.nio.channels;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29d8-0000-000000000000")
public abstract class FileChannel extends AbstractInterruptibleChannel implements SeekableByteChannel, GatheringByteChannel, ScatteringByteChannel {
    @objid ("00d00398-0000-29d9-0000-000000000000")
    public static class MapMode {
    }

}

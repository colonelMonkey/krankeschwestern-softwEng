package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-19f5-0000-000000000000")
public interface SeekableByteChannel extends ByteChannel {
    @objid ("ddc95f8a-a330-4035-be03-b7bc92e7fc57")
    SeekableByteChannel position(long p0) throws IOException;

    @objid ("7bb99909-78a6-43eb-8d14-f9fcb7e8fe88")
    long position() throws IOException;

    @objid ("61d54507-89f3-4bcd-a511-da310f76d54a")
    int read(ByteBuffer p0) throws IOException;

    @objid ("fbd6a231-6fe7-41e3-b558-e4daab8f9811")
    long size() throws IOException;

    @objid ("41744abd-19c9-4d38-96eb-df6151177f96")
    SeekableByteChannel truncate(long p0) throws IOException;

    @objid ("656baf76-2132-444c-8689-d32fd3a9f96c")
    int write(ByteBuffer p0) throws IOException;

}

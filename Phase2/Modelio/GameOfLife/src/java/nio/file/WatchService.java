package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-3a05-0000-000000000000")
public interface WatchService extends Closeable {
    @objid ("8833e4d3-132e-4a45-b9bc-5391e8be82ee")
    void close() throws IOException;

    @objid ("a8b8e7e2-dd55-4039-b1f3-923b2ccd4265")
    WatchKey poll(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("cb60e441-68e0-4947-843d-bc8ef8adbd32")
    WatchKey poll();

    @objid ("cc3f7b27-6541-4a8a-997b-109e958b024a")
    WatchKey take() throws InterruptedException;

}

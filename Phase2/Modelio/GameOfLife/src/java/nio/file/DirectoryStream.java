package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-4081-0000-000000000000")
public interface DirectoryStream extends Closeable, Iterable {
    @objid ("94f30267-a686-417a-9f20-17b6edb46a1b")
    Iterator iterator();

    @objid ("2580001c-0007-1450-0000-000000000000")
    interface Filter {
        @objid ("baef8d0c-ad01-4e93-b767-ee8c6e1079b9")
        boolean accept(Object p0) throws IOException;

    }

}

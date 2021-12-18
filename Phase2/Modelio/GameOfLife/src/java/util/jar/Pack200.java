package java.util.jar;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.SortedMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2cca-0000-000000000000")
public abstract class Pack200 {
    @objid ("00d00398-0000-2ccb-0000-000000000000")
    public interface Packer {
        @objid ("3c84a242-2529-4c36-8b0c-1fb299e129da")
        void addPropertyChangeListener(PropertyChangeListener p0);

        @objid ("52abaa7d-1931-432c-a916-4e1a949c9569")
        void pack(JarInputStream p0, OutputStream p1) throws IOException;

        @objid ("b2c1906b-7a89-4469-a807-b3758f5af016")
        void pack(JarFile p0, OutputStream p1) throws IOException;

        @objid ("1471bdd6-3922-4234-911f-768a238116e2")
        SortedMap properties();

        @objid ("42bd2f0b-6c7a-4636-870f-8e0df97a3a12")
        void removePropertyChangeListener(PropertyChangeListener p0);

    }

    @objid ("00d00398-0000-2ccc-0000-000000000000")
    public interface Unpacker {
        @objid ("e873be3a-f4b0-418f-a355-fdc547af6317")
        void addPropertyChangeListener(PropertyChangeListener p0);

        @objid ("549e5a70-c982-4ba5-a179-de7455cf591d")
        SortedMap properties();

        @objid ("9aacc658-244c-4a0d-8d94-f8ac2b977986")
        void removePropertyChangeListener(PropertyChangeListener p0);

        @objid ("bcd21fd9-958f-4e8c-8d95-2ab3e33955bb")
        void unpack(File p0, JarOutputStream p1) throws IOException;

        @objid ("b8110493-04bd-4e50-9d15-91e60b9f32d0")
        void unpack(InputStream p0, JarOutputStream p1) throws IOException;

    }

}

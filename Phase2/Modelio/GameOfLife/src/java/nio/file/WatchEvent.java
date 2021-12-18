package java.nio.file;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-45b3-0000-000000000000")
public interface WatchEvent {
    @objid ("9eb5771d-1a24-4fbe-a0ca-d51192dc5a2d")
    Object context();

    @objid ("4e4ba10d-fd8c-4538-90ba-de57071b8e45")
    int count();

    @objid ("2061296a-ae4e-4888-8fca-7a99fe0abce7")
    Kind kind();

    @objid ("2580001c-0007-1386-0000-000000000000")
    interface Kind {
        @objid ("3036f40a-5989-459f-b304-ceaf7738bc0b")
        String name();

        @objid ("a97b260e-1f86-4a1c-ac5f-97bd2111be28")
        Class type();

    }

    @objid ("2580001c-0007-15bd-0000-000000000000")
    interface Modifier {
        @objid ("af785187-9641-4f54-8567-f0790992044b")
        String name();

    }

}

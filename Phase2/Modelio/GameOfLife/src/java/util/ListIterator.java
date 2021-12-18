package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d68-0000-000000000000")
public interface ListIterator extends Iterator {
    @objid ("bb030f4a-9417-4eed-ba51-183aa5c4eec0")
    void add(Object p0);

    @objid ("5aed2d88-2d15-4f59-9f4f-24008475e743")
    boolean hasNext();

    @objid ("1a11ee85-f603-484b-b790-9af56bc53eeb")
    boolean hasPrevious();

    @objid ("81c8bd21-4e1a-4531-a7a9-00e23119db33")
    Object next();

    @objid ("ccde5861-8eed-4dfa-8a03-963959e3e055")
    int nextIndex();

    @objid ("e9aa0718-40bd-49d5-b44c-95fcf9de3316")
    Object previous();

    @objid ("ddd5801e-db81-45ac-8a82-43d92b838c13")
    int previousIndex();

    @objid ("56478115-8762-4dcd-843a-eb927d81f9d9")
    void remove();

    @objid ("cca63854-d5f8-4781-af59-ff7c6b19f535")
    void set(Object p0);

}

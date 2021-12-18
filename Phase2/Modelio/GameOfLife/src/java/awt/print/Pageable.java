package java.awt.print;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2904-0000-000000000000")
public interface Pageable {
    @objid ("9f20db79-1c0a-48bc-a992-e29e8ee9702e")
    int getNumberOfPages();

    @objid ("f648a8f7-faa8-4650-b44a-31614578ecc4")
    PageFormat getPageFormat(int p0) throws IndexOutOfBoundsException;

    @objid ("db127b63-a854-4355-aa7b-a73585e8db65")
    Printable getPrintable(int p0) throws IndexOutOfBoundsException;

}

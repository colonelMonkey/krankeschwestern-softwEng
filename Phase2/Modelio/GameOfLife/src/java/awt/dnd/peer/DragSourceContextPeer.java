package java.awt.dnd.peer;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.InvalidDnDOperationException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27f0-0000-000000000000")
public interface DragSourceContextPeer {
    @objid ("49e7a89c-15a4-40fb-b902-bd67bb9a11f1")
    Cursor getCursor();

    @objid ("07c99ce3-8702-466e-a69f-205c68e45bc9")
    void setCursor(Cursor p0) throws InvalidDnDOperationException;

    @objid ("0b307ffd-8afc-43ea-bafc-b619d17ed64e")
    void startDrag(DragSourceContext p0, Cursor p1, Image p2, Point p3) throws InvalidDnDOperationException;

    @objid ("7f1bb08c-d150-412a-a373-2227df1e8953")
    void transferablesFlavorsChanged();

}

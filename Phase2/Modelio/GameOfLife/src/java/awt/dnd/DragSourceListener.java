package java.awt.dnd;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27fd-0000-000000000000")
public interface DragSourceListener extends EventListener {
    @objid ("513858c3-537d-492a-a876-26fa979e4ed3")
    void dragDropEnd(DragSourceDropEvent p0);

    @objid ("37fb1935-0b8a-49f9-bb07-092a05dd4399")
    void dragEnter(DragSourceDragEvent p0);

    @objid ("650eda23-5a9f-48da-9b5f-2573a6aa9928")
    void dragExit(DragSourceEvent p0);

    @objid ("71e7d7d7-6e7a-4d77-8470-c36737560c5f")
    void dragOver(DragSourceDragEvent p0);

    @objid ("298d8e4a-098f-4213-b020-b5fc788c6877")
    void dropActionChanged(DragSourceDragEvent p0);

}

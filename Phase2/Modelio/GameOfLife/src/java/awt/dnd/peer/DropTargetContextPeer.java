package java.awt.dnd.peer;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.InvalidDnDOperationException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27f1-0000-000000000000")
public interface DropTargetContextPeer {
    @objid ("9478578b-c92b-4a2c-a00d-d33ca6e6e8fc")
    void acceptDrag(int p0);

    @objid ("32b856ae-9c94-4be1-a036-46ae7d44bdd1")
    void acceptDrop(int p0);

    @objid ("a98f4dec-d395-4f31-acc3-f5f66669329d")
    void dropComplete(boolean p0);

    @objid ("4424cb91-fd7d-4674-a8dc-a852ddc005fa")
    DropTarget getDropTarget();

    @objid ("5b922533-89d4-4b2f-94fc-9518d9f78aa6")
    int getTargetActions();

    @objid ("7286e31b-1233-456e-87b0-77a0e36d42ba")
    List<DataFlavor> getTransferDataFlavors();

    @objid ("b877cae5-b842-4321-8343-7b284948d79f")
    Transferable getTransferable() throws InvalidDnDOperationException;

    @objid ("2fcebe68-a611-468c-8348-1315e1cbda0f")
    boolean isTransferableJVMLocal();

    @objid ("1cbac572-6b0f-4019-ab9b-5ce53698d7a3")
    void rejectDrag();

    @objid ("c458d222-75a1-4a64-a2ce-679d3cf07bff")
    void rejectDrop();

    @objid ("bb30f1cb-8147-42a3-9b62-27e923d22b99")
    void setTargetActions(int p0);

}

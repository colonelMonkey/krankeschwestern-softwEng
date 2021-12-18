package javax.swing;

import java.util.EventObject;
import javax.swing.event.CellEditorListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-245a-0000-000000000000")
public interface CellEditor {
    @objid ("3591793f-0426-40e5-8a07-4c8721794b3f")
    void addCellEditorListener(CellEditorListener p0);

    @objid ("d098d061-e6d4-47ad-812a-3b1caa2d24a7")
    void cancelCellEditing();

    @objid ("55002353-ba67-43e1-8c59-81ed8f5b7da0")
    Object getCellEditorValue();

    @objid ("0efe8db6-2e03-4b62-836b-01ac9467fa28")
    boolean isCellEditable(EventObject p0);

    @objid ("31186270-7488-42dd-b4e4-d74d771de11d")
    void removeCellEditorListener(CellEditorListener p0);

    @objid ("d63c1515-8423-4877-a13f-f96616b4caff")
    boolean shouldSelectCell(EventObject p0);

    @objid ("0325d674-cce0-48c7-a26f-07c8049d9476")
    boolean stopCellEditing();

}

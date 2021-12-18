package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-235d-0000-000000000000")
public interface TableColumnModelListener extends EventListener {
    @objid ("8706e428-fa56-4aad-98d8-2855a66069e5")
    void columnAdded(TableColumnModelEvent p0);

    @objid ("6c2de997-5f3b-4ec2-87a6-70938bb3880f")
    void columnMarginChanged(ChangeEvent p0);

    @objid ("7b23a81a-a812-4762-bf52-9879d2be4878")
    void columnMoved(TableColumnModelEvent p0);

    @objid ("36c82789-a495-43c8-99dd-1806b2628448")
    void columnRemoved(TableColumnModelEvent p0);

    @objid ("02e0b6d0-dbcc-4376-ad62-ddad0e89cbc7")
    void columnSelectionChanged(ListSelectionEvent p0);

}

package javax.swing.table;

import javax.swing.event.TableModelListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-239d-0000-000000000000")
public interface TableModel {
    @objid ("2b48178e-5c1e-4f94-b1e3-0ed77a2429de")
    void addTableModelListener(TableModelListener p0);

    @objid ("3bad720a-5fa3-43ff-bd24-5de4e3115c2f")
    Class getColumnClass(int p0);

    @objid ("72b2fd0f-6d6b-4315-8032-5daf85b055c8")
    int getColumnCount();

    @objid ("5002b9a9-084b-4d72-9b24-84ec4ac86979")
    String getColumnName(int p0);

    @objid ("ad0e49cf-244d-44d9-8de5-a072873458e3")
    int getRowCount();

    @objid ("fd6111b5-c6b4-4347-8de6-3b07567601fc")
    Object getValueAt(int p0, int p1);

    @objid ("85c46ebb-0a75-4ae8-88b5-5f2e8358f443")
    boolean isCellEditable(int p0, int p1);

    @objid ("6cb2644f-2aa7-48f9-a079-18596cd57d7d")
    void removeTableModelListener(TableModelListener p0);

    @objid ("8ceb784b-ec95-4e49-bdd4-613c741c3736")
    void setValueAt(Object p0, int p1, int p2);

}

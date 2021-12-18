package javax.swing.table;

import java.util.Enumeration;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableColumnModelListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-239e-0000-000000000000")
public interface TableColumnModel {
    @objid ("52391b43-5522-4340-ae92-d5c68f207be0")
    void addColumn(TableColumn p0);

    @objid ("a4bf5191-82b7-4919-8efc-50077ac8bd63")
    void addColumnModelListener(TableColumnModelListener p0);

    @objid ("2f00a374-983a-4b50-891c-141a99522a46")
    TableColumn getColumn(int p0);

    @objid ("40d9cc03-229e-4885-826c-ebaf65ca177d")
    int getColumnCount();

    @objid ("1abc7c61-ec50-4751-89d6-1c4869c3a3ec")
    int getColumnIndex(Object p0);

    @objid ("130fbc57-c6b1-491e-b3e6-df6024ed51a7")
    int getColumnIndexAtX(int p0);

    @objid ("3e92b859-1bbe-4d61-8b08-fb98f7b6ae73")
    int getColumnMargin();

    @objid ("a3675e86-28ea-4817-872f-5630b593ce3f")
    boolean getColumnSelectionAllowed();

    @objid ("ddff779f-5932-487c-8949-243831fed7ad")
    Enumeration getColumns();

    @objid ("9f4e2458-d777-4fb9-b977-bf4020f248f5")
    int getSelectedColumnCount();

    @objid ("77631f35-6b5c-4ef0-93ad-251b25993492")
    List<Integer> getSelectedColumns();

    @objid ("46070b91-8c4c-4c52-8ae9-63996c485c71")
    ListSelectionModel getSelectionModel();

    @objid ("c7ad6c97-4be1-41de-a4e6-0cb1d942895e")
    int getTotalColumnWidth();

    @objid ("c007e899-4ea0-47a0-aad5-dacc6f35154d")
    void moveColumn(int p0, int p1);

    @objid ("f4385482-4d7d-4a32-b729-1dd3b509ab7c")
    void removeColumn(TableColumn p0);

    @objid ("6aa593cc-56f2-4a42-95b2-2c660c097441")
    void removeColumnModelListener(TableColumnModelListener p0);

    @objid ("d0f77ba7-221b-4c56-81ca-db76517148dd")
    void setColumnMargin(int p0);

    @objid ("c6ef3b78-2762-4ae7-bb1b-7dfaccfa9b03")
    void setColumnSelectionAllowed(boolean p0);

    @objid ("dac244fb-790d-4a76-a3da-424c99ede4f8")
    void setSelectionModel(ListSelectionModel p0);

}

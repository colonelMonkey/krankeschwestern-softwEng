package javax.swing;

import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23fa-0000-000000000000")
public interface SingleSelectionModel {
    @objid ("1a284d9c-398f-4040-a69e-b758a831d9cb")
    void addChangeListener(ChangeListener p0);

    @objid ("a7e46e6c-eadb-420e-9379-d5c90c89b36a")
    void clearSelection();

    @objid ("08c05470-f709-4d62-bc60-56c022f115f3")
    int getSelectedIndex();

    @objid ("733f3133-0fef-4216-8749-b00f31a9f932")
    boolean isSelected();

    @objid ("1744c392-d3f4-4e2f-bb86-18154984af7d")
    void removeChangeListener(ChangeListener p0);

    @objid ("444748b3-9b36-4963-a294-766ea690bfaa")
    void setSelectedIndex(int p0);

}

package java.awt.peer;

import java.awt.Dimension;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28de-0000-000000000000")
public interface ListPeer extends ComponentPeer {
    @objid ("224f0cfb-4619-4434-941c-3c63efa0ee4d")
    void add(String p0, int p1);

    @objid ("34224dde-6a03-4d6a-b556-39c1cfe3d3e1")
    void delItems(int p0, int p1);

    @objid ("0123b72a-ac47-4738-b48a-ab2f02efaa09")
    void deselect(int p0);

    @objid ("d6735a2f-a6cb-4920-8837-047118574a35")
    Dimension getMinimumSize(int p0);

    @objid ("04fc7e4f-0d67-44f5-a787-5cfd81efeeed")
    Dimension getPreferredSize(int p0);

    @objid ("21ba0896-90da-4e4f-9db8-add0abfcc791")
    List<Integer> getSelectedIndexes();

    @objid ("b283a8bb-cf29-4cfb-97e0-f7c123da03df")
    void makeVisible(int p0);

    @objid ("57fc7176-2710-47ac-add0-31307588acc6")
    void removeAll();

    @objid ("da1fbbb2-fcd5-4983-92af-5a1a0f189f5f")
    void select(int p0);

    @objid ("465dcc49-e91c-4a5d-8c8f-47e969084fee")
    void setMultipleMode(boolean p0);

}

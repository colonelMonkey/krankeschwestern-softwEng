package javax.swing;

import javax.swing.event.ListSelectionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2441-0000-000000000000")
public interface ListSelectionModel {
    @objid ("7e17780c-275f-4bc2-8f53-a15b1ffe282b")
    void addListSelectionListener(ListSelectionListener p0);

    @objid ("734de756-19a5-4f3d-839f-6c987d7c39c4")
    void addSelectionInterval(int p0, int p1);

    @objid ("ea2b9d6e-343e-4866-91a6-748494de7dd0")
    void clearSelection();

    @objid ("092000c4-62b7-446a-991f-04edae40f040")
    int getAnchorSelectionIndex();

    @objid ("0c7ab4c1-4d13-4949-a2e3-273c617fc13e")
    int getLeadSelectionIndex();

    @objid ("5fb35cd7-31f1-4a1c-a8da-1637d7063925")
    int getMaxSelectionIndex();

    @objid ("3a3ae44e-c99e-433b-86bd-82fe32476760")
    int getMinSelectionIndex();

    @objid ("4c801af0-8c32-431b-8058-8dadc615b04a")
    int getSelectionMode();

    @objid ("81d431f0-1302-4ff7-b097-b7a9af97eb1d")
    boolean getValueIsAdjusting();

    @objid ("78c88014-a162-48ee-8555-4e6e5324056a")
    void insertIndexInterval(int p0, int p1, boolean p2);

    @objid ("e8cb7258-bc4f-46c9-989d-05582562aa48")
    boolean isSelectedIndex(int p0);

    @objid ("97e72a26-4621-4294-b60b-5e2c7ea7fec9")
    boolean isSelectionEmpty();

    @objid ("b3296933-10e6-4ccf-8c39-8d6caa7ec3ca")
    void removeIndexInterval(int p0, int p1);

    @objid ("c87564eb-32c1-4fc3-981e-3f958acc0e89")
    void removeListSelectionListener(ListSelectionListener p0);

    @objid ("cc881f64-7f13-47d0-8f23-8ec423acfcb6")
    void removeSelectionInterval(int p0, int p1);

    @objid ("90465727-8fd3-4052-ab74-1caae6badb6e")
    void setAnchorSelectionIndex(int p0);

    @objid ("07fb1a55-57e0-469a-a156-110ccb2e99b2")
    void setLeadSelectionIndex(int p0);

    @objid ("e5e35d12-49ca-4fe8-966a-be1ba18eefe9")
    void setSelectionInterval(int p0, int p1);

    @objid ("744b4358-0389-4f3a-b4bc-26de81a0541f")
    void setSelectionMode(int p0);

    @objid ("85842cd4-566b-4b84-8700-18b3d7000941")
    void setValueIsAdjusting(boolean p0);

}

package javax.swing;

import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2428-0000-000000000000")
public interface BoundedRangeModel {
    @objid ("9115d527-57db-4a99-81c9-d3d17bbd9680")
    void addChangeListener(ChangeListener p0);

    @objid ("4ab809fc-34c7-48ff-80fe-4d6c4953c032")
    int getExtent();

    @objid ("d87c29b2-3be3-4f08-aee7-9ddfede788ca")
    int getMaximum();

    @objid ("735b9240-1666-45de-b769-11660baae975")
    int getMinimum();

    @objid ("c005897d-7f92-4ca0-b9b6-5b15522354ce")
    int getValue();

    @objid ("59ecc1de-64e9-4315-aca7-bb0d9b45aec8")
    boolean getValueIsAdjusting();

    @objid ("bcf1ef0b-283c-416f-bff0-cbbefeed3805")
    void removeChangeListener(ChangeListener p0);

    @objid ("41af8036-4eef-4627-87b9-54c7a9c3b901")
    void setExtent(int p0);

    @objid ("dc23920f-8b71-4945-9abb-9cfd4f52967e")
    void setMaximum(int p0);

    @objid ("7e61d56d-5526-4328-9f7e-fda0b8c1ad3e")
    void setMinimum(int p0);

    @objid ("868b474b-642f-4d88-851a-d12716cf63eb")
    void setRangeProperties(int p0, int p1, int p2, int p3, boolean p4);

    @objid ("f160dedd-0e9a-4046-b83f-9a5808eb6994")
    void setValue(int p0);

    @objid ("84c4b6ec-1806-45d1-8193-1cd38fae0dd4")
    void setValueIsAdjusting(boolean p0);

}

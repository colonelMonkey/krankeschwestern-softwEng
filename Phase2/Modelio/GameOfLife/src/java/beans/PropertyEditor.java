package java.beans;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a98-0000-000000000000")
public interface PropertyEditor {
    @objid ("006ac377-ccc7-443d-bd4c-81184d4b1a92")
    void addPropertyChangeListener(PropertyChangeListener p0);

    @objid ("60c411ba-1c2b-4e4a-9d3b-388ef9c57d15")
    String getAsText();

    @objid ("b7858f96-635b-4a3d-bce4-2322a9bbdf7f")
    Component getCustomEditor();

    @objid ("a382745d-6e4f-4297-b75b-c547cf2aa1fd")
    String getJavaInitializationString();

    @objid ("20465dce-b313-47b1-a944-61ee63e09357")
    List<String> getTags();

    @objid ("72521725-f746-459e-bd08-e4a535b8966f")
    Object getValue();

    @objid ("d6e28d83-4470-4319-97d9-9e372a234722")
    boolean isPaintable();

    @objid ("3351cf06-71aa-4371-9479-81954f11b8d8")
    void paintValue(Graphics p0, Rectangle p1);

    @objid ("8dd3dd24-9152-4a0b-8097-88bf9c1910e7")
    void removePropertyChangeListener(PropertyChangeListener p0);

    @objid ("d6fff947-852b-4dff-90da-ec9ade7be03a")
    void setAsText(String p0) throws IllegalArgumentException;

    @objid ("2c0be9a6-894c-4cfd-b481-bd6b08e111ee")
    void setValue(Object p0);

    @objid ("ac9f8ec9-4dd4-4ce1-8873-904cfd5c5cf6")
    boolean supportsCustomEditor();

}

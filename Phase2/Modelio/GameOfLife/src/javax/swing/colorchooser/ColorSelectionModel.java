package javax.swing.colorchooser;

import java.awt.Color;
import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-23c4-0000-000000000000")
public interface ColorSelectionModel {
    @objid ("ccf0e2c8-c33b-4bd8-9021-949f5d6f4029")
    void addChangeListener(ChangeListener p0);

    @objid ("8935f48d-85eb-4494-854f-8f880f4c9c4f")
    Color getSelectedColor();

    @objid ("66fa7671-7735-437d-aa0c-8dde5330c32e")
    void removeChangeListener(ChangeListener p0);

    @objid ("7d72b722-43d6-44b8-855d-f8409e2db217")
    void setSelectedColor(Color p0);

}

package javax.swing;

import java.awt.Component;
import java.awt.event.ActionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-247f-0000-000000000000")
public interface ComboBoxEditor {
    @objid ("160e77e3-d697-4834-9ce2-a29622a5252c")
    void addActionListener(ActionListener p0);

    @objid ("cb7cdcf3-7129-47e5-a0c8-11e11cbcea1e")
    Component getEditorComponent();

    @objid ("bf31cef5-09f4-4c00-91d9-d2deb3c888c0")
    Object getItem();

    @objid ("acc77cd3-8ebe-4c8c-92f9-97f7ef3bf15a")
    void removeActionListener(ActionListener p0);

    @objid ("d671e6d4-d33f-4754-9e4f-09b360d8d0d7")
    void selectAll();

    @objid ("92393236-5d17-466f-ac07-3015501a0ece")
    void setItem(Object p0);

}

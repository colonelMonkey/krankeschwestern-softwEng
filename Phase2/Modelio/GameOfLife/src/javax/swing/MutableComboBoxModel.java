package javax.swing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2316-0000-000000000000")
public interface MutableComboBoxModel extends ComboBoxModel {
    @objid ("fab235a1-265a-4463-9bf9-e20f45908677")
    void addElement(Object p0);

    @objid ("da9150f1-6501-4d6f-99c3-caa3dc6b2f0b")
    void insertElementAt(Object p0, int p1);

    @objid ("2636683a-5409-46fd-98c2-8179c11b0a1a")
    void removeElement(Object p0);

    @objid ("da88ecd0-27d0-4fd2-abee-23c1f9ad2ea1")
    void removeElementAt(int p0);

}

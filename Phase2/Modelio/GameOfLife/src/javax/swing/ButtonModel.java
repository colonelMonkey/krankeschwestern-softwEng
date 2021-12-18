package javax.swing;

import java.awt.ItemSelectable;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2463-0000-000000000000")
public interface ButtonModel extends ItemSelectable {
    @objid ("5c0f81e9-9306-47cc-b1f3-16711d154189")
    void addActionListener(ActionListener p0);

    @objid ("e4ce4ce5-b212-4141-8436-85c16a43d0fc")
    void addChangeListener(ChangeListener p0);

    @objid ("a49eac50-95a2-475f-9753-32978b8d6415")
    void addItemListener(ItemListener p0);

    @objid ("2c74883a-6d89-467d-befa-7c3cedf45452")
    String getActionCommand();

    @objid ("d13cdd57-e401-403a-99a2-73f61c29e124")
    int getMnemonic();

    @objid ("ef3c9890-d586-4b0a-80e6-e37ec26c548a")
    boolean isArmed();

    @objid ("7fc7cbb3-c6c2-4db1-bf42-b61fe69b5e1f")
    boolean isEnabled();

    @objid ("880864f3-5029-47c2-9fe2-110d3e2b9fd7")
    boolean isPressed();

    @objid ("a2a9900b-2bd0-4e71-8a56-0d4881c7a590")
    boolean isRollover();

    @objid ("3e359748-34d8-4a88-8e02-a0d32c23595a")
    boolean isSelected();

    @objid ("e1fd063d-e036-4e4d-80d5-be617838f9fc")
    void removeActionListener(ActionListener p0);

    @objid ("721b1db4-8776-4139-a3d2-8e6be1eee80e")
    void removeChangeListener(ChangeListener p0);

    @objid ("61854aac-af7d-439c-9747-4b73e591c5b3")
    void removeItemListener(ItemListener p0);

    @objid ("73c11bad-53cf-40e9-b7a0-41ed2f2b3076")
    void setActionCommand(String p0);

    @objid ("82b415c7-ee19-4819-94d6-002a8c133e06")
    void setArmed(boolean p0);

    @objid ("e895104f-a42c-49e7-8abd-a04c0ef057b8")
    void setEnabled(boolean p0);

    @objid ("d9c1d488-2d5d-4afb-9505-06dba27ab773")
    void setGroup(ButtonGroup p0);

    @objid ("d06ffe3d-cc2c-489e-bc09-c3248ad485f1")
    void setMnemonic(int p0);

    @objid ("e379c47e-5e05-4a9c-bfc2-eff79368e531")
    void setPressed(boolean p0);

    @objid ("1d11c548-f361-4aec-8107-cfb55cb98d4e")
    void setRollover(boolean p0);

    @objid ("b22b91c9-df1e-4d4a-a459-0348366373ac")
    void setSelected(boolean p0);

}

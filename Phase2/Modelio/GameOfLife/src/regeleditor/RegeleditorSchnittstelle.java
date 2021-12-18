package regeleditor;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d75d06ed-134a-4dd4-9cfb-0931b194e0a5")
public interface RegeleditorSchnittstelle {
    @objid ("28c2ac14-8d9a-40f4-b278-635f1681d6ee")
    void re_laden();

    @objid ("3d02fc3e-e897-4d20-be7c-7e96f369dcc1")
    void re_speichern();

    @objid ("829ba11f-a656-48d2-a0a5-d29c194cda0f")
    boolean getTopo();

    @objid ("5769c67a-88ca-4e35-8fbe-eaa0b6a549b1")
    void regelDialog();

    @objid ("362c4157-d738-4fb6-8bd8-0e4122a016f0")
    String getRegel();


// Array von invers polnischen Anweisungen als chars => String
}

package java.beans;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a82-0000-000000000000")
public interface Visibility {
    @objid ("33b74f51-ac22-404f-a5a7-6abed0b05d3a")
    boolean avoidingGui();

    @objid ("f5b8ef94-60e2-495b-afaf-bb4246581ef4")
    void dontUseGui();

    @objid ("70579ed6-3116-45c4-8680-da6f0fda4b1f")
    boolean needsGui();

    @objid ("fcb1688b-7a85-4dee-b7e8-f573ff7a9ab9")
    void okToUseGui();

}

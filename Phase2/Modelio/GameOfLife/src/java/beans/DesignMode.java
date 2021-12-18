package java.beans;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2aba-0000-000000000000")
public interface DesignMode {
    @objid ("b11bb08a-2f2a-4fd6-9a3d-2ad3cac78106")
    boolean isDesignTime();

    @objid ("0ebd733d-6a9b-4a58-9ad8-291328c869dd")
    void setDesignTime(boolean p0);

}

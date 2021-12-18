package java.security.interfaces;

import java.security.spec.ECParameterSpec;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2788-0000-000000000000")
public interface ECKey {
    @objid ("1fe5e7ce-ef55-49b6-9002-a8a5a3888360")
    ECParameterSpec getParams();

}

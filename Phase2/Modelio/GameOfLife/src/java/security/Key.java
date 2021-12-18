package java.security;

import java.io.Serializable;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27ca-0000-000000000000")
public interface Key extends Serializable {
    @objid ("a5461a97-1a66-4c05-aec2-15f1666df642")
    String getAlgorithm();

    @objid ("6cc98d0f-fc8e-4aa9-8d55-e2465b7b9481")
    List<Byte> getEncoded();

    @objid ("738aa3c5-8675-446a-b0a0-abf28c4c4062")
    String getFormat();

}

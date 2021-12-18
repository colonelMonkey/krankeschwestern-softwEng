package java.io;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e5f-0000-000000000000")
public interface Externalizable extends Serializable {
    @objid ("c3831849-7966-4b91-b71a-6ef2c4bedd72")
    void readExternal(ObjectInput p0) throws ClassNotFoundException, IOException;

    @objid ("8adc874d-c7ac-4919-9900-78d82bf65c27")
    void writeExternal(ObjectOutput p0) throws IOException;

}

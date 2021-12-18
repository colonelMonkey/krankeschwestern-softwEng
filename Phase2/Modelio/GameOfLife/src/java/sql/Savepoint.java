package java.sql;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e86-0000-000000000000")
public interface Savepoint {
    @objid ("ddc35a43-ae79-476d-a6b1-74961a12ec3e")
    int getSavepointId() throws SQLException;

    @objid ("58c25e75-92de-4745-95ba-c9a24ed8fb8f")
    String getSavepointName() throws SQLException;

}

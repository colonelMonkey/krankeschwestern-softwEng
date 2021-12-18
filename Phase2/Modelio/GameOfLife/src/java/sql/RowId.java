package java.sql;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1d27-0000-000000000000")
public interface RowId {
    @objid ("d9f47341-dc07-483e-8b78-9b0418781372")
    boolean equals(Object p0);

    @objid ("ac4e6557-7ba1-4261-8737-745b2da81a39")
    List<Byte> getBytes();

    @objid ("fda5f071-f1fa-47a4-b435-14f7e92b6853")
    int hashCode();

    @objid ("f2ca1e12-6a6b-4331-ad40-d90604d152cb")
    String toString();

}

package java.time.temporal;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b3656200-b5b0-4612-afde-cde8de171f62")
public interface TemporalAmount {
    @objid ("d49b6afd-f8a0-4cef-9317-bf806e40c2da")
    Temporal addTo(Temporal p0);

    @objid ("d9af2ee7-8fc5-47dc-b071-9789a102214b")
    long get(TemporalUnit p0);

    @objid ("784b17c5-b0ac-416e-9a59-08deba4bf657")
    List getUnits();

    @objid ("3aeefd7e-ae94-40e9-a32a-00e5c92cdfde")
    Temporal subtractFrom(Temporal p0);

}

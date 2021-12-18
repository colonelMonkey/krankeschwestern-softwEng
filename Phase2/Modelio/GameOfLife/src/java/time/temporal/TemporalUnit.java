package java.time.temporal;

import java.time.Duration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24acfe8f-8b92-493b-aa82-e0c3c4deafa6")
public interface TemporalUnit {
    @objid ("502fc803-3e0b-4444-8b2a-242c96bfec83")
    Temporal addTo(Temporal p0, long p1);

    @objid ("5753c215-62b2-417b-ad53-44dfa94fc05e")
    long between(Temporal p0, Temporal p1);

    @objid ("3f196528-bdd4-4b73-9369-02bb4ceed7db")
    Duration getDuration();

    @objid ("5d376468-1e72-48dd-bf47-8af4b51c31e0")
    boolean isDateBased();

    @objid ("90f512dd-cb52-458a-a62d-623c238deb9e")
    boolean isDurationEstimated();

    @objid ("07ff292f-80ec-4def-ad12-02bbb4a2388b")
    boolean isSupportedBy(Temporal p0);

    @objid ("984593b2-8750-47f9-bb71-36dcc47d70bf")
    boolean isTimeBased();

    @objid ("b7914959-e49a-46c1-b036-3ed26080b921")
    String toString();

}

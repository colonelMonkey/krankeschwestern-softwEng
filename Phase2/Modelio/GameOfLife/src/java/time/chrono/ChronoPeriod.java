package java.time.chrono;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8b0dd38c-ef5c-421e-bad5-b514e58842ef")
public interface ChronoPeriod extends TemporalAmount {
    @objid ("861f0a86-38d0-4394-b6f2-8ffb4e6bd226")
    Temporal addTo(Temporal p0);

    @objid ("8d4401e4-3052-4f01-be19-f7f1eb0d1d31")
    ChronoPeriod between(ChronoLocalDate p0, ChronoLocalDate p1);

    @objid ("120ab393-5346-432d-a558-945e19c45ee8")
    boolean equals(Object p0);

    @objid ("54d3cbce-e13a-4dfa-a4b1-1945e53784c9")
    long get(TemporalUnit p0);

    @objid ("df83550d-b3f4-4a03-8771-e76d782167e0")
    Chronology getChronology();

    @objid ("3f038151-dc76-417b-9a6f-86fc19bf6c41")
    List getUnits();

    @objid ("59c5c52b-49a8-4e76-9c93-aa9be3723c26")
    int hashCode();

    @objid ("a7a594f9-8565-4b85-a16b-2963245f13ff")
    boolean isNegative();

    @objid ("ec7f4895-30d3-4bea-9d41-64c3f0634ed4")
    boolean isZero();

    @objid ("a3e392e8-b1bf-445f-894c-086636765c8c")
    ChronoPeriod minus(TemporalAmount p0);

    @objid ("d3c76437-095b-4905-8654-fccc48b227dd")
    ChronoPeriod multipliedBy(int p0);

    @objid ("803c43c7-2450-4e03-890d-18ee995f240f")
    ChronoPeriod negated();

    @objid ("d7d65d1f-7273-4d28-9c64-12d4bbd05154")
    ChronoPeriod normalized();

    @objid ("7d57dae4-0b29-4f0b-b169-5def544f92d4")
    ChronoPeriod plus(TemporalAmount p0);

    @objid ("3c2b4bdc-7e32-4f64-b5a5-949b9d1d2ab5")
    Temporal subtractFrom(Temporal p0);

    @objid ("c80bf196-f496-40a6-9015-4df2c030ce29")
    String toString();

}

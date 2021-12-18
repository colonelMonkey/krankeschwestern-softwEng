package java.time.temporal;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("04e6a4de-6542-4bf0-8c9c-77cbb58a71ae")
public interface Temporal extends TemporalAccessor {
    @objid ("07951ef0-ee87-4ab8-854a-4522ab16bc47")
    boolean isSupported(TemporalUnit p0);

    @objid ("fdefc879-bc87-4799-b381-e057a42a8e50")
    Temporal minus(TemporalAmount p0);

    @objid ("1085fe6d-f9c6-4c77-9a3b-c190b2fc45e9")
    Temporal minus(long p0, TemporalUnit p1);

    @objid ("f5026db2-4f36-44fd-b3b0-c654fea5d378")
    Temporal plus(long p0, TemporalUnit p1);

    @objid ("208659ac-05f4-4edf-8d80-17f5f75d2813")
    Temporal plus(TemporalAmount p0);

    @objid ("68862dd6-d557-4b6d-a617-f9dc8cc0e602")
    long until(Temporal p0, TemporalUnit p1);

    @objid ("9e9a9b78-7288-4f63-9aae-883d8465e310")
    Temporal with(TemporalField p0, long p1);

    @objid ("58b55696-430c-46cd-a434-3ec996ac7e2c")
    Temporal with(TemporalAdjuster p0);

}

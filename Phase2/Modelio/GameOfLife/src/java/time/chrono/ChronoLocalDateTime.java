package java.time.chrono;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2791aee1-0d27-4f36-8a7b-c113dc4424fd")
public interface ChronoLocalDateTime extends Temporal, TemporalAdjuster, Comparable {
    @objid ("c16e99d2-06a4-4022-9061-e8a349d07cf3")
    Temporal adjustInto(Temporal p0);

    @objid ("a6c34858-70f0-4f92-9f22-d220d7863fec")
    ChronoZonedDateTime atZone(ZoneId p0);

    @objid ("578e42b8-abe4-464e-9951-526ad627d5eb")
    int compareTo(Object p0);

    @objid ("fb24767a-6eea-4530-b1fe-2e7a48db1ec0")
    int compareTo(ChronoLocalDateTime p0);

    @objid ("5adf758e-9baf-4316-8c4f-153b70a1d29c")
    boolean equals(Object p0);

    @objid ("60e319bc-3990-4535-b6c9-369772fce59b")
    String format(DateTimeFormatter p0);

    @objid ("80eb043c-1635-44b3-80fc-bd7b1e341e10")
    ChronoLocalDateTime from(TemporalAccessor p0);

    @objid ("be88ed20-1844-4468-a928-27a50d36bbdf")
    Chronology getChronology();

    @objid ("64a8b853-5584-491e-a97a-282f59da9e99")
    int hashCode();

    @objid ("91e741c5-d386-4f39-8c14-e01cb75dbb75")
    boolean isAfter(ChronoLocalDateTime p0);

    @objid ("09bb03a1-75f5-441f-b1ba-35ff601d74a8")
    boolean isBefore(ChronoLocalDateTime p0);

    @objid ("ccfeb99f-63d2-40c4-be31-4190b91bf186")
    boolean isEqual(ChronoLocalDateTime p0);

    @objid ("a14ef702-39f9-4a8e-937a-391c67656f71")
    boolean isSupported(TemporalUnit p0);

    @objid ("1d2edeed-a21a-4001-85b7-67067bcc0b78")
    boolean isSupported(TemporalField p0);

    @objid ("046f9b97-0dfa-486e-914a-76bdbf575dbc")
    ChronoLocalDateTime minus(TemporalAmount p0);

    @objid ("1a0b9f14-f7cf-4d11-9d22-d1c891a6e671")
    ChronoLocalDateTime minus(long p0, TemporalUnit p1);

    @objid ("a40a26ed-6b72-4d53-88d8-5f0b975e3442")
    Temporal minus(TemporalAmount p0);

    @objid ("be932742-845c-49a5-8c86-aed13ee91a25")
    Temporal minus(long p0, TemporalUnit p1);

    @objid ("261cd27c-ede7-4fe8-8567-2671fefdaf71")
    Temporal plus(TemporalAmount p0);

    @objid ("11ab415e-4192-4394-85ec-c1b3c0f733be")
    Temporal plus(long p0, TemporalUnit p1);

    @objid ("bd711bf2-545d-4912-9b2c-b4e7236cff6b")
    ChronoLocalDateTime plus(TemporalAmount p0);

    @objid ("5eddfa37-fc56-4d52-8d57-0a31ddfbf514")
    ChronoLocalDateTime plus(long p0, TemporalUnit p1);

    @objid ("0ce3f94a-a964-41e5-8b5f-eef305d10158")
    Object query(TemporalQuery p0);

    @objid ("e0bda451-8077-4d82-a417-49fa3f5c6cfc")
    Comparator timeLineOrder();

    @objid ("e020846c-66ee-4d67-b6b2-d3bb8b30fb16")
    long toEpochSecond(ZoneOffset p0);

    @objid ("a515b4e1-9dec-41c7-be97-483cf2a06a3e")
    Instant toInstant(ZoneOffset p0);

    @objid ("4e76d87e-8b35-4b9a-b274-d0f613d9037b")
    ChronoLocalDate toLocalDate();

    @objid ("94168f16-8aec-4010-a6d0-946539198c5c")
    LocalTime toLocalTime();

    @objid ("02863b16-bf88-49b1-82b7-0a27c9950d36")
    String toString();

    @objid ("096ce9c4-61ac-45f5-8c0d-e4fdb13b3cbb")
    Temporal with(TemporalField p0, long p1);

    @objid ("a27589b0-74f8-48d2-a8fd-1e70eba57245")
    ChronoLocalDateTime with(TemporalField p0, long p1);

    @objid ("d8c6a6f6-f661-40a7-92ed-273e888b46e0")
    ChronoLocalDateTime with(TemporalAdjuster p0);

    @objid ("b9847074-524c-46c7-9bbb-02313a786085")
    Temporal with(TemporalAdjuster p0);

}

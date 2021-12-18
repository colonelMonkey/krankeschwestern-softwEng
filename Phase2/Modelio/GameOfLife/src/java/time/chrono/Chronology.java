package java.time.chrono;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.ResolverStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7319524d-8a97-424b-b750-2b1505b68a21")
public interface Chronology extends Comparable {
    @objid ("27d0bf8b-026d-444e-869d-acdca973c847")
    int compareTo(Object p0);

    @objid ("d73d81ac-7539-4f7c-a5ab-eb1954a1442f")
    int compareTo(Chronology p0);

    @objid ("e256dd6b-a898-44b8-9aa6-dd1b00a53794")
    ChronoLocalDate date(int p0, int p1, int p2);

    @objid ("f078e43b-e9de-412c-98a8-075970b6b8c5")
    ChronoLocalDate date(TemporalAccessor p0);

    @objid ("d3946f9c-88e8-44d0-8a6e-f165c801fc11")
    ChronoLocalDate date(Era p0, int p1, int p2, int p3);

    @objid ("0d1dfb1a-7a9e-465b-a3b0-7664b56e92c0")
    ChronoLocalDate dateEpochDay(long p0);

    @objid ("73e20897-1056-4bb6-96fc-ec492ebb6933")
    ChronoLocalDate dateNow(Clock p0);

    @objid ("39419d7a-5a84-468c-9d3e-8dee9542fa74")
    ChronoLocalDate dateNow();

    @objid ("30aed931-3f91-4f39-b3ed-c0f5017ea793")
    ChronoLocalDate dateNow(ZoneId p0);

    @objid ("40463ec3-876a-48fc-ae30-ff042ab8bd75")
    ChronoLocalDate dateYearDay(int p0, int p1);

    @objid ("19563d7a-c4ce-4ffc-b8e3-4063442b3390")
    ChronoLocalDate dateYearDay(Era p0, int p1, int p2);

    @objid ("00644d0c-ea8a-4010-b1aa-e1ca32e5ba11")
    boolean equals(Object p0);

    @objid ("61dce172-5cc0-4c61-a747-e30ab9218120")
    Era eraOf(int p0);

    @objid ("311a0008-0b67-45d3-94e8-e95e8d562367")
    List eras();

    @objid ("d8cad478-9d4c-46b5-b569-ad7f09bae65d")
    Chronology from(TemporalAccessor p0);

    @objid ("f4a9fa95-721c-4a6c-bedf-380a71aff0c9")
    Set getAvailableChronologies();

    @objid ("315ae7d0-710e-450b-a8a0-be0fedc64464")
    String getCalendarType();

    @objid ("96d82bf3-80bf-4e2a-98a7-5d8db8defb0e")
    String getDisplayName(TextStyle p0, Locale p1);

    @objid ("d7fde129-5897-4bf3-a9a5-4a69924478ae")
    String getId();

    @objid ("4a367af9-9cb9-49a9-805a-1d4195eacc95")
    int hashCode();

    @objid ("531640f6-2805-4c4e-8e47-23e42a110392")
    boolean isLeapYear(long p0);

    @objid ("2af529d6-b152-43fb-9886-fd38f88511b7")
    ChronoLocalDateTime localDateTime(TemporalAccessor p0);

    @objid ("99cdddf7-d0ac-4d52-aa90-82b243132abd")
    Chronology of(String p0);

    @objid ("fcdce219-cd97-4eb6-92b8-f5affa5acee0")
    Chronology ofLocale(Locale p0);

    @objid ("358f32d8-78fb-49f1-93a6-1ac2dfba02e7")
    ChronoPeriod period(int p0, int p1, int p2);

    @objid ("a6ec8120-7be8-44e9-b14d-e6a483784e01")
    int prolepticYear(Era p0, int p1);

    @objid ("0e5d0f07-4ceb-4dba-9e80-a53b53b69206")
    ValueRange range(ChronoField p0);

    @objid ("8f4a9035-aeba-47a2-a660-7c3e11228487")
    ChronoLocalDate resolveDate(Map p0, ResolverStyle p1);

    @objid ("93ac8bea-61f3-4bc8-918d-b1627490f006")
    String toString();

    @objid ("1fb37244-9ab4-4dce-b7aa-4c79f811f349")
    ChronoZonedDateTime zonedDateTime(Instant p0, ZoneId p1);

    @objid ("89c690ab-5416-4eb7-bb84-5807e2bf9e24")
    ChronoZonedDateTime zonedDateTime(TemporalAccessor p0);

}

package java.time.chrono;

import java.time.LocalTime;
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

@objid ("e8143008-3356-4507-bf99-ac7209cc21de")
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable {
    @objid ("e883bee2-1b43-4da0-a022-d4fd5b57d38e")
    Temporal adjustInto(Temporal p0);

    @objid ("9badd76e-51ad-42c0-9754-f95d19f07514")
    ChronoLocalDateTime atTime(LocalTime p0);

    @objid ("c3004255-e3f8-455d-934d-4af961104cbb")
    int compareTo(ChronoLocalDate p0);

    @objid ("2e7d3c5b-263f-42c3-aed5-a8d0fb2b5ffd")
    int compareTo(Object p0);

    @objid ("55549704-ee0c-414b-ac6c-03a23515f551")
    boolean equals(Object p0);

    @objid ("df5ed080-d21e-4c21-a50a-3e8338e93cd3")
    String format(DateTimeFormatter p0);

    @objid ("f2353abf-f695-4f49-b6d8-6aae223ddcaa")
    ChronoLocalDate from(TemporalAccessor p0);

    @objid ("cdcc18c1-f270-4697-909e-8e4bef2ed5e1")
    Chronology getChronology();

    @objid ("30da5e81-2ff7-49e2-aaef-aee668c7d7f3")
    Era getEra();

    @objid ("298f45dc-db20-4a8e-8408-1b06a8f683e0")
    int hashCode();

    @objid ("79778736-1610-40a2-abc9-e769aab8088b")
    boolean isAfter(ChronoLocalDate p0);

    @objid ("33e6cd07-1537-4b1a-abbe-d6c5b40a6f5a")
    boolean isBefore(ChronoLocalDate p0);

    @objid ("f152e8eb-4b40-4864-8a02-9a8c225a9d98")
    boolean isEqual(ChronoLocalDate p0);

    @objid ("5ec02110-31b4-4e2e-8468-5d2e8f35f7d8")
    boolean isLeapYear();

    @objid ("d1fc6f84-3eb9-43f2-89f6-ef1bd88f144a")
    boolean isSupported(TemporalUnit p0);

    @objid ("033054ff-5ae7-408d-a301-e5fe6dcb50e0")
    boolean isSupported(TemporalField p0);

    @objid ("be868dad-1741-4968-8f08-30dcda72584f")
    int lengthOfMonth();

    @objid ("989fb691-532d-4fc9-957a-451fd8671633")
    int lengthOfYear();

    @objid ("3c9371c1-9544-4eec-9f1c-2f33f2432000")
    Temporal minus(TemporalAmount p0);

    @objid ("8ea7f394-13fa-4eca-8df8-721e3bb9586b")
    ChronoLocalDate minus(long p0, TemporalUnit p1);

    @objid ("697d10ca-efaf-4386-81d1-3a75c93f99cd")
    ChronoLocalDate minus(TemporalAmount p0);

    @objid ("62651113-ddcc-4679-9fbf-1856a6d7eead")
    Temporal minus(long p0, TemporalUnit p1);

    @objid ("5f9817f1-cc55-4ed0-addd-262b72af02a8")
    ChronoLocalDate plus(TemporalAmount p0);

    @objid ("4cf8a43a-171b-49a3-9fd2-080a40e3bd0d")
    Temporal plus(long p0, TemporalUnit p1);

    @objid ("d8b25d46-e999-4d45-867f-a5c2f9e8b6c0")
    Temporal plus(TemporalAmount p0);

    @objid ("be645f7d-53bf-4149-863d-7f04c23e352a")
    ChronoLocalDate plus(long p0, TemporalUnit p1);

    @objid ("7a78ce2e-1582-4692-8b31-e3cfdb5bcae4")
    Object query(TemporalQuery p0);

    @objid ("1559a7b7-9759-46f1-bafa-5d50d554b29e")
    Comparator timeLineOrder();

    @objid ("441ce9c7-15c1-43d8-ab98-5dc80c098448")
    long toEpochDay();

    @objid ("ebc69955-6633-4a25-b489-57923f66ccaf")
    String toString();

    @objid ("a3601bd9-6d1f-41ca-b19f-5df728f368d7")
    ChronoPeriod until(ChronoLocalDate p0);

    @objid ("0a261502-bc14-4d0d-804f-97ce707ab711")
    long until(Temporal p0, TemporalUnit p1);

    @objid ("fcace7e6-677e-45c1-b5bf-6f9e69f8880d")
    Temporal with(TemporalField p0, long p1);

    @objid ("d0d28a78-6046-4644-bc0c-70600dd09bde")
    ChronoLocalDate with(TemporalAdjuster p0);

    @objid ("c3bb0c8f-8392-451f-943e-670d534f9575")
    ChronoLocalDate with(TemporalField p0, long p1);

    @objid ("ffead46f-bd75-4f75-9bbc-8e5cd4de1099")
    Temporal with(TemporalAdjuster p0);

}

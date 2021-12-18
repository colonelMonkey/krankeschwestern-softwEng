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
import java.time.temporal.ValueRange;
import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("228fe743-cd81-437d-bcdd-c2ecd51faecc")
public interface ChronoZonedDateTime extends Temporal, Comparable {
    @objid ("796ac271-6238-407f-864e-5b6c5555e40c")
    int compareTo(ChronoZonedDateTime p0);

    @objid ("c7066958-acba-4603-81a7-2f6c7fcad428")
    int compareTo(Object p0);

    @objid ("cda89d03-b5a3-4ef3-8547-6786d85b4609")
    boolean equals(Object p0);

    @objid ("752253ef-636b-4e44-9c43-05055ffcfe9e")
    String format(DateTimeFormatter p0);

    @objid ("7153f38f-cb05-4190-bb51-bf36da754827")
    ChronoZonedDateTime from(TemporalAccessor p0);

    @objid ("449eb783-f647-4d16-8fb7-9439a0e3ec7a")
    int get(TemporalField p0);

    @objid ("b31a611a-215f-4ba8-8be7-df5b480763f1")
    Chronology getChronology();

    @objid ("9d7771c1-de58-4351-a08e-a9f85142ff51")
    long getLong(TemporalField p0);

    @objid ("da3ef865-527e-4659-912e-230d781b9a0c")
    ZoneOffset getOffset();

    @objid ("a6beae73-64db-401f-8cfb-ad71826b9719")
    ZoneId getZone();

    @objid ("bee0596e-2d60-4e9b-b6ed-c259871bbaf7")
    int hashCode();

    @objid ("c6468eb8-02fb-423b-9c50-1c0f292ffdac")
    boolean isAfter(ChronoZonedDateTime p0);

    @objid ("cadcf163-6755-432f-97eb-66af09a7c115")
    boolean isBefore(ChronoZonedDateTime p0);

    @objid ("fc83ba0a-0a12-4aa3-b91f-f6b6b2a2eaa4")
    boolean isEqual(ChronoZonedDateTime p0);

    @objid ("e0d4e090-096b-4346-9af1-e1b1375af703")
    boolean isSupported(TemporalUnit p0);

    @objid ("9efe1b8d-e25b-41c2-9b9d-191e3669431c")
    boolean isSupported(TemporalField p0);

    @objid ("2526e793-3259-4acf-b9d7-b5bd9c366c83")
    Temporal minus(TemporalAmount p0);

    @objid ("a1dc6916-665b-4a7f-be88-72606f1c1be2")
    Temporal minus(long p0, TemporalUnit p1);

    @objid ("9f997022-8572-4cd6-b3a9-cd4653d5c04b")
    ChronoZonedDateTime minus(long p0, TemporalUnit p1);

    @objid ("95a4f847-2857-47b4-a34d-523ebf489fbd")
    ChronoZonedDateTime minus(TemporalAmount p0);

    @objid ("ee447b45-4129-4219-8f7a-cf7d77182170")
    Temporal plus(long p0, TemporalUnit p1);

    @objid ("dd98b36d-a5c5-4b76-85ec-7dc8e0b7a45f")
    Temporal plus(TemporalAmount p0);

    @objid ("5ca174d0-3c02-43fc-8f9c-457911a722d5")
    ChronoZonedDateTime plus(long p0, TemporalUnit p1);

    @objid ("258fa54c-11b6-41f1-a7ae-1f0a6b9bca36")
    ChronoZonedDateTime plus(TemporalAmount p0);

    @objid ("41869bf4-c104-48e9-b992-75acdbddc5c4")
    Object query(TemporalQuery p0);

    @objid ("0fc02b06-0afa-46dd-9b33-d65917d38d49")
    ValueRange range(TemporalField p0);

    @objid ("d99697e3-9bce-4d3f-9aa1-0e34865deeed")
    Comparator timeLineOrder();

    @objid ("0e313157-3bda-486b-bc53-db179042c9ef")
    long toEpochSecond();

    @objid ("d9378aa5-2909-459a-af7b-d03a908c5035")
    Instant toInstant();

    @objid ("570306eb-4285-46e1-a1f9-c453cdd0911b")
    ChronoLocalDate toLocalDate();

    @objid ("a1b808d5-9fb5-40d8-9f59-9df018a884ce")
    ChronoLocalDateTime toLocalDateTime();

    @objid ("ee6021bd-eb6c-40da-9cb5-b33618fa51d2")
    LocalTime toLocalTime();

    @objid ("59974b4e-74bd-4cb5-8ff9-b66c6fe6e028")
    String toString();

    @objid ("25526cda-5542-446e-8bb8-810945b5b643")
    Temporal with(TemporalField p0, long p1);

    @objid ("df77977f-3e25-4fb3-b1af-a544fc3d763b")
    Temporal with(TemporalAdjuster p0);

    @objid ("79beebbf-ea6c-40fa-9f03-583ceba9c295")
    ChronoZonedDateTime with(TemporalField p0, long p1);

    @objid ("5e4001da-1742-463e-987a-0639bcdc4cfc")
    ChronoZonedDateTime with(TemporalAdjuster p0);

    @objid ("6b8c3f6c-ab55-4d1b-8ef7-7be2d377d40d")
    ChronoZonedDateTime withEarlierOffsetAtOverlap();

    @objid ("c7394e49-a1bc-412f-840f-5a877d2d4efb")
    ChronoZonedDateTime withLaterOffsetAtOverlap();

    @objid ("98302869-03e0-42fa-a46f-a56a25d5b858")
    ChronoZonedDateTime withZoneSameInstant(ZoneId p0);

    @objid ("dac8deeb-8892-4ead-b425-1f4963734551")
    ChronoZonedDateTime withZoneSameLocal(ZoneId p0);

}

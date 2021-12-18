package java.time.temporal;

import java.time.format.ResolverStyle;
import java.util.Locale;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7f59d134-7674-44d7-a1e7-782ad58c117d")
public interface TemporalField {
    @objid ("2a5e6880-7728-425c-9c16-e34ca9a50859")
    Temporal adjustInto(Temporal p0, long p1);

    @objid ("90b67e69-04c3-4fe2-ad2f-376fe233c570")
    TemporalUnit getBaseUnit();

    @objid ("f5a2d4c4-e17e-4e76-af3a-072cb0534931")
    String getDisplayName(Locale p0);

    @objid ("ac920fe5-15aa-45bd-b725-e8ff5385e248")
    long getFrom(TemporalAccessor p0);

    @objid ("b8e2eb54-dd13-4fc4-a10b-386fada3a8c7")
    TemporalUnit getRangeUnit();

    @objid ("09e3e489-01a0-4e41-9dd9-0de0bd61320c")
    boolean isDateBased();

    @objid ("faccdc3e-2c1b-4593-b746-e4c5e2eaf0bc")
    boolean isSupportedBy(TemporalAccessor p0);

    @objid ("f1766a4b-4c76-4e00-a5bf-096a2c298546")
    boolean isTimeBased();

    @objid ("1e171b9f-877f-4b75-8630-8cab285acaa7")
    ValueRange range();

    @objid ("b94df5c0-0fb2-4a24-bda8-0391b122baad")
    ValueRange rangeRefinedBy(TemporalAccessor p0);

    @objid ("78369db9-d869-4af8-827e-34cc8e4d76ed")
    TemporalAccessor resolve(Map p0, TemporalAccessor p1, ResolverStyle p2);

    @objid ("abbabaf7-184d-4116-aa95-ea1c91b19f02")
    String toString();

}

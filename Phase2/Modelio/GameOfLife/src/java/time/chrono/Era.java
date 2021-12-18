package java.time.chrono;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.util.Locale;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60ffa980-2a26-4a20-bff9-67edda1b79ff")
public interface Era extends TemporalAccessor, TemporalAdjuster {
    @objid ("ccf171d1-a874-4fb4-ab5c-942619d33a74")
    Temporal adjustInto(Temporal p0);

    @objid ("0f06b0f6-3643-446c-a9f1-c00432755b21")
    int get(TemporalField p0);

    @objid ("4e4f5735-2d09-4443-b848-e9b0e6c7ff68")
    String getDisplayName(TextStyle p0, Locale p1);

    @objid ("a09b8722-d229-4aa2-940c-1893963c44da")
    long getLong(TemporalField p0);

    @objid ("ca7ee875-8c9b-4889-b8bb-b417947a737a")
    int getValue();

    @objid ("04e7adde-88c6-480f-98fc-7b3b24f446c6")
    boolean isSupported(TemporalField p0);

    @objid ("4cc5a493-e8dc-4175-975a-61a8c88cafe2")
    Object query(TemporalQuery p0);

    @objid ("a98f7e80-21e6-4e88-bcc9-2c48fdd92f29")
    ValueRange range(TemporalField p0);

}

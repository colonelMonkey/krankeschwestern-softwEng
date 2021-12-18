package java.sql;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e88-0000-000000000000")
public interface Driver {
    @objid ("47742b7a-eb7c-418d-a617-eba98e371a4b")
    boolean acceptsURL(String p0) throws SQLException;

    @objid ("4950a04c-8ee5-4235-8f73-4e3c01cbf06c")
    Connection connect(String p0, Properties p1) throws SQLException;

    @objid ("269f76e4-00ab-4924-9241-3b2258b2c354")
    int getMajorVersion();

    @objid ("1c57b694-dce4-4818-ae4e-44713228233c")
    int getMinorVersion();

    @objid ("c525f3fc-1cdc-436e-832b-e127f1eae7c7")
    Logger getParentLogger() throws SQLFeatureNotSupportedException;

    @objid ("b5eefbec-99d8-439e-8138-428b546ac539")
    List<DriverPropertyInfo> getPropertyInfo(String p0, Properties p1) throws SQLException;

    @objid ("d1eeaa9e-702a-495c-9b16-2ea5c6e8f62b")
    boolean jdbcCompliant();

}

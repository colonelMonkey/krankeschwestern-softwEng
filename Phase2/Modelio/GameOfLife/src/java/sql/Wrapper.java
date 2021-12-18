package java.sql;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1d33-0000-000000000000")
public interface Wrapper {
    @objid ("70b3e6d7-d3af-4ca3-a764-df4b06043b49")
    boolean isWrapperFor(Class p0) throws SQLException;

    @objid ("54748881-bb6c-4f60-b9ce-411f06e2260d")
    Object unwrap(Class p0) throws SQLException;

}

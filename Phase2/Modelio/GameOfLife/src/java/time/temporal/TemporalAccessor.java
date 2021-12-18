package java.time.temporal;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("91a5d669-8217-4f90-b6a3-80d8b4bab1a0")
public interface TemporalAccessor {
    @objid ("b6dfd499-e889-4299-a46f-8c0bd756bdb2")
    int get(TemporalField p0);

    @objid ("dc784a05-f1cf-4479-81f6-012fb22c3d30")
    long getLong(TemporalField p0);

    @objid ("3bba407e-8cde-40ad-b195-ed8f613e91b9")
    boolean isSupported(TemporalField p0);

    @objid ("75671608-b17e-4ae1-9535-78755035168f")
    Object query(TemporalQuery p0);

    @objid ("2a981f90-9ce7-4bea-af37-c6518fc5e52e")
    ValueRange range(TemporalField p0);

}

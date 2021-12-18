package java.lang.reflect;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ad1-0000-000000000000")
public interface WildcardType extends Type {
    @objid ("15b715df-1626-4711-adbb-13ac1e7ecd13")
    List<Type> getLowerBounds();

    @objid ("5fc2d0cd-2e6d-464d-be3a-b504f639706f")
    List<Type> getUpperBounds();

}

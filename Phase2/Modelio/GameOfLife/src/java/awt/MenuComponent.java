package java.awt;

import java.io.Serializable;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleSelection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-299a-0000-000000000000")
public abstract class MenuComponent implements Serializable {
    @objid ("ce04114c-9763-45f8-a860-cd88aa51cee3")
    protected abstract class AccessibleAWTMenuComponent extends AccessibleContext implements Serializable, AccessibleComponent, AccessibleSelection {
    }

}

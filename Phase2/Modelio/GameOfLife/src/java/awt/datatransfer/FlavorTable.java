package java.awt.datatransfer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2928-0000-000000000000")
public interface FlavorTable extends FlavorMap {
    @objid ("17efda18-4502-4f8e-ba00-441575e3ff92")
    List getFlavorsForNative(String p0);

    @objid ("de0a0395-d109-4d68-a342-693a8ad95207")
    List getNativesForFlavor(DataFlavor p0);

}

package java.awt.datatransfer;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-292b-0000-000000000000")
public interface FlavorMap {
    @objid ("56ca1a22-a9b8-43fb-b4b7-5098cf6d46c1")
    Map getFlavorsForNatives(List<String> p0);

    @objid ("5c4567fb-82d1-4a58-887c-3c2966149abb")
    Map getNativesForFlavors(List<DataFlavor> p0);

}

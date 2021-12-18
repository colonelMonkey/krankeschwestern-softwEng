package java.awt.datatransfer;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-292c-0000-000000000000")
public interface FlavorListener extends EventListener {
    @objid ("5b0ea21f-8192-44e4-8649-5fec9786c98a")
    void flavorsChanged(FlavorEvent p0);

}

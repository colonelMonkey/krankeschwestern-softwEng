package java.util.spi;

import java.util.ResourceBundle.Control;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2fc5e011-b30b-43e8-88f9-7fc4f468c924")
public interface ResourceBundleControlProvider {
    @objid ("e1f69f31-77e4-4638-a137-3ca571417349")
    Control getControl(String p0);

}

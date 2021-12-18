package java.beans.beancontext;

import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.io.Serializable;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2a5c-0000-000000000000")
public class BeanContextSupport extends BeanContextChildSupport implements BeanContext, Serializable, PropertyChangeListener, VetoableChangeListener {
    @objid ("475d6b04-0022-46fb-8fdd-cec6669e9def")
    protected class BCSChild implements Serializable {
    }

    @objid ("a9623219-1670-4aa0-b980-b620323c660e")
    protected static final class BCSIterator implements Iterator {
    }

}

package java.awt;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleSelection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-29aa-0000-000000000000")
public class List extends Component implements ItemSelectable, Accessible {
    @objid ("e8d79568-9260-45d4-8f54-0a5ca2cef7ca")
    protected class AccessibleAWTList extends AccessibleAWTComponent implements AccessibleSelection, ItemListener, ActionListener {
        @objid ("d44ed083-151f-4370-a0f5-42a87b49363b")
        protected class AccessibleAWTListChild extends AccessibleAWTComponent implements Accessible {
        }

    }

}

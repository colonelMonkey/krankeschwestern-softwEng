package javax.swing;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-231b-0000-000000000000")
public class ToolTipManager extends MouseAdapter implements MouseMotionListener {
    @objid ("eb385a2f-1c93-423e-816f-cc66cfa5ab76")
    protected class insideTimerAction implements ActionListener {
    }

    @objid ("cfa5639b-ffe7-4f94-bd87-d859caa339bb")
    protected class outsideTimerAction implements ActionListener {
    }

    @objid ("3ea4f7e8-cbca-41ae-bcbb-304cc4ab0d21")
    protected class stillInsideTimerAction implements ActionListener {
    }

}

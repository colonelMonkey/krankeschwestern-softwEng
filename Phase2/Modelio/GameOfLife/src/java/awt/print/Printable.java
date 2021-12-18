package java.awt.print;

import java.awt.Graphics;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28fb-0000-000000000000")
public interface Printable {
    @objid ("453d6b8e-d8e3-4f88-a88f-601955427c87")
    int print(Graphics p0, PageFormat p1, int p2) throws PrinterException;

}

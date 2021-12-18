package java.awt.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2857-0000-000000000000")
public interface MouseListener extends EventListener {
    @objid ("546ece1b-b66d-4e40-80c0-ceec97d73e2f")
    void mouseClicked(MouseEvent p0);

    @objid ("05615bdf-70cf-4524-9d95-4ee9f58b1e92")
    void mouseEntered(MouseEvent p0);

    @objid ("82422961-c9e3-4ffb-8649-8cd5dc73b9a6")
    void mouseExited(MouseEvent p0);

    @objid ("d091c1fd-29b4-4d71-8f0b-e1d726c34a74")
    void mousePressed(MouseEvent p0);

    @objid ("4a074451-baf4-42b7-88ee-dc6894254ce0")
    void mouseReleased(MouseEvent p0);

}

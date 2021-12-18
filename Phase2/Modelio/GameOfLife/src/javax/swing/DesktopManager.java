package javax.swing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2430-0000-000000000000")
public interface DesktopManager {
    @objid ("daa2bb08-e6b3-466b-b4a0-656c762507ea")
    void activateFrame(JInternalFrame p0);

    @objid ("83db0319-3e95-412b-8bc7-21ee4f462a41")
    void beginDraggingFrame(JComponent p0);

    @objid ("a6c43251-fafa-4c3e-9d3f-952d43e80683")
    void beginResizingFrame(JComponent p0, int p1);

    @objid ("1a583eb9-8db0-498c-aae1-4ef473c73fed")
    void closeFrame(JInternalFrame p0);

    @objid ("b3c1c239-6cca-4229-a7c4-a2baa3e9a3fe")
    void deactivateFrame(JInternalFrame p0);

    @objid ("969c305e-312c-40e3-a2f9-781c2f450747")
    void deiconifyFrame(JInternalFrame p0);

    @objid ("af184727-de8f-4299-a8d4-41b6c3e1ca02")
    void dragFrame(JComponent p0, int p1, int p2);

    @objid ("fa2e4bc0-62dd-44ad-bf01-4d1b72aa24f9")
    void endDraggingFrame(JComponent p0);

    @objid ("8d0b5ae0-0bbc-4c5e-86cc-6ecc87f0657c")
    void endResizingFrame(JComponent p0);

    @objid ("ab69f47e-1988-44d2-b4dd-8ca687272545")
    void iconifyFrame(JInternalFrame p0);

    @objid ("096f18c1-1634-48d0-9e6c-adc1cfb138fd")
    void maximizeFrame(JInternalFrame p0);

    @objid ("b20c6079-af3c-4f7f-ba6b-dee08fd59736")
    void minimizeFrame(JInternalFrame p0);

    @objid ("391141dd-d6b8-4eb9-b2f3-2204fa69cf74")
    void openFrame(JInternalFrame p0);

    @objid ("567d41b5-a9dd-4a97-830e-1f560f629af1")
    void resizeFrame(JComponent p0, int p1, int p2, int p3, int p4);

    @objid ("38720c74-ec76-4713-b04a-7000c4aff7a6")
    void setBoundsForFrame(JComponent p0, int p1, int p2, int p3, int p4);

}

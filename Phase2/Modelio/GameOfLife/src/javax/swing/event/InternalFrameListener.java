package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2366-0000-000000000000")
public interface InternalFrameListener extends EventListener {
    @objid ("bb07c1af-eecd-481a-8348-c13b986f9c10")
    void internalFrameActivated(InternalFrameEvent p0);

    @objid ("5e4ad494-793c-4859-a056-0781a7891d8c")
    void internalFrameClosed(InternalFrameEvent p0);

    @objid ("b2916636-98c8-4eef-8fd1-17eb940e52c2")
    void internalFrameClosing(InternalFrameEvent p0);

    @objid ("bdfd7ab7-1bd1-444d-a444-3121aa551739")
    void internalFrameDeactivated(InternalFrameEvent p0);

    @objid ("1ddb7025-a3cb-47b7-a2fc-5d06256cbed9")
    void internalFrameDeiconified(InternalFrameEvent p0);

    @objid ("8f5d2a6d-1992-44d8-a7d6-c71c7720fe32")
    void internalFrameIconified(InternalFrameEvent p0);

    @objid ("fafa1b2d-7d6e-491f-9b7e-4d40bbd7cf61")
    void internalFrameOpened(InternalFrameEvent p0);

}

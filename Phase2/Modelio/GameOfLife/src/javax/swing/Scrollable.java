package javax.swing;

import java.awt.Dimension;
import java.awt.Rectangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-24c0-0000-000000000000")
public interface Scrollable {
    @objid ("34b779e1-64a5-4018-bce1-1e29decefd37")
    Dimension getPreferredScrollableViewportSize();

    @objid ("36114620-dd5a-422e-b014-a147f903045b")
    int getScrollableBlockIncrement(Rectangle p0, int p1, int p2);

    @objid ("95358163-3aa5-4dae-a4c8-2db0db5e7da2")
    boolean getScrollableTracksViewportHeight();

    @objid ("65bda32c-f75b-4060-8472-950f6d4bd868")
    boolean getScrollableTracksViewportWidth();

    @objid ("d5cc0d89-522c-4068-950a-ef51b7311ac9")
    int getScrollableUnitIncrement(Rectangle p0, int p1, int p2);

}

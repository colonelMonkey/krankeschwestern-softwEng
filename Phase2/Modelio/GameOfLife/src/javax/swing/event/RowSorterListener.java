package javax.swing.event;

import java.util.EventListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-17d0-0000-000000000000")
public interface RowSorterListener extends EventListener {
    @objid ("db09dc17-fc95-424a-8182-aad73a03fd2e")
    void sorterChanged(RowSorterEvent p0);

}

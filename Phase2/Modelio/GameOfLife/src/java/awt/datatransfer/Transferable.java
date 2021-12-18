package java.awt.datatransfer;

import java.io.IOException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2924-0000-000000000000")
public interface Transferable {
    @objid ("b635b358-fd26-4ee2-84cf-b60b58793632")
    Object getTransferData(DataFlavor p0) throws IOException, UnsupportedFlavorException;

    @objid ("f8f3be73-45e0-4a27-ba75-4801c56588b9")
    List<DataFlavor> getTransferDataFlavors();

    @objid ("d58eb4b8-a281-459f-9be1-42749be6dd8f")
    boolean isDataFlavorSupported(DataFlavor p0);

}

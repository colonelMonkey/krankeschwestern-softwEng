package spielfeldeditor;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import zufallsgenerator.ZufallsgeneratorPrototyp;

@objid ("f78a3a97-f7c7-4a09-8afe-4d0e0e9693b5")
public class Spielfeldeditor implements SpielfeldeditorSchnittstelle {
    @objid ("1d1cb355-c32e-4232-86d6-5e84a8e7cc57")
     File geladen;

    @objid ("eab2e5ef-8899-4880-9384-1a58558c9757")
    public Spielfeldeditor() {
        // TODO Auto-generated constructor stub
    }

    @objid ("a654de20-1733-4e8e-877c-d1b7665a2bc9")
    @Override
    public ZufallsgeneratorPrototyp getZufallsgenerator() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("c4ef63d8-a027-4f93-9fed-eecbcc37562d")
    @Override
    public void se_laden() {
        // TODO Auto-generated method stub
    }

    @objid ("12c8a590-b516-43e0-afc8-6a3178918483")
    @Override
    public void se_einfuegen() {
        // TODO Auto-generated method stub
    }

    @objid ("19cee913-5c05-4364-9e9a-e56d0a52d7f4")
    @Override
    public void se_speichern() {
        // TODO Auto-generated method stub
    }

    @objid ("b09a7b3d-0c10-467c-bd20-3ceb2506ca57")
    @Override
    public void setGroeße(int x, int y) {
        // TODO Auto-generated method stub
    }

    @objid ("08daade4-20a4-481f-a2b7-bd123f19b420")
    @Override
    public void fuelleZufall() {
        // TODO Auto-generated method stub
    }

    @objid ("0a2892e1-391f-42be-aec3-3b8824b17ed0")
    @Override
    public void clear() {
        // TODO Auto-generated method stub
    }

}

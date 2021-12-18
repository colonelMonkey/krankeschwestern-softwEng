package regeleditor;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import zufallsgenerator.ZufallsgeneratorPrototyp;

@objid ("f92e6ef1-569c-46e1-929d-64fc4bfb5ab1")
public class Regeleditor implements RegeleditorSchnittstelle {
    @objid ("c6fc25dc-8059-4dae-a245-cad25a89e43a")
     File geladen;

    @objid ("bfb0a1c8-2116-4af6-9a8b-dafa72db1721")
     boolean topologie;

    @objid ("b2a3432d-62aa-4de5-aa6c-39afb2275a4e")
     ZufallsgeneratorPrototyp random;

    @objid ("f0df0c99-d976-41ac-942a-8a061fd82991")
    public Regeleditor() {
        // TODO Auto-generated constructor stub
    }

    @objid ("b5448ac5-0d6e-41c7-a2f0-60db5c1f5bd7")
    @Override
    public void re_laden() {
        // TODO Auto-generated method stub
    }

    @objid ("656b50f7-8387-4d23-be96-13d170d7be5c")
    @Override
    public void re_speichern() {
        // TODO Auto-generated method stub
    }

    @objid ("28c6b7ff-92fd-4f3d-8d93-1a33e4b886dc")
    @Override
    public boolean getTopo() {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("4c11476a-4e1d-411d-826e-4e9b85acd55f")
    @Override
    public void regelDialog() {
        // TODO Auto-generated method stub
    }

    @objid ("56b40ae4-8c7f-4a3f-823a-26e20763e60a")
    @Override
    public String getRegel() {
        // TODO Auto-generated method stub
        return null;
    }

}

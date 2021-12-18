package lupe;

import javax.swing.JSpinner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import farbmapper.FarbMapSchnittstelle;

@objid ("274ff26e-3756-4da1-838d-c9180083fe21")
public class FeldLupe implements FeldLupenSchnittstelle {
    @objid ("f8b4fe83-aa39-46ff-b7af-68a534735398")
    private int speicher;

    @objid ("e1a38113-a916-4363-9e4b-553452495856")
    private boolean modus;

    @objid ("bd444908-20ba-4b52-a34a-5da6cf07ea2f")
    private FarbMapSchnittstelle faerber;

    @objid ("005a1d59-6032-4fcf-a33c-ba513d974bdd")
    public FeldLupe() {
        // TODO Auto-generated constructor stub
    }

    @objid ("189f40b3-0f02-4c05-9677-2febc485386f")
    @Override
    public void machWas(int x, int y) {
        // TODO Auto-generated method stub
    }

}

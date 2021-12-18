package zufallsgenerator;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a044c54a-8c0e-47af-a700-c79ed707976c")
public abstract class ZufallsgeneratorPrototyp {
    @objid ("54e1b397-ccbc-479f-8b0a-36cd93bdc4df")
    public TableDialog tDia;

    @objid ("a7c3647b-bf2a-4b1a-8125-72c0c4016943")
    public ZufallsgeneratorPrototyp() {
    }

    @objid ("f1e18ad3-2835-4540-bf99-4766cdff9e40")
    public abstract int getRnd();

    @objid ("806bf7b9-c081-4cdd-8203-7350fd6cce0e")
    public abstract void setSeed();

    @objid ("ccff5b6f-63bf-4406-a4e4-f7946b144be6")
    public abstract int getSeed();

    @objid ("fef8bc73-9faf-40f1-9356-10b4e05970ab")
    public abstract void resetSequence();

    @objid ("bfe3b4d4-fe4b-4b00-9a82-72514f43c882")
    public abstract void showDialog();

    @objid ("fd162136-f069-49d6-8f66-a022b52768f8")
    public abstract void forceClose();

}

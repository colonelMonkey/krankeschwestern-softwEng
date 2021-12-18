package spielfeldeditor;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import zufallsgenerator.ZufallsgeneratorPrototyp;

@objid ("3abd21dd-6086-4353-9cfa-7ae2975b158b")
public interface SpielfeldeditorSchnittstelle {
    @objid ("671d2250-8371-4e6b-90f3-d2a7450613dd")
    ZufallsgeneratorPrototyp getZufallsgenerator();

    @objid ("330b23f1-4060-4b04-bbbf-21aaba5c75ef")
    void se_laden();

    @objid ("d39c1c80-c377-4863-b200-a83cec990f75")
    void se_einfuegen();

    @objid ("79f9048f-b8d7-4d51-9a65-e4e4bf1d4f90")
    void se_speichern();

    @objid ("cda55f52-1459-4d78-b948-21ac60f11906")
    void setGroeße(int x, int y);

    @objid ("fd012be1-5c6b-42e5-9f40-fcbbedb96804")
    void fuelleZufall();

    @objid ("cbdd7742-db76-49ce-a962-5a593d7a2b17")
    void clear();

}

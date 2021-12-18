package hauptPaket;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cae9c6fb-2dda-4a57-a24a-eb44b09f5063")
public interface FeldGrafikSchittstelle {
    @objid ("2bfc76f5-b045-4edd-8d5c-c3bdd1236427")
    void clickAuf(intx ,int y)();

    @objid ("3a044218-c1a1-4873-aec9-2b4bef6ec5f5")
    void zoom();

    @objid ("df2ed321-b7a6-4b36-8619-3829edaf1a4e")
    void pan();

}

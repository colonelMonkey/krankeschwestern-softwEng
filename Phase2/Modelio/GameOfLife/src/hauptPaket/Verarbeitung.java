package hauptPaket;

import arbeiter.MalerarbeiterSchnittstelle;
import arbeiter.RegelarbeiterSchnittstelle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import lupe.FeldLupenSchnittstelle;
import regeleditor.RegeleditorSchnittstelle;
import spielfeldeditor.SpielfeldeditorSchnittstelle;

@objid ("421cbaa3-13d5-4753-a7fd-d92eb8fed8a1")
public class Verarbeitung {
    @objid ("9c20e098-d2ff-40fd-a517-9624090d1942")
     static boolean aktiv = false;

    @objid ("ad988abc-a302-416e-8ffb-05df10a13f1f")
     static int verzoegerung;

    @objid ("be69f0a8-4d20-446b-be69-fdc348578228")
     static SpielfeldeditorSchnittstelle spEdit;

    @objid ("c9e1cd78-b55c-4582-8734-1a6154fbd5cf")
     static RegeleditorSchnittstelle rgEdit;

    @objid ("4a8a5ac3-a626-41a4-89a5-b257fa6745e1")
     static RegelarbeiterSchnittstelle rgWorker; // Später liste für multicore

    @objid ("f5d07290-d134-40aa-92fb-7a1f5f0bf865")
     static MalerarbeiterSchnittstelle ptWorker; // Später liste für multicore

    @objid ("0d0d574e-81ed-4ec0-8068-dfbaaf8cc8a6")
     static FeldLupenSchnittstelle lupe;

    @objid ("3cb0cf81-0224-4b11-b5d5-f965c66ed294")
    public MainPanel mainPanel;

    @objid ("5d6027e0-cbfe-476a-a397-e5f1c05e03fe")
    private Verarbeitung() {
    }

    @objid ("2d39f34e-cf22-4719-80d8-3bff5a905231")
    static void schalteSimulation() {
    }

    @objid ("ac8b2c46-a33c-40ed-8a55-58899174a68d")
    static void einzelSimulation() {
    }

    @objid ("c88a7380-e496-4ea0-9f8e-fd9396d3b09e")
    static void aktualisiereVerzoegerung() {
    }

}

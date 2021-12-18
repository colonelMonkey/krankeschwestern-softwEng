package farbmapper;

import java.awt.Color;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9bed0307-a778-4ca1-9baf-2ceede7f2047")
public interface FarbMapSchnittstelle {
    @objid ("17c6034f-eaac-467a-ad29-622bfe2a90f9")
    Color getFarbe(int zustand);

    @objid ("8dc6b1d3-751d-44e0-82bb-d53c0acde373")
    void farbverlaufDialog();

}

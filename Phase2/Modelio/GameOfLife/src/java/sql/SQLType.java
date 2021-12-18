package java.sql;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c5a53469-833d-4e36-a625-439c0157232c")
public interface SQLType {
    @objid ("11a313b6-3375-4d70-b017-915ad2c03e81")
    String getName();

    @objid ("34b9788c-2f68-484b-8ae5-8516d4379583")
    String getVendor();

    @objid ("f8d3e21b-ea04-4794-95ed-448304812a04")
    Integer getVendorTypeNumber();

}

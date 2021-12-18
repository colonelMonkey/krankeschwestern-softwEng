package java.security.cert;

import java.util.Iterator;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2728-0000-000000000000")
public interface PolicyNode {
    @objid ("7aa8fd96-c8db-4b62-a70a-2ba7a0d01d3b")
    Iterator getChildren();

    @objid ("149afcca-3528-4866-9578-12dd65993c64")
    int getDepth();

    @objid ("ea194769-5f4d-4237-8d31-f584d85eb29c")
    Set getExpectedPolicies();

    @objid ("2be92602-0b9c-494f-a359-f14e98671476")
    PolicyNode getParent();

    @objid ("e3c479fe-3094-4048-a20c-f222e086c3d4")
    Set getPolicyQualifiers();

    @objid ("d2701812-a148-42af-a2bd-2ebf2dbd4ee5")
    String getValidPolicy();

    @objid ("5b0f864a-9abe-409a-b1f6-11448d2c9926")
    boolean isCritical();

}

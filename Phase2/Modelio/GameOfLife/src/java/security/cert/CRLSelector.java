package java.security.cert;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2727-0000-000000000000")
public interface CRLSelector extends Cloneable {
    @objid ("a6b7ec3a-3e53-45d4-87ea-e9ce5eded9a8")
    Object clone();

    @objid ("dc99137a-8b09-4312-9009-6b91542820ff")
    boolean match(CRL p0);

}

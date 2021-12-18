package java.util.concurrent.locks;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2bbe-0000-000000000000")
public interface ReadWriteLock {
    @objid ("ded7501f-9604-446b-be63-112a4271358c")
    Lock readLock();

    @objid ("3c3ca1a1-dfc4-43b1-8bc5-166308e18121")
    Lock writeLock();

}

package java.lang.management;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae2-0000-000000000000")
public interface ClassLoadingMXBean extends PlatformManagedObject {
    @objid ("ef1aeb12-cf74-497d-a89e-5e6005a43879")
    int getLoadedClassCount();

    @objid ("86c48f87-ca10-489e-9153-97cc38769306")
    long getTotalLoadedClassCount();

    @objid ("1d37ec54-f02d-4691-b423-d1b5f559adbb")
    long getUnloadedClassCount();

    @objid ("c46f9d2e-5849-4e2e-8904-18a62a1520c8")
    boolean isVerbose();

    @objid ("f60498a2-3ef1-4515-9a1b-1f7599fac676")
    void setVerbose(boolean p0);

}

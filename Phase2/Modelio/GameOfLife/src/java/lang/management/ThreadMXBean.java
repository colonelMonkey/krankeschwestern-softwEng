package java.lang.management;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae9-0000-000000000000")
public interface ThreadMXBean extends PlatformManagedObject {
    @objid ("58ed86e8-e701-4f70-abe5-effdd89477fc")
    List<ThreadInfo> dumpAllThreads(boolean p0, boolean p1);

    @objid ("f1c7570d-74fe-40f3-a733-037f8aed0cbe")
    List<Long> findDeadlockedThreads();

    @objid ("92fa858a-4098-4883-b93a-a69d77438192")
    List<Long> findMonitorDeadlockedThreads();

    @objid ("c4735560-73fa-47fa-8ce7-6c7bc0e3721d")
    List<Long> getAllThreadIds();

    @objid ("af1b57b7-446e-4a79-9a6c-564e444933f7")
    long getCurrentThreadCpuTime();

    @objid ("0cf14c55-d2f2-4df9-be21-1180ef5e9e23")
    long getCurrentThreadUserTime();

    @objid ("81386b5f-a965-4040-b24f-0f2ad7683e51")
    int getDaemonThreadCount();

    @objid ("a76f1834-5a35-4d98-8585-0efce55b9c14")
    int getPeakThreadCount();

    @objid ("74fab86b-d7ac-4cf1-bdf1-110128a126c6")
    int getThreadCount();

    @objid ("c32cca49-b26a-499c-bdfa-f8eb48ae82fb")
    long getThreadCpuTime(long p0);

    @objid ("44fcc9df-5ae5-42cf-a728-2ef98b69cc9d")
    List<ThreadInfo> getThreadInfo(List<Long> p0);

    @objid ("79e319ce-6ae3-41f9-8810-7fa83dc463ef")
    ThreadInfo getThreadInfo(long p0, int p1);

    @objid ("f04ec905-9e32-4c5a-8c9d-bbd3d681d009")
    List<ThreadInfo> getThreadInfo(List<Long> p0, int p1);

    @objid ("ebebd62d-8472-4bfd-81da-e6ed249bf3ba")
    List<ThreadInfo> getThreadInfo(List<Long> p0, boolean p1, boolean p2);

    @objid ("a21685c8-54e2-4564-b9dc-fb7975c73b3e")
    ThreadInfo getThreadInfo(long p0);

    @objid ("db96a9fb-2bab-4851-a23f-b2e6a2e2cd11")
    long getThreadUserTime(long p0);

    @objid ("5ba1bdbb-e6a4-45db-8ed5-f2d6cfbd098a")
    long getTotalStartedThreadCount();

    @objid ("24e7c458-6959-4499-9ffe-4ac74bf786e9")
    boolean isCurrentThreadCpuTimeSupported();

    @objid ("96712fbf-235c-4660-a6c5-ba19a7577997")
    boolean isObjectMonitorUsageSupported();

    @objid ("6aa13809-cee7-45fc-88e2-1d27b3705add")
    boolean isSynchronizerUsageSupported();

    @objid ("63e1358c-cf4b-4c94-a7a1-1d209ca5ca3e")
    boolean isThreadContentionMonitoringEnabled();

    @objid ("a43ab720-8079-41e7-ae35-3a2dcb68431c")
    boolean isThreadContentionMonitoringSupported();

    @objid ("7a816e22-44f9-4efb-832b-b3ec668d1b4c")
    boolean isThreadCpuTimeEnabled();

    @objid ("ae744b0f-b67e-4d87-adb6-753261d597d5")
    boolean isThreadCpuTimeSupported();

    @objid ("2c8c79a4-dfed-485c-9e57-77c0daab8c9f")
    void resetPeakThreadCount();

    @objid ("a8ed3c58-255d-40d8-8d42-9bd1e0ac8ad0")
    void setThreadContentionMonitoringEnabled(boolean p0);

    @objid ("9bda360c-3160-4a84-97eb-db16e28681af")
    void setThreadCpuTimeEnabled(boolean p0);

}

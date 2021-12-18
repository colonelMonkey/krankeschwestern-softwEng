package java.lang.management;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ae3-0000-000000000000")
public interface MemoryPoolMXBean extends PlatformManagedObject {
    @objid ("24953f1f-39ac-4391-9700-b2733b379ef8")
    MemoryUsage getCollectionUsage();

    @objid ("135f41a1-e1fa-4868-a4e7-c06e93a0662c")
    long getCollectionUsageThreshold();

    @objid ("64fb19d1-3ad1-4f1b-95b8-7234a5863877")
    long getCollectionUsageThresholdCount();

    @objid ("fbd0f5be-ed20-42a0-8ad7-97e4ecef27da")
    List<String> getMemoryManagerNames();

    @objid ("a7e2cb4e-94af-4121-862b-e86a1a1743f5")
    String getName();

    @objid ("38fe6690-068a-4001-9a4d-dc05426e2806")
    MemoryUsage getPeakUsage();

    @objid ("ebadd83b-c4a9-4787-b27b-c9815c316ef7")
    MemoryType getType();

    @objid ("9ae2b50c-3df9-42a2-abb5-6ffa320a0acb")
    MemoryUsage getUsage();

    @objid ("ffc81aa3-310d-4bcd-8064-e765c08addd2")
    long getUsageThreshold();

    @objid ("0d37c1a3-7779-494b-a922-c1d727a5c8be")
    long getUsageThresholdCount();

    @objid ("66e1b79f-fe95-4144-a8c8-ed1eb8abb540")
    boolean isCollectionUsageThresholdExceeded();

    @objid ("c36693cb-d766-4f68-89ba-a876c1876fdd")
    boolean isCollectionUsageThresholdSupported();

    @objid ("81a02e6f-f74b-45b0-8046-abe9761a5b51")
    boolean isUsageThresholdExceeded();

    @objid ("2362d2e6-86e7-422d-aa73-12de54dac2db")
    boolean isUsageThresholdSupported();

    @objid ("04ebe426-f9a6-4f6e-86a0-b17ca7321aa3")
    boolean isValid();

    @objid ("340ceacd-95c1-4d60-b8b1-719629c938a5")
    void resetPeakUsage();

    @objid ("c86075fa-7d33-4150-a8d0-cb842f6814e4")
    void setCollectionUsageThreshold(long p0);

    @objid ("5588aac1-b5db-45d5-9791-492e26bec59a")
    void setUsageThreshold(long p0);

}
